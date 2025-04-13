# DynamiaCrudServiceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrSave**](DynamiaCrudServiceApi.md#createOrSave) | **POST** /crud-service/{className} | 
[**createOrSave1**](DynamiaCrudServiceApi.md#createOrSave1) | **PUT** /crud-service/{className} | 
[**delete**](DynamiaCrudServiceApi.md#delete) | **DELETE** /crud-service/{className}/{id} | 
[**find**](DynamiaCrudServiceApi.md#find) | **POST** /crud-service/{className}/find | 
[**get**](DynamiaCrudServiceApi.md#get) | **GET** /crud-service/{className}/{id} | 
[**getId**](DynamiaCrudServiceApi.md#getId) | **POST** /crud-service/{className}/id | 



## createOrSave

> Object createOrSave(className, body)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaCrudServiceApi;

DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi();
String className = null; // String | 
String body = "body_example"; // String | 
try {
    Object result = apiInstance.createOrSave(className, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaCrudServiceApi#createOrSave");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **body** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createOrSave1

> Object createOrSave1(className, body)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaCrudServiceApi;

DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi();
String className = null; // String | 
String body = "body_example"; // String | 
try {
    Object result = apiInstance.createOrSave1(className, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaCrudServiceApi#createOrSave1");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **body** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete

> Object delete(className, id)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaCrudServiceApi;

DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi();
String className = null; // String | 
Object id = null; // Object | 
try {
    Object result = apiInstance.delete(className, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaCrudServiceApi#delete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **id** | [**Object**](.md)|  | [default to null]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## find

> List&lt;Object&gt; find(className, queryParameters)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaCrudServiceApi;

DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi();
String className = null; // String | 
QueryParameters queryParameters = new QueryParameters(); // QueryParameters | 
try {
    List<Object> result = apiInstance.find(className, queryParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaCrudServiceApi#find");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **queryParameters** | [**QueryParameters**](QueryParameters.md)|  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get

> Object get(className, id)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaCrudServiceApi;

DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi();
String className = null; // String | 
Object id = null; // Object | 
try {
    Object result = apiInstance.get(className, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaCrudServiceApi#get");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **id** | [**Object**](.md)|  | [default to null]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getId

> Object getId(className, queryParameters)



### Example

```java
// Import classes:
//import tools.dynamia.clients.api.DynamiaCrudServiceApi;

DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi();
String className = null; // String | 
QueryParameters queryParameters = new QueryParameters(); // QueryParameters | 
try {
    Object result = apiInstance.getId(className, queryParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DynamiaCrudServiceApi#getId");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | [default to null]
 **queryParameters** | [**QueryParameters**](QueryParameters.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

