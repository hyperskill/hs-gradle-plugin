package org.hyperskill.plugin.versions;

public class Android {
    
    private String androidGradleVersion = "7.0.2";
    public String gradleVersion = "7.0.2";
    public String kotlinGradleVersion = "1.6.10";
    public String kotlinVersion = "1.6.10";
    
    public String robolectricVersion = "4.3.1";
    
    public Integer compileSdkVersion = 29;
    public Integer minSdkVersion = 20;
    public Integer targetSdkVersion = 29;

    public Android() {}
    
    public String getAndroidGradleVersion(String gradleVersion) {
        final String androidGradleFallbackVersion = "4.0.2";
        final String minimunGradleVersionNotRequiringFallback = "7.0.2";
        
        if (gradleVersion.compareTo(minimunGradleVersionNotRequiringFallback) < 0) {
            return androidGradleFallbackVersion;
        } else {
            return androidGradleVersion;
        }
    }
}
