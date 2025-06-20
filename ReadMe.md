# Index
1. Introduction
2. Core Java Concepts
3. Collection Framework
4. Data Structure using Java
5. Java 8 Features
6. Java 17 Features

# Java Versions
Here’s a **Java version history with major changes** in each version to help you understand how the language has evolved over time:

---

### **Java Version History**

| Version               | Release Date | Major Features                                                                                                                    |
| --------------------- | ------------ | --------------------------------------------------------------------------------------------------------------------------------- |
| **JDK 1.0**           | Jan 1996     | Initial release. Included basic features like applets, AWT, Java language and JVM.                                                |
| **JDK 1.1**           | Feb 1997     | Inner classes, JavaBeans, JDBC, RMI (Remote Method Invocation), reflection.                                                       |
| **J2SE 1.2**          | Dec 1998     | Introduced Collections Framework, Swing, Java Plug-in, JIT compiler. Called Java 2.                                               |
| **J2SE 1.3**          | May 2000     | HotSpot JVM, RMI over IIOP, Java Sound API, new Timer class.                                                                      |
| **J2SE 1.4**          | Feb 2002     | Assert keyword, NIO (New IO), Logging API, XML parsing, Exception chaining.                                                       |
| **Java SE 5.0 (1.5)** | Sep 2004     | Generics, Annotations, Enhanced for-loop, Autoboxing, Enum types, Varargs.                                                        |
| **Java SE 6**         | Dec 2006     | Scripting support (JSR 223), JAXB, JDBC 4.0, improvements to Web Services and compiler API.                                       |
| **Java SE 7**         | Jul 2011     | Try-with-resources, Diamond operator, NIO 2, String in switch, Fork/Join framework.                                               |
| **Java SE 8**         | Mar 2014     | **Major update**: Lambda expressions, Streams API, Functional interfaces, Optional, Date & Time API (java.time), Default methods. |
| **Java SE 9**         | Sep 2017     | Project Jigsaw (modular system), JShell (interactive REPL), private interface methods.                                            |
| **Java SE 10**        | Mar 2018     | `var` keyword for local variable type inference.                                                                                  |
| **Java SE 11**        | Sep 2018     | LTS version. Removed JavaFX, added new `HttpClient`, `var` in lambda, String methods (e.g., `isBlank()`, `lines()`).              |
| **Java SE 12**        | Mar 2019     | Switch expressions (preview), JVM constants API.                                                                                  |
| **Java SE 13**        | Sep 2019     | Text blocks (preview), dynamic CDS archives.                                                                                      |
| **Java SE 14**        | Mar 2020     | Records (preview), Pattern Matching for instanceof (preview), NVM enhancements.                                                   |
| **Java SE 15**        | Sep 2020     | Sealed classes (preview), Hidden classes, Text blocks finalized.                                                                  |
| **Java SE 16**        | Mar 2021     | Records finalized, Pattern matching enhanced, Unix domain socket channels.                                                        |
| **Java SE 17**        | Sep 2021     | **LTS version.** Sealed classes finalized, new macOS rendering pipeline, enhanced Pseudo-Random Number Generators.                |
| **Java SE 18**        | Mar 2022     | Simple web server, UTF-8 by default, Vector API (incubator).                                                                      |
| **Java SE 19**        | Sep 2022     | Virtual threads (preview, Project Loom), Structured concurrency (incubator).                                                      |
| **Java SE 20**        | Mar 2023     | Scoped values (incubator), virtual threads and pattern matching enhancements.                                                     |
| **Java SE 21**        | Sep 2023     | **LTS version.** Virtual threads finalized, sequenced collections, record patterns, string templates (preview).                   |

---

### 🔹 Key Milestones

* **Java 5**: Massive language change with generics and annotations.
* **Java 8**: Functional programming era began with lambdas and streams.
* **Java 9**: Modularization of the JDK (Project Jigsaw).
* **Java 17 & 21**: LTS releases, ideal for production use with stable features.
* **Java 19–21**: Introduction and stabilization of **Virtual Threads** for better concurrency (Project Loom).

---

## Why java 8 is called 1.8 and Java 11 is called Java 11?

The reason **Java 8 is called both "Java 8" and "Java 1.8"**, while **Java 11 is just called "Java 11"**, is mainly due to a **change in versioning convention** made by Oracle and the Java community.

---

### 🔹 The Old Versioning System (up to Java 8)

* Versions were named as **1.x** officially, but people commonly referred to them by just the major version.

* So:

    * Java 1.2 → Java 2
    * Java 1.5 → Java 5
    * Java 1.8 → Java 8

* Internally (e.g., in `java -version` output or `classfile` versions), Java 8 is still referred to as **1.8**.

Example:

```bash
java -version
# Output:
# java version "1.8.0_341"
```

---

### 🔹 The New Versioning System (from Java 9 onward)

* Starting with **Java 9**, Oracle switched to a simpler **semantic versioning** style:

    * **Java 9 = version 9**
    * **Java 10 = version 10**
    * **Java 11 = version 11**
    * And so on.

* No more “1.x” — now the internal and external version numbers **match**.

---

### 🧠 Summary

| Java Version | Marketing Name | Internal Version |
| ------------ | -------------- | ---------------- |
| Java 5       | Java 5         | 1.5              |
| Java 6       | Java 6         | 1.6              |
| Java 7       | Java 7         | 1.7              |
| Java 8       | Java 8         | 1.8              |
| Java 9+      | Java 9, 10...  | 9, 10...         |

---


## The LTS Versions

Java continues to evolve, with each new version bringing enhancements, deprecations, and new features. In this article, we’ll explore the differences between Java 8, Java 11, Java 17, and the latest Java 21. Understanding these differences can help developers and organizations decide which version is the best fit for their projects.

## Table of Contents

* Overview of Java Release Cycle
* Key Features of Each Java Version
  * Java 8 (LTS)
  * Java 11 (LTS)
  * Java 17 (LTS)
  * Java 21 (LTS)
* Performance Improvements
* New Language Features
* Tooling and API Enhancements
* Deprecations and Removed Features
* Migration Considerations
* Conclusion

## Overview of Java Release Cycle
   Starting with Java 9, Oracle introduced a new six-month release cycle. This means a new Java version is released twice a year. However, Long-Term Support (LTS) versions — such as Java 8, 11, 17, and now 21 — are released every few years and are supported for longer periods.


## Key Features of Each Java Version
### Java 8 (LTS)
Released in March 2014, Java 8 remains one of the most widely used versions of Java due to its stability and long support cycle. Key features include:

* **Lambda Expressions**: Enabled functional programming by allowing methods to be treated as first-class citizens.
  
* **Streams API**: Provides a powerful way to process collections of objects.
  
* **Default Methods**: Allowed interfaces to have method implementations, improving backward compatibility.
  
* **Optional Class**: Reduces null checks and helps prevent NullPointerException.

### Java 11 (LTS)
  Released in September 2018, Java 11 was the first LTS after Java 8 and marked the start of a modern Java. Key features include:

* **Local-Variable Syntax for Lambda Parameters**: Use var in lambda expressions.
* **HTTP Client (Standard)**: New HttpClient API replaces HttpURLConnection, with support for HTTP/2 and WebSockets.
* **Nest-Based Access Control**: Improved encapsulation of nested classes.
* **Deprecation of Pack200**: Various libraries were deprecated and removed, encouraging modernization.

### Java 17 (LTS)
Released in September 2021, Java 17 is the most popular choice for LTS migration after Java 11. Key features include:

* **Sealed Classes**: Allows developers to define restricted class hierarchies.
* *Pattern Matching for instanceof**: Simplifies type checking.
* **Records**: Introduces compact syntax for immutable data classes.
* **Strong Encapsulation by Default**: Further improves module system enforcement introduced in Java 9.
* **Foreign Function & Memory API (Incubator)**: Facilitates better native interoperation.

### Java 21 (LTS)
Released in September 2023, Java 21 brings significant new features and improvements:

* **Pattern Matching for Switch**: Adds a more expressive and safer switch.
* **Record Patterns**: Enables pattern matching for record deconstruction.
* **Virtual Threads (Project Loom)**: Lightweight threads to simplify writing high-throughput, scalable applications.
* **Scoped Values**: An enhancement in Project Loom to enable flexible state passing in threads.
* **Structured Concurrency (Incubator)**: Provides a model for concurrent tasks with lifecycles bound to parent tasks.
* **Foreign Function & Memory API (Final)**: Finalized API for efficient interoperation with native code. 

## Performance Improvements
Java 11 and beyond have introduced substantial performance improvements, particularly for garbage collection, startup time, and memory usage.

* **Java 8**: Uses Parallel GC by default.
* **Java 11**: Introduces Z Garbage Collector (ZGC) and G1GC as the default GC for low-latency applications.
* **Java 17**: G1GC and ZGC have been further optimized.
* **Java 21**: Includes enhancements in Virtual Threads and improved garbage collection algorithms.

## New Language Features
A quick comparison of language feature improvements:

![New Language Feature?](public/New%20Language%20Feature.webp)


## Tooling and API Enhancements
* **Java 8**: Introduced some of the most widely adopted features like Lambda and Stream APIs.
* **Java 11**: Introduced improvements like the new HttpClient and removed tools like javaws.
* **Java 17**: Enhanced APIs like RandomGenerator, Stream, and Optional. Sealed Classes and Record Types became permanent.
* **Java 21**: Includes finalized Foreign Function & Memory API and new APIs for structured concurrency. 
   
## Deprecations and Removed Features
Each newer version of Java deprecates older features and removes unsupported APIs:

* **Java 11**: Removed deprecated modules like java.xml.ws and tools like javaws.
* **Java 17**: Deprecated the Security Manager and finalized the removal of older APIs like Nashorn JavaScript Engine.
* **Java 21**: Continues this trend by further deprecating outdated features, improving the overall performance and security of the language. 

## Migration Considerations
Migrating from Java 8 or 11 to newer versions like Java 17 or 21 offers significant advantages in terms of performance and feature sets, but it can come with challenges:

* **Dependency Compatibility**: Some libraries or frameworks might not yet be compatible with newer Java versions.
* **Newer APIs**: Adopting new APIs like the HTTP Client or Record Types may require code changes.
* **Garbage Collection and Performance Tuning**: Newer versions bring optimized GCs, but they may require tuning based on application needs.

## Conclusion
* **Java 8**: Still widely used but lacks modern features.
* **Java 11**: A stable LTS release, offering modern features while still being compatible with legacy systems.
* **Java 17**: The most recommended LTS version due to its balance of modern features and long-term support.
* **Java 21**: The latest LTS version, bringing cutting-edge features like Virtual Threads and Structured Concurrency.

* Choosing the right Java version depends on your application’s specific needs, but moving towards the latest LTS versions like Java 17 or 21 will future-proof your application and provide performance improvements.