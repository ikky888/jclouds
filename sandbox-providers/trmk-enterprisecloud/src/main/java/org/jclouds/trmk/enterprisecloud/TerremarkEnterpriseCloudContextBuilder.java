/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.trmk.enterprisecloud;

import java.util.List;
import java.util.Properties;

import org.jclouds.rest.RestContextBuilder;
import org.jclouds.trmk.enterprisecloud.config.TerremarkEnterpriseCloudRestClientModule;

import com.google.inject.Module;

/**
 * 
 * @author Adrian Cole
 */
public class TerremarkEnterpriseCloudContextBuilder extends
      RestContextBuilder<TerremarkEnterpriseCloudClient, TerremarkEnterpriseCloudAsyncClient> {

   public TerremarkEnterpriseCloudContextBuilder(Properties props) {
      super(TerremarkEnterpriseCloudClient.class, TerremarkEnterpriseCloudAsyncClient.class, props);
   }

   @Override
   protected void addClientModule(List<Module> modules) {
      modules.add(new TerremarkEnterpriseCloudRestClientModule());
   }

}
