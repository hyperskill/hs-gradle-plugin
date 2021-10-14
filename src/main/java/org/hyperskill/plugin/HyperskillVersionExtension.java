package org.hyperskill.plugin;

import org.hyperskill.plugin.versions.*;

class HyperskillVersionExtension {

    public Android android = new Android();
    public Gradle gradle = new Gradle();
    public Java java = new Java();
    public Kotlin kotlin = new Kotlin();
    public Spring spring = new Spring();

    public HyperskillVersionExtension() {

    }
}