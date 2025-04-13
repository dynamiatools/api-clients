# DynamiaTools - OpenAPI Client Generator

This project automatically generates API clients from the OpenAPI specification of DynamiaTools using the Springdoc and OpenAPI Generator Maven plugins. It supports multiple client languages including TypeScript, Dart, Java (with Spring RestClient), and Android.

## Overview

- **OpenAPI Specification** is generated automatically from the DynamiaTools backend using `springdoc-openapi-maven-plugin`.
- **Client SDKs** are generated using the `openapi-generator-maven-plugin`.
- Each client is placed in the `/clients` directory under its own subfolder.

## Requirements

- Java 17+
- Maven 3.9+

## How to Build

```bash
mvn clean verify
```

This command performs the following:
1. Starts the Spring Boot application.
2. Generates `openapi.json` using Springdoc.
3. Generates clients for all configured languages.

## Generated Clients

- `/clients/typescript`: TypeScript Node.js client
- `/clients/dart`: Dart/Flutter client
- `/clients/java`: Java client using Spring `RestClient`
- `/clients/android`: Android-compatible client

## Adding a New Client

To add a new client, you simply need to add a new `<execution>` block to the `openapi-generator-maven-plugin` in the `pom.xml` file. Here's a basic example for a Python client:

```xml
<execution>
    <id>generate-python-client</id>
    <phase>post-integration-test</phase>
    <goals>
        <goal>generate</goal>
    </goals>
    <configuration>
        <generatorName>python</generatorName>
        <output>${project.basedir}/clients/python</output>
        <configOptions>
            <packageName>dynamiatools_api</packageName>
            <projectName>DynamiaTools Python Client</projectName>
        </configOptions>
    </configuration>
</execution>
```

Supported `generatorName` values include:
- `typescript-axios`, `typescript-fetch`, `typescript-node`
- `dart`
- `java`, `kotlin`
- `android`
- `python`
- `go`
- `csharp`
- etc.

For a full list of supported languages and configuration options, refer to the [OpenAPI Generator documentation](https://openapi-generator.tech/docs/generators).

## License

Apache 2.0

---

Made with ❤️ by the [DynamiaTools](https://www.dynamia.tools) team.

> GitHub: [https://github.com/dynamiatools/api-clients](https://github.com/dynamiatools/api-clients)


## ☕ Support DynamiaTools

Hey there! DynamiaTools is built with a lot of dedication to help developers speed up their projects and make development more enjoyable. If DynamiaTools has been useful to you or your projects, consider supporting its development. Your support helps keep the project alive and evolving with new features and improvements. Every coffee counts! 😊

<a href="https://www.buymeacoffee.com/marioserrano" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

