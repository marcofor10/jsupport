# JSupport

This is a Java library providing some simple objects representing common entities such as a person, a book or an author, useful for creating demo examples. It also contains useful resources like:

* a template of .gitignore file
* a template of a generic README.md
* a template of a generic pom.xml
* a configuration file for the Eclipse Java code style formatter  

## Built With

* [Maven](https://maven.apache.org) - Dependency Management

## Getting Started

### Minimum Requirements

* Java 1.7 or above - tested with [OracleJDK 7.0](http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html)
* Maven - [offical download page](https://maven.apache.org/download.cgi)

### Adding jsupport to your build

1. This project is not yet avaiable on the official maven repository: the project must be cloned and manutally installed into your local maven repository.

1. Then you can start using JSupport by adding Maven dependencies into your Maven project.

To add a dependency on JSupport, use the following:
```xml
<dependency>
  <groupId>org.jfoma.jsupport</groupId>
  <artifactId>jsupport</artifactId>
  <version>0.1-SNAPSHOT</version>
</dependency>
```

To add a dependency using Gradle:
```
dependencies {
  compile 'org.jfoma.jsupport:jsupport:0.1-SNAPSHOT'
}
```

## Author

* **Marco Foroni** - [marcofor10](https://github.com/marcofor10)

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/marcofor10/jsupport/blob/master/LICENSE) file for details


## IMPORTANT WARNINGS

1. This project is under development.

1. APIs marked with the `@Beta` annotation at the class or method level
are subject to change. They can be modified in any way, or even
removed, at any time. Read more about [`@Beta` annotation](https://github.com/google/guava#important-warnings).
