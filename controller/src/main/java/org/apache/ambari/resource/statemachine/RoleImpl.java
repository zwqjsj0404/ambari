/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.ambari.resource.statemachine;

import java.util.List;
import java.util.Set;

import org.apache.ambari.common.state.SingleArcTransition;
import org.apache.ambari.common.state.StateMachine;
import org.apache.ambari.common.state.StateMachineFactory;
import org.apache.ambari.event.EventHandler;

public class RoleImpl implements Role, EventHandler<RoleEvent> {

  private RoleState myState;
  private String roleName;
  private List<String> hosts;
  private Service service;
  
  /* The state machine for the service looks like:
   * INACTIVE --S_START--> STARTING --S_START_SUCCESS--> ACTIVE
   *                                --S_START_FAILURE--> FAIL
   * ACTIVE --S_STOP--> STOPPING --S_STOP_SUCCESS--> INACTIVE
   *                             --S_STOP_FAILURE--> UNCLEAN_STOP
   * FAIL --S_STOP--> STOPPING --S_STOP_SUCCESS--> INACTIVE
   *                           --S_STOP_FAILURE--> UNCLEAN_STOP
   */
  
  private static final StateMachineFactory 
  <RoleImpl, RoleState, RoleEventType, RoleEvent> stateMachineFactory 
         = new StateMachineFactory<RoleImpl, RoleState, RoleEventType, 
         RoleEvent>(RoleState.INACTIVE)
         .addTransition(RoleState.INACTIVE, RoleState.STARTING, RoleEventType.S_START, new RoleStartTransition())
         .addTransition(RoleState.STARTING, RoleState.ACTIVE, RoleEventType.S_START_SUCCESS, new SuccessStartTransition())
         .addTransition(RoleState.STARTING, RoleState.FAIL, RoleEventType.S_START_FAILURE)
         .addTransition(RoleState.ACTIVE, RoleState.STOPPING, RoleEventType.S_STOP)
         .addTransition(RoleState.STOPPING, RoleState.INACTIVE, RoleEventType.S_STOP_SUCCESS)
         .addTransition(RoleState.STOPPING, RoleState.UNCLEAN_STOP, RoleEventType.S_STOP_FAILURE)
         .addTransition(RoleState.FAIL, RoleState.STOPPING, RoleEventType.S_STOP)
         .addTransition(RoleState.STOPPING, RoleState.INACTIVE, RoleEventType.S_STOP_SUCCESS)
         .addTransition(RoleState.STOPPING, RoleState.UNCLEAN_STOP, RoleEventType.S_STOP_FAILURE)
         .installTopology();
  
  private final StateMachine<RoleState, RoleEventType, RoleEvent>
      stateMachine;
  
  public RoleImpl(Service service, String roleName, Set<String> hosts) {
    this.roleName = roleName;
    this.service = service;
    this.myState = RoleState.INACTIVE;
    stateMachine = stateMachineFactory.make(this);
  }
  
  public StateMachine getStateMachine() {
    return stateMachine;
  }
  
  @Override
  public RoleState getRoleState() {
    return stateMachine.getCurrentState();
  }

  @Override
  public String getRoleName() {
    return roleName;
  }

  @Override
  public void handle(RoleEvent event) {
    getStateMachine().doTransition(event.getType(), event);
  }

  @Override
  public Service getAssociatedService() {
    return service;
  }
  
  public void addHosts(List<String> hosts) {
    this.hosts.addAll(hosts);
  }
  
  static class RoleStartTransition implements 
  SingleArcTransition<RoleImpl, RoleEvent>  {

    @Override
    public void transition(RoleImpl operand, RoleEvent event) {
      //load the plugin and get the command for starting the role 
    }
  }
  
  static class SuccessStartTransition implements 
  SingleArcTransition<RoleImpl, RoleEvent>  {

    @Override
    public void transition(RoleImpl operand, RoleEvent event) {
      ServiceImpl service = (ServiceImpl)operand.getAssociatedService();
      StateMachineInvoker.getAMBARIEventHandler().handle(
       new ServiceEvent(ServiceEventType.S_ROLE_STARTED, service, operand));
    }
  }

  @Override
  public void activate() {
    //load the plugin and get the commands for starting the role
  }

  @Override
  public void deactivate() {
    //load the plugin and get the commands for stopping the role
  }
}