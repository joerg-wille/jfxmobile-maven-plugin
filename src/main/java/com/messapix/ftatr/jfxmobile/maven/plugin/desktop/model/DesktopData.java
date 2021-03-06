/*
 * Copyright 2015 Messapix.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.messapix.ftatr.jfxmobile.maven.plugin.desktop.model;

import com.messapix.ftatr.jfxmobile.maven.plugin.annotations.AsProperty;
import com.messapix.ftatr.jfxmobile.maven.plugin.annotations.Default;
import com.messapix.ftatr.jfxmobile.maven.plugin.annotations.Descriptor;
import java.util.List;
import org.apache.maven.model.Dependency;

/**
 *
 * @author Alfio Gloria
 */
public class DesktopData {
    @AsProperty
    @Default( "false" )
    @Descriptor(
             desc = "If true maven will resolve properties in every file from src/desktop/resources folder"
    )
    private Boolean resourceFiltering;

    @Descriptor(
             desc = "Allow user to define desktop specific dependencies"
    )
    private List<Dependency> dependencies;

    public Boolean getResourceFiltering() {
        return resourceFiltering;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

}
