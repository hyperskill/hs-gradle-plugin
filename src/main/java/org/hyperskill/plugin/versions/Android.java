package org.hyperskill.plugin.versions;

public class Android {

    private String androidGradleVersion = "8.7.2";
    public String gradleVersion = "8.9";
    public String kotlinGradleVersion = "1.9.22";
    public String kotlinVersion = "1.8.20";

    public String robolectricVersion = "4.14";

    public Integer compileSdkVersion = 35;
    public Integer minSdkVersion = 21;
    public Integer targetSdkVersion = 34;

    public Lib lib = new Lib();

    public Android() {}

    public String getAndroidGradleVersion(String gradleVersion) {
        final String androidGradleFallbackVersion = "7.0.2";
        final String minimumGradleVersionNotRequiringFallback = "8.0.0";

        if (gradleVersion.compareTo(minimumGradleVersionNotRequiringFallback) < 0) {
            return androidGradleFallbackVersion;
        } else {
            return androidGradleVersion;
        }
    }

    public static class Lib {
        public String junit = "4.13.2";
        public String appCompat = "1.7.0";
        public String coreKtx = "1.15.0";
        public String constraintLayout = "2.0.4";
        public String material = "1.11.0";

        public Lib() {}
    }
}
