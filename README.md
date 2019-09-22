# Game Library Curator

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2fb636583ab94c2a86bab793219b0c24)](https://app.codacy.com/app/flate/GameLibraryCurator?utm_source=github.com&utm_medium=referral&utm_content=Flate/GameLibraryCurator&utm_campaign=Badge_Grade_Dashboard)

This app does nothing yet, but it does it very well.

## Dependencies  
This project needs the following tools installed and available on the PATH to be able to build & run:

 - Node.js (preferably v12.9.1)
 - Java 11
 - Yarn (preferably 1.17.3)

The project can also be build using npm instead of yarn, but in that case the nodeModules task in the build.gradle
 file must be modified. That change should never be committed.

## Build & Run

To build the project:
```shell script
./gradlew build
```
This builds both the angular project in src/main/webapp and the Spring Boot Application. It also takes care of the 
For this to work from the IDE, node must be available on the PATH **of the IDE**.

To run the project:
```shell script
./gradlew bootRun
```

To only run the Angular Frontend, run the following **from the src/main/webapp folder**_:
```shell script
ng serve
```
If Angular CLI is not installed, you can run the following instead (also from the webapp folder):
```shell script
./node_modules/@angular/cli/bin/ng serve
```
