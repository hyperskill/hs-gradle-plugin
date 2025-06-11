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
        version = "24"
    }

    kotlin {
        version = "2.0.0"
        javaVersion = "17"
    }
    
    gradle {
        version = "8.14"
    }
    
    spring {
        bootVersion = "3.2.0"
        dependencyManagementVersion = "1.1.3"
    }
    
    ktor {
        version = "2.3.1"
    }

    android {
        androidGradleVersion = "8.7.2"
        gradleVersion = "8.9"
        kotlinGradleVersion = "1.9.22"
        kotlinVersion = "1.8.20"
    
        robolectricVersion = "4.14"
    
        compileSdkVersion = 35
        minSdkVersion = 21
        targetSdkVersion = 34
        
        lib {
            junit = "4.13.2"
            appCompat = "1.7.0"
            coreKtx = "1.15.0"
            constraintLayout = "2.0.4"
            material = "1.11.0"
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
hs.java.version = "24"
```
