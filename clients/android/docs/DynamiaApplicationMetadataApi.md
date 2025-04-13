# DynamiaApplicationMetadataApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeEntityAction**](DynamiaApplicationMetadataApi.md#executeEntityAction) | **POST** /api/app/metadata/entities/{className}/action/{action} | 
[**executeEntityAction1**](DynamiaApplicationMetadataApi.md#executeEntityAction1) | **GET** /api/app/metadata/entities/{className}/views | 
[**executeGlobalAction**](DynamiaApplicationMetadataApi.md#executeGlobalAction) | **POST** /api/app/metadata/actions/{action} | 
[**getEntities**](DynamiaApplicationMetadataApi.md#getEntities) | **GET** /api/app/metadata/entities | 
[**getEntityMetadata**](DynamiaApplicationMetadataApi.md#getEntityMetadata) | **GET** /api/app/metadata/entities/{className} | 
[**getEntityViewDescriptor**](DynamiaApplicationMetadataApi.md#getEntityViewDescriptor) | **GET** /api/app/metadata/entities/{className}/views/{view} | 
[**getGlobalActions**](DynamiaApplicationMetadataApi.md#getGlobalActions) | **GET** /api/app/metadata/actions | 
[**getMetadata**](DynamiaApplicationMetadataApi.md#getMetadata) | **GET** /api/app/metadata | 
[**getNavigation**](DynamiaApplicationMetadataApi.md#getNavigation) | **GET** /api/app/metadata/navigation | 



## executeEntityAction

> ActionExecutionResponse executeEntityAction(className, action, actionExecutionRequest)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

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
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **action** | **String**|  | [default to null]
 **actionExecutionRequest** | [**ActionExecutionRequest**](ActionExecutionRequest.md)|  |

### Return type

[**ActionExecutionResponse**](ActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## executeEntityAction1

> List&lt;ViewDescriptor&gt; executeEntityAction1(className)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
String className = null; // String | 
try {
    List<ViewDescriptor> result = apiInstance.executeEntityAction1(className);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#executeEntityAction1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]

### Return type

[**List&lt;ViewDescriptor&gt;**](ViewDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## executeGlobalAction

> ActionExecutionResponse executeGlobalAction(action, request)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
String action = null; // String | 
ActionExecutionRequest request = null; // ActionExecutionRequest | 
try {
    ActionExecutionResponse result = apiInstance.executeGlobalAction(action, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#executeGlobalAction");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | [default to null]
 **request** | [**ActionExecutionRequest**](.md)|  | [default to null]

### Return type

[**ActionExecutionResponse**](ActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEntities

> ApplicationMetadataEntities getEntities()



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
try {
    ApplicationMetadataEntities result = apiInstance.getEntities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#getEntities");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ApplicationMetadataEntities**](ApplicationMetadataEntities.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEntityMetadata

> EntityMetadata getEntityMetadata(className)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
String className = null; // String | 
try {
    EntityMetadata result = apiInstance.getEntityMetadata(className);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#getEntityMetadata");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]

### Return type

[**EntityMetadata**](EntityMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEntityViewDescriptor

> ViewDescriptor getEntityViewDescriptor(className, view)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
String className = null; // String | 
String view = null; // String | 
try {
    ViewDescriptor result = apiInstance.getEntityViewDescriptor(className, view);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#getEntityViewDescriptor");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **view** | **String**|  | [default to null]

### Return type

[**ViewDescriptor**](ViewDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGlobalActions

> ApplicationMetadataActions getGlobalActions()



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
try {
    ApplicationMetadataActions result = apiInstance.getGlobalActions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#getGlobalActions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ApplicationMetadataActions**](ApplicationMetadataActions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMetadata

> ApplicationMetadata getMetadata()



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
try {
    ApplicationMetadata result = apiInstance.getMetadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#getMetadata");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ApplicationMetadata**](ApplicationMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNavigation

> NavigationTree getNavigation()



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi();
try {
    NavigationTree result = apiInstance.getNavigation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaApplicationMetadataApi#getNavigation");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**NavigationTree**](NavigationTree.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

