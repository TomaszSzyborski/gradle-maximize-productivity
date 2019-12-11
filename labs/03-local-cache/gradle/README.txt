Lab 03: Local build cache
=========================

NOTE: To view the build scans, use the credentials provided in the slides

- Open `gradle.properties`, note that caching is enabled
    - verbose console is enabled to make seeing the effects of caching easier

- Build the project and look at the timeline in the build scan to confirm compilation and test tasks were executed

    ./gradlew build

    e.g.: https://enterprise-training.gradle.com/s/rpoxg5tjj6mfg

- Build again with clean, and filter the timeline view by those tasks whose output were taken from cache

    ./gradlew clean build

    e.g.: https://enterprise-training.gradle.com/s/heis6t5hjgh44

- Build again with clean and build cache disabled, notice the much longer build time than in the preceding run

    ./gradlew clean build --no-build-cache

    e.g.: https://enterprise-training.gradle.com/s/7f35oxbmmiscs

- Take a look at this build scan from the Gradle Build tool project and determine which task types are not cacheable:
  https://enterprise-training.gradle.com/s/rzht6qise5ujg
