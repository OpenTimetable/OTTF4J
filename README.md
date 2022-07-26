<p align="center">
    <img align="center" src="https://github.com/OpenTimetable/OpenTimetable-v1/blob/master/assets/icon.png?raw=true" height="150px">
</p>

<h1 align="center">OTTF4J</h1>
<h3 align="center">OTTF parser and composer for JVM languages.</h3>
<br>

<div align="center">

[![OTTF][ottf-shield]][ottf-url]
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

</div>

## Documentation
Please refer to the [Wiki Section][wiki-url].

## Installation
### Maven
1. [Authenticate with GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages)

2. Add repository
```xml
<repository>
  <id>github</id>
  <url>https://maven.pkg.github.com/opentimetable/ottf4j</url>
  <snapshots>
    <enabled>true</enabled>
  </snapshots>
</repository>
```

3. Add dependency
```xml
<dependency>
  <groupId>org.opentimetable</groupId>
  <artifactId>ottf4j</artifactId>
  <version>VERSION</version>
</dependency>
```

### Gradle
1. [Authenticate with GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages)

2. Add repository
```groovy
repositories {
  maven {
    url = uri("https://maven.pkg.github.com/opentimetable/ottf4j")
    credentials {
      username = System.getenv("USERNAME")
      password = System.getenv("TOKEN")
    }
  }
}
```

3. Add dependency
```groovy
dependencies {
  implementation 'org.opentimetable:ottf4j:VERSION'
}
```

## Bug reporting
If you encounter any bugs while using OTTF4J, please report them in the [Issues Section][issues-url].

## Support
You can receive additional support in the [Discussions Section][discussions-url].

[ottf-shield]: https://img.shields.io/badge/OTTF-v1.0-blueviolet?style=for-the-badge
[contributors-shield]: https://img.shields.io/github/contributors/OpenTimetable/OTTF4J.svg?style=for-the-badge
[forks-shield]: https://img.shields.io/github/forks/OpenTimetable/OTTF4J.svg?style=for-the-badge
[stars-shield]: https://img.shields.io/github/stars/OpenTimetable/OTTF4J.svg?style=for-the-badge
[issues-shield]: https://img.shields.io/github/issues/OpenTimetable/OTTF4J.svg?style=for-the-badge
[license-shield]: https://img.shields.io/github/license/OpenTimetable/OTTF4J.svg?style=for-the-badge

[ottf-url]: https://github.com/OpenTimetable/OpenTimetable-v1
[contributors-url]: https://github.com/OpenTimetable/OTTF4J/graphs/contributors
[forks-url]: https://github.com/OpenTimetable/OTTF4J/network/members
[stars-url]: https://github.com/OpenTimetable/OTTF4J/stargazers
[issues-url]: https://github.com/OpenTimetable/OTTF4J/issues
[license-url]: https://github.com/OpenTimetable/OTTF4J/blob/master/LICENSE
[wiki-url]: https://github.com/OpenTimetable/OTTF4J/wiki
[releases-url]: https://github.com/OpenTimetable/OTTF4J/releases
[discussions-url]: https://github.com/OpenTimetable/OTTF4J/discussions
