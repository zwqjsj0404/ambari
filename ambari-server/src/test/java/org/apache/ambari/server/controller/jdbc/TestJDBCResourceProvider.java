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

package org.apache.ambari.server.controller.jdbc;

import org.apache.ambari.server.controller.spi.PropertyId;
import org.apache.ambari.server.controller.spi.PropertyProvider;
import org.apache.ambari.server.controller.spi.Resource;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class TestJDBCResourceProvider extends JDBCResourceProvider{
  public TestJDBCResourceProvider(ConnectionFactory connectionFactory, Resource.Type type, List<PropertyProvider> propertyProviders, Set<PropertyId> propertyIds, Map<Resource.Type, PropertyId> keyPropertyIds) {
    super(connectionFactory, type, propertyProviders, propertyIds, keyPropertyIds);
  }

  @Override
  public List<PropertyProvider> getPropertyProviders() {
    return super.getPropertyProviders();
  }
}