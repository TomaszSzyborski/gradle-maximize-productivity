Lab 04: Remote build cache
==========================

DISCLAIMER: As there is only a single, centralized remote build cache node used for this training, all attendees of the current workshop can push task outputs to this cache.
As such, when fetching from the cache, you may get goal execution outputs contributed by other attendees. If you are ok with that, continue with this lab. If not please skip this lab.

NOTE: To view the build scans, use the credentials provided in the slides

- Open `settings.gradle`, note that the remote cache is enabled but not the local cache
    - Replace the `<<REMOTE_CACHE_USERNAME>>` and `<<REMOTE_CACHE_PASSWORD>>` placeholders with the credentials provided by your instructor

- Build the project and open the build scan

    ./gradlew clean build

    Example with no cache hits:
    https://enterprise-training.gradle.com/s/exeiilzybvkw4

    Example with full cache hits:
    https://enterprise-training.gradle.com/s/4s2ont5ctg4lm

- Go to the timeline in the build scan and check the outcome of the tasks.

    If you see cache hits for compilation and testing:
        - Find the `test` task in the timeline view and inspect the task details
        - Click the “Origin” button (the cube next to the X) to see from which build the reused output originates

    If you did not get any cache hits for compilation and testing:
        - Build the project again
        - Find the `test` task in the timeline view and inspect the task details
        - Click the “Origin” button (the cube next to the X) to see from which build the reused output originates (your previous build?)

    Then (in both cases):
        - Make a change to `src/test/java/example/ExampleTest.java`
        - Build the project again and confirm that the tests were recompiled and rerun
        - Have the person sitting next to you make exactly the same test code change as you did
        - Have them run the build and verify that they reused the cache artifact pushed by your build
