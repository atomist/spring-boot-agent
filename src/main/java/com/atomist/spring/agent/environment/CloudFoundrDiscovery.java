/*
 * Copyright 2018 Atomist.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.atomist.spring.agent.environment;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class CloudFoundrDiscovery implements Discovery, EnvironmentAware {

    private Environment environment;

    @Override
    public String getEnvironment() {
        return environment.getProperty("VCAP_APPLICATION");
    }

    @Override
    public String getName() {
        return "cloudfoundry";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

}
