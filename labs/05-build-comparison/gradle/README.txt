Lab 05: Task inputs comparison
==============================

NOTE: To view the build scans, use the credentials provided in the slides

- Build the project two times in a row

    ./gradlew build

    example first build scan:
    https://enterprise-training.gradle.com/s/fvp5jeuad7bsa

    example second build scan:
    https://enterprise-training.gradle.com/s/kup3gx4jj5hy4

- Go to the timeline in the build scans and investigate if you got any cache hits when running the build the second time

- Investigate with the help of task inputs comparisons what is the root cause for the cache misses

- Fix the volatility in the build logic, and then build the project two times in a row again

    ./gradlew build

    e.g.: https://enterprise-training.gradle.com/s/tkj7homdk6vdq

- Confirm that the build is now well cached
