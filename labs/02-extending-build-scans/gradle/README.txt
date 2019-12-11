Lab 02: Extending build scans
=============================

NOTE: To view the build scans, use the credentials provided in the slides

- Open `build.gradle`, find the code adding the tags, values and links

- Run a build to publish a build scan

      ./gradlew build

- Follow the link in the console output to view your build scan

  e.g.: https://enterprise-training.gradle.com/s/cispjwiaunwnk

- Find the tags, links and values in your build scan

- Run another build adding a tag at build time

    ./gradlew build -Dscan.tag.TEST

- Go to the scan list and find your scan(s) that you published with the `TEST` tag

  e.g.: https://enterprise-training.gradle.com/s/oa575adtocehw

- Add a hook which automatically opens the build scan in the browser at the end of each _failing_ build

    For help, check out https://docs.gradle.com/build-scan-plugin/#adding_data_at_the_end_of_the_build and
                        https://docs.gradle.com/build-scan-plugin/#capturing_the_build_scan_id_or_address
    Alternatively, solution.gradle has a working solution that you can copy+paste into your build.gradle

- Consider how your organization might want to add source control information to scans

    Check out https://docs.gradle.com/build-scan-plugin/#adding_expensive_data for help
