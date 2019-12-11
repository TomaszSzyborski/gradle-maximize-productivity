Lab 01: Troubleshooting with build scans
=============================

NOTE: To view the build scans, use the credentials provided in the slides
See SOLUTIONS.TXT for additional context and answers to the questions posed by this lab

1. Run a build to publish a build scan

      ./gradlew build

2. Follow the link in the console output to view your build scan. If prompted to login, use username "attendee", password "gradle"

  e.g.: https://enterprise-training.gradle.com/s/u7i3hyrvandwc

3. Find the answers to the following questions:

  - How much time is being spent on garbage collection?
  - What is the peak memory usage?

4. Fix the issue degrading build performance

  - Hint: https://docs.gradle.org/current/userguide/build_environment.html#sec:configuring_jvm_memory

5. Find the answers to the following questions:

  - Why is the root project compiling against slf4j-api version 1.7.25 but running with version 1.7.28?
  - Why does the console log contain messages about multiple slf4j bindings?

6. Fix the dependency issues discovered in step 5 so that only a single version of slf4j is used

  - Hint: There are multiple valid solutions.
  - For small builds, keeping all dependency declarations consistent can be sufficient
  - For robust dependency version management across large builds, see:
        https://docs.gradle.org/current/dsl/org.gradle.api.artifacts.DependencySubstitutions.html

7. Publish another build scan and verify that the memory pressure and dependency issues are fixed

e.g.: https://enterprise-training.gradle.com/s/7dvwqcf5hzvga

8. Find the "navigate to earlier/later builds in this workspace" button at the top of the build scan
   - Hint: It looks like an arrow around a clock face
   - In the list of builds you've run, find the first one you ran
   - Mouse over the earlier build and click the "compare with this build" button that looks like a venn-diagram
   - Observe the impact of your fixes in the diff view

9. Optional: Open this build scan taken from the Gradle Build Tool project:
  https://enterprise-training.gradle.com/s/rzht6qise5ujg

  Find the answers to the following questions:
    - What version of `commons-lang` is used by the build?
    - How many times is the `publishing` plugin applied to the build?
    - What OS and JVM versions was the build run with?
    - Was the build cache enabled?
    - How much time was spent configuring the build?
    - Was there any memory pressure while running the build?
    - What was the average download speed when fetching from the remote cache?
    - How long was the daemon that executed the build already running before?
