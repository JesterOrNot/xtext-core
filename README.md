# Eclipse Xtext Core Framework
[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/eclipse/xtext-core) 

This repository contains the platform-independent language framework of Xtext.

## How To Build

Check out and run `./gradlew build`.

Additional command line arguments:
 - `-PcompileXtend=true` activates the [Xtend](http://xtend-lang.org) compiler, but this is optional because the generated Java code is included in the repository.
 - `-PuseJenkinsSnapshots=true` switches to using the Maven repository generated by the [Jenkins build job](https://ci.eclipse.org/xtext/job/xtext-lib/) for [xtext-lib](https://github.com/eclipse/xtext-lib). Without this argument, [Sonatype snapshots](https://oss.sonatype.org/content/repositories/snapshots) are used.

## Continuous Integration

This project is built by the [xtext-core multi-branch job on Jenkins](https://ci.eclipse.org/xtext/job/xtext-core/).
