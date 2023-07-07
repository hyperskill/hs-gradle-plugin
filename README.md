# hs-gradle-plugin

It is a gradle plugin to manage versions for Hyperskill projects

## Usage

To use the plugin, include in your build script:

```gradle
buildscript {
    repositories {
        maven { url 'https://packages.jetbrains.team/maven/p/hyperskill-hs-test/maven' }
        maven { url 'https://jitpack.io' }
    }
    
    dependencies {
        classpath "com.github.hyperskill:hs-gradle-plugin:release-SNAPSHOT"
    }
    
    configurations.all {
        resolutionStrategy.cacheChangingModulesFor 0, 'seconds'
    }
}

apply plugin: 'hyperskill'
```

## Versions

The plugin contains the following versions structure:

```gradle
hs {
    java {
        version = "17"
    }

    kotlin {
        version = "1.8.20"
        javaVersion = "17"
    }
    
    gradle {
        version = "7.6"
    }
    
    spring {
        bootVersion = "3.0.2"
        dependencyManagementVersion = "1.1.0"
    }
    
    ktor {
        version = "2.3.1"
    }

    android {
        androidGradleVersion = "7.4.0"
        gradleVersion = "7.5"
        kotlinGradleVersion = "1.6.10"
        kotlinVersion = "1.6.10"
    
        robolectricVersion = "4.7.3"
    
        compileSdkVersion = 29
        minSdkVersion = 20
        targetSdkVersion = 29
        
        lib {
            junit = "4.13.2"
            appCompat = "1.3.1"
            coreKtx = "1.6.0"
            constraintLayout = "2.1.3"
            material = "1.4.0"
        }
    }
}
```

## Accessing and overriding version

To acces a version variable from the plugin you should use `hs` object:

```
hs.gradle.version
hs.java.version
hs.android.minSdkVersion
```

To override version you can assign needed version to the variables before using them:

```
hs.java.version = "18"
```
