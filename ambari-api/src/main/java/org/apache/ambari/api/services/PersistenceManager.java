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

package org.apache.ambari.api.services;

import org.apache.ambari.api.resources.ResourceDefinition;

/**
 * Persistence manager which is responsible for persisting a resource state to the back end.
 * This includes create, update and delete operations.
 */
public interface PersistenceManager {
  /**
   * Persist a resource to the back end.
   *
   * @param resource  the resource to persist
   *
   */
  public void persist(ResourceDefinition resource);
}