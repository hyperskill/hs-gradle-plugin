package org.hyperskill.plugin.versions;

public class Android {

    private String androidGradleVersion = "7.0.2";
    public String gradleVersion = "7.6.1";
    public String kotlinGradleVersion = "1.6.10";
    public String kotlinVersion = "1.6.10";

    public String robolectricVersion = "4.7.3";

    public Integer compileSdkVersion = 29;
    public Integer minSdkVersion = 20;
    public Integer targetSdkVersion = 29;

    public Lib lib = new Lib();

    public Android() {}

    public String getAndroidGradleVersion(String gradleVersion) {
        final String androidGradleFallbackVersion = "4.0.2";
        final String minimumGradleVersionNotRequiringFallback = "7.0.2";

        if (gradleVersion.compareTo(minimumGradleVersionNotRequiringFallback) < 0) {
            return androidGradleFallbackVersion;
        } else {
            return androidGradleVersion;
        }
    }

    public static class Lib {
        public String junit = "4.13.2";
        public String appCompat = "1.3.1";
        public String coreKtx = "1.6.0";
        public String constraintLayout = "2.1.3";
        public String material = "1.4.0";

        public Lib() {}
    }
}
