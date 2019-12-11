Lab 01: Troubleshooting with build scans
=============================

NOTE: To view the build scans, use the credentials provided in the slides
See SOLUTIONS.TXT for additional context and answers to the questions posed by this lab

1. Run a build to publish a build scan

      ./mvnw clean test

2. Follow the link in the console output to view your build scan. If prompted to login, use username "attendee", password "gradle"

  e.g.: https://enterprise-training.gradle.com/s/n3eyo3t5fhoba

3. Find the answers to the following questions:

  - How much time is being spent on garbage collection?
  - What is the peak memory usage?

4. Fix the issue degrading build performance

  - Hint: https://maven.apache.org/ref/3.5.2/maven-embedder/

5. Publish another build scan and verify that the memory pressure issue is fixed

6. Introduce a compiler error in the `src/main/java/example/Example.java` file

7. Run a build to publish another build scan

      ./mvnw clean test

8. Follow the link in the console output to view your build scan of the failed build

  e.g.: https://enterprise-training.gradle.com/s/27qgz7sksvo46

9. Go to the failure section to investigate the error

10. Open this build scan from the Spring Boot project:
  https://enterprise-training.gradle.com/s/76cvqqo7xvtio

11. Find the answers to the following questions:

  - What version of the maven surefire plugin was used?
  - How much time was spent initializing the build and discovering the projects?
  - Was there any memory pressure while running the build?
  - What version of the java runtime was used during this build?
