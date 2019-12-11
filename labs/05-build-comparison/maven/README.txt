Lab 05: Goal inputs comparison
==============================

NOTE: To view the build scans, use the credentials provided in the slides

- Build the project two times in a row

    ./mvnw clean test

    example first build scan:
    https://enterprise-training.gradle.com/s/c6sfbz2hmsoms

    example second build scan:
    https://enterprise-training.gradle.com/s/velzru4q4g3te

- Go to the timeline in the build scans and investigate if you got any cache hits when running the build the second time

- Investigate with the help of goal inputs comparisons what is the root cause for the cache misses

- Fix the volatility in the build logic, and then build the project twice in a row again

    ./mvnw clean test

    e.g.: https://enterprise-training.gradle.com/s/oqw4sjdxbankw

- Confirm that the build is now well cached
