/*
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
package org.apache.ambari.common.rest.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for ClusterType complex type.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDefinition", propOrder = {
    "name",
    "description",
    "blueprintName",
    "goalState",
    "activeServices",
    "nodeRangeExpressions",
    "roleToNodesMap"
})
@XmlRootElement(name = "ClusterDefinition")
public class ClusterDefinition {
        
        public static final String GOAL_STATE_ACTIVE = "ACTIVE";
        public static final String GOAL_STATE_INACTIVE = "INACTIVE";
        public static final String GOAL_STATE_ATTIC = "ATTIC";
   
        @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
        @XmlElement(name = "BlueprintName", required = true)
    protected String blueprintName;
        @XmlElement(name = "GoalState", required = true)
        protected String goalState;
        @XmlElement(name = "ActiveServices", required = true)
        protected List<String> activeServices;
        @XmlElement(name = "NodeRangeExpressions", required = true)
        protected List<String> nodeRangeExpressions;
        @XmlElement(name = "RoleToNodesMap", required = true)
        protected RoleToNodesMap roleToNodesMap;
        
        
        /**
         * @return the name
         */
        public String getName() {
                return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
                this.name = name;
        }

        /**
         * @return the description
         */
        public String getDescription() {
                return description;
        }

        /**
         * @param description the description to set
         */
        public void setDescription(String description) {
                this.description = description;
        }

        /**
         * @return the blueprintName
         */
        public String getBlueprintName() {
                return blueprintName;
        }

        /**
         * @param blueprintName the blueprintName to set
         */
        public void setBlueprintName(String blueprintName) {
                this.blueprintName = blueprintName;
        }

        /**
         * @return the goalState
         */
        public String getGoalState() {
                return goalState;
        }

        /**
         * @param goalState the goalState to set
         */
        public void setGoalState(String goalState) {
                this.goalState = goalState;
        }

        /**
         * @return the activeServices
         */
        public List<String> getActiveServices() {
                return activeServices;
        }

        /**
         * @param activeServices the active3Services to set
         */
        public void setActiveServices(List<String> activeServices) {
                this.activeServices = activeServices;
        }

        /**
         * @return the nodeRangeExpressions
         */
        public List<String> getNodeRangeExpressions() {
                return nodeRangeExpressions;
        }

        /**
         * @param nodeRangeExpressions the nodeRangeExpressions to set
         */
        public void setNodeRangeExpressions(List<String> nodeRangeExpressions) {
                this.nodeRangeExpressions = nodeRangeExpressions;
        }

        /**
         * @return the roleToNodesMap
         */
        public RoleToNodesMap getRoleToNodesMap() {
                return roleToNodesMap;
        }

        /**
         * @param roleToNodesMap the roleToNodesMap to set
         */
        public void setRoleToNodesMap(RoleToNodesMap roleToNodesMap) {
                this.roleToNodesMap = roleToNodesMap;
        }
}