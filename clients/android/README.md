# dynamia-tools-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>tools.dynamia</groupId>
    <artifactId>dynamia-tools-android-client</artifactId>
    <version>5.3.7</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "tools.dynamia:dynamia-tools-android-client:5.3.7"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/dynamia-tools-android-client-5.3.7.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class DynamiaApplicationMetadataApiExample {

    public static void main(String[] args) {
        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
        String className = null; // String | 
        String action = null; // String | 
        ActionExecutionRequest actionExecutionRequest = new ActionExecutionRequest(); // ActionExecutionRequest | 
        try {
            ActionExecutionResponse result = apiInstance.executeEntityAction(className, action, actionExecutionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#executeEntityAction");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DynamiaApplicationMetadataApi* | [**executeEntityAction**](docs/DynamiaApplicationMetadataApi.md#executeEntityAction) | **POST** /api/app/metadata/entities/{className}/action/{action} | 
*DynamiaApplicationMetadataApi* | [**executeEntityAction1**](docs/DynamiaApplicationMetadataApi.md#executeEntityAction1) | **GET** /api/app/metadata/entities/{className}/views | 
*DynamiaApplicationMetadataApi* | [**executeGlobalAction**](docs/DynamiaApplicationMetadataApi.md#executeGlobalAction) | **POST** /api/app/metadata/actions/{action} | 
*DynamiaApplicationMetadataApi* | [**getEntities**](docs/DynamiaApplicationMetadataApi.md#getEntities) | **GET** /api/app/metadata/entities | 
*DynamiaApplicationMetadataApi* | [**getEntityMetadata**](docs/DynamiaApplicationMetadataApi.md#getEntityMetadata) | **GET** /api/app/metadata/entities/{className} | 
*DynamiaApplicationMetadataApi* | [**getEntityViewDescriptor**](docs/DynamiaApplicationMetadataApi.md#getEntityViewDescriptor) | **GET** /api/app/metadata/entities/{className}/views/{view} | 
*DynamiaApplicationMetadataApi* | [**getGlobalActions**](docs/DynamiaApplicationMetadataApi.md#getGlobalActions) | **GET** /api/app/metadata/actions | 
*DynamiaApplicationMetadataApi* | [**getMetadata**](docs/DynamiaApplicationMetadataApi.md#getMetadata) | **GET** /api/app/metadata | 
*DynamiaApplicationMetadataApi* | [**getNavigation**](docs/DynamiaApplicationMetadataApi.md#getNavigation) | **GET** /api/app/metadata/navigation | 
*DynamiaCrudServiceApi* | [**createOrSave**](docs/DynamiaCrudServiceApi.md#createOrSave) | **POST** /crud-service/{className} | 
*DynamiaCrudServiceApi* | [**createOrSave1**](docs/DynamiaCrudServiceApi.md#createOrSave1) | **PUT** /crud-service/{className} | 
*DynamiaCrudServiceApi* | [**delete**](docs/DynamiaCrudServiceApi.md#delete) | **DELETE** /crud-service/{className}/{id} | 
*DynamiaCrudServiceApi* | [**find**](docs/DynamiaCrudServiceApi.md#find) | **POST** /crud-service/{className}/find | 
*DynamiaCrudServiceApi* | [**get**](docs/DynamiaCrudServiceApi.md#get) | **GET** /crud-service/{className}/{id} | 
*DynamiaCrudServiceApi* | [**getId**](docs/DynamiaCrudServiceApi.md#getId) | **POST** /crud-service/{className}/id | 
*DynamiaPeriodicTasksApi* | [**executeAfternoonTasks**](docs/DynamiaPeriodicTasksApi.md#executeAfternoonTasks) | **GET** /schedule/execute-tasks/afternoon | 
*DynamiaPeriodicTasksApi* | [**executeMiddayTasks**](docs/DynamiaPeriodicTasksApi.md#executeMiddayTasks) | **GET** /schedule/execute-tasks/midday | 
*DynamiaPeriodicTasksApi* | [**executeMidnightTasks**](docs/DynamiaPeriodicTasksApi.md#executeMidnightTasks) | **GET** /schedule/execute-tasks/evening | 
*DynamiaPeriodicTasksApi* | [**executeMorningTasks**](docs/DynamiaPeriodicTasksApi.md#executeMorningTasks) | **GET** /schedule/execute-tasks/morning | 


## Documentation for Models

 - [ActionExecutionRequest](docs/ActionExecutionRequest.md)
 - [ActionExecutionResponse](docs/ActionExecutionResponse.md)
 - [ActionMetadata](docs/ActionMetadata.md)
 - [ActionRef](docs/ActionRef.md)
 - [ApplicationMetadata](docs/ApplicationMetadata.md)
 - [ApplicationMetadataActions](docs/ApplicationMetadataActions.md)
 - [ApplicationMetadataEntities](docs/ApplicationMetadataEntities.md)
 - [BeanSorterObject](docs/BeanSorterObject.md)
 - [DataPaginator](docs/DataPaginator.md)
 - [EntityMetadata](docs/EntityMetadata.md)
 - [Field](docs/Field.md)
 - [FieldGroup](docs/FieldGroup.md)
 - [NavigationNode](docs/NavigationNode.md)
 - [NavigationTree](docs/NavigationTree.md)
 - [QueryParameters](docs/QueryParameters.md)
 - [ViewDescriptor](docs/ViewDescriptor.md)
 - [ViewDescriptorMetadata](docs/ViewDescriptorMetadata.md)
 - [ViewLayout](docs/ViewLayout.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

mario@dynamiasoluciones.com

