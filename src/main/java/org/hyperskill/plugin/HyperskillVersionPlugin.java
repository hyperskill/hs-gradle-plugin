package org.hyperskill.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HyperskillVersionPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.getExtensions().create("hs", HyperskillVersionExtension.class);
    }

    public HyperskillVersionPlugin() {

    }
}


