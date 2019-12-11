// Look up the build scan API
def buildScan = session.lookup("com.gradle.maven.extension.api.scan.BuildScanApi")

// Capture if the build is from CI as a tag
def ci = System.getenv("CI")
if (ci) {
    buildScan.tag("CI")
} else {
    buildScan.tag("Local")
}
