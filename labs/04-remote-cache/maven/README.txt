Lab 04: Remote build cache
==========================

DISCLAIMER: As there is only a single, centralized remote build cache node used for this training, all attendees of the current workshop can push goal executions to this cache.
As such, when fetching from the cache, you may get goal execution outputs contributed by other attendees. If you are ok with that, continue with this lab. If not please skip this lab.

NOTE: To view the build scans, use the credentials provided in the slides

- Open `.mvn/gradle-enterprise.xml`, note that the remote cache is enabled but not the local cache

- Add the following `<server>` snippet to your local `~/.m2/settings.xml` file (or create it) and
  replace the `<<REMOTE_CACHE_USERNAME>>` and `<<REMOTE_CACHE_PASSWORD>>` placeholders with the credentials provided by your instructor:

    <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
        <servers>
            <server>
                <id>remote-cache</id>
                <username><<REMOTE_CACHE_USERNAME>></username>
                <password><<REMOTE_CACHE_PASSWORD>></password>
            </server>
        </servers>
    </settings>

- Build the project and open the build scan

    ./mvnw clean test

    example scan with no cache hits:
    https://enterprise-training.gradle.com/s/jioen6anhbmaa

    example scan with full cache hits:
    https://enterprise-training.gradle.com/s/opk2ssjom3jwk

- Go to the timeline in the build scan and check the outcome of the goal executions.

    If you see cache hits for compilation and testing:
        - Find the `test` goal in the timeline view and inspect the goal execution details
        - Click the “View origin scan” link (near the bottom) to see from which build the reused output originates

    If you did not get any cache hits for compilation and testing:
        - Build the project again
        - Find the `test` goal in the timeline view and inspect the goal execution details
        - Click the “View origin scan” link (near the bottom) to see from which build the reused output originates (your previous build?)

    Then (in both cases):
        - Make a change to `src/test/java/example/ExampleTest.java`
        - Build the project again and confirm that the tests were recompiled and rerun
        - Have the person sitting next to you make exactly the same test code change as you did
        - Have them run the build and verify that they reused the cache artifact pushed by your build
