Lab 03: Local build cache
=========================

NOTE: To view the build scans, use the credentials provided in the slides

- Open `.mvn/gradle-enterprise.xml`, note that the local cache is not configured explicitly since it is enabled by default

- Build the project and look at the timeline in the build scan to confirm compilation and test goals were executed

    ./mvnw clean test

    e.g.: https://enterprise-training.gradle.com/s/vtw6ztm4vinoy

- Build again with clean, and filter the timeline view by those goals whose output were taken from cache

    ./mvnw clean test

    e.g.: https://enterprise-training.gradle.com/s/4btuh2d3nyr7o

- Execute just a clean

    ./mvnw clean

    e.g.: https://enterprise-training.gradle.com/s/fg6yaidpdqs6o

- Then execute tests without clean and notice the cache was not used leading to much longer build time than previously

    ./mvnw test

    e.g.: https://enterprise-training.gradle.com/s/wnuyr5soa2yo4

- Build again with build cache disabled, notice again the much longer build time than previously

    ./mvnw clean test -Dgradle.cache.local.enabled=false

    e.g.: https://enterprise-training.gradle.com/s/7ikf4yd3feoqq

- Take a look at this build scan from the Spring Boot project and determine how much build time it could save if checkstyle were cacheable:
  https://enterprise-training.gradle.com/s/76cvqqo7xvtio
