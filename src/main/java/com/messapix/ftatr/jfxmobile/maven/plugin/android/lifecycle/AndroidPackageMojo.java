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
package com.messapix.ftatr.jfxmobile.maven.plugin.android.lifecycle;

import com.messapix.ftatr.jfxmobile.maven.plugin.FileSystem;
import com.messapix.ftatr.jfxmobile.maven.plugin.MavenAnt;
import com.messapix.ftatr.jfxmobile.maven.plugin.android.AndroidTarget;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;

/**
 *
 * @author Alfio Gloria
 */
@Mojo( name = "android-package-android" )
public class AndroidPackageMojo extends AbstractMojo {
    @Component
    private FileSystem fs;
    
    @Component
    private MavenAnt ant;
    
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        ant.jar( fs.path( AndroidTarget.CLASSESDIR ), fs.path( AndroidTarget.RETROLAMBDAJAR ) );
        ant.jar( fs.path( AndroidTarget.RESOURCESDIR ), fs.path( AndroidTarget.RESOURCESJAR ) );
    }
}
