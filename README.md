[![CI](https://github.com/tkgregory/yousif-issue/actions/workflows/gradle.yml/badge.svg)](https://github.com/tkgregory/yousif-issue/actions/workflows/gradle.yml)

Demonstrates creating a fat jar for a multi-project build.

Code from 3 subprojects is combined into a single fat jar file.

## Building
```bash
$ ./gradlew build
```

## Running
```bash
$ java -jar subproject-a/build/libs/subproject-a.jar
I am subproject A I am subproject B I am subproject C
````
