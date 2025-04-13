# DynamiaCrudServiceApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrSave**](DynamiaCrudServiceApi.md#createOrSave) | **POST** /crud-service/{className} |  |
| [**createOrSave1**](DynamiaCrudServiceApi.md#createOrSave1) | **PUT** /crud-service/{className} |  |
| [**delete**](DynamiaCrudServiceApi.md#delete) | **DELETE** /crud-service/{className}/{id} |  |
| [**find**](DynamiaCrudServiceApi.md#find) | **POST** /crud-service/{className}/find |  |
| [**get**](DynamiaCrudServiceApi.md#get) | **GET** /crud-service/{className}/{id} |  |
| [**getId**](DynamiaCrudServiceApi.md#getId) | **POST** /crud-service/{className}/id |  |



## createOrSave

> Object createOrSave(className, body)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaCrudServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi(defaultClient);
        String className = "className_example"; // String | 
        String body = "body_example"; // String | 
        try {
            Object result = apiInstance.createOrSave(className, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaCrudServiceApi#createOrSave");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**|  | |
| **body** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createOrSave1

> Object createOrSave1(className, body)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaCrudServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi(defaultClient);
        String className = "className_example"; // String | 
        String body = "body_example"; // String | 
        try {
            Object result = apiInstance.createOrSave1(className, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaCrudServiceApi#createOrSave1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**|  | |
| **body** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete

> Object delete(className, id)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaCrudServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi(defaultClient);
        String className = "className_example"; // String | 
        Object id = null; // Object | 
        try {
            Object result = apiInstance.delete(className, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaCrudServiceApi#delete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**|  | |
| **id** | [**Object**](.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## find

> List&lt;Object&gt; find(className, queryParameters)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaCrudServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi(defaultClient);
        String className = "className_example"; // String | 
        QueryParameters queryParameters = new QueryParameters(); // QueryParameters | 
        try {
            List<Object> result = apiInstance.find(className, queryParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaCrudServiceApi#find");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**|  | |
| **queryParameters** | [**QueryParameters**](QueryParameters.md)|  | |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## get

> Object get(className, id)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaCrudServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi(defaultClient);
        String className = "className_example"; // String | 
        Object id = null; // Object | 
        try {
            Object result = apiInstance.get(className, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaCrudServiceApi#get");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**|  | |
| **id** | [**Object**](.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getId

> Object getId(className, queryParameters)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaCrudServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaCrudServiceApi apiInstance = new DynamiaCrudServiceApi(defaultClient);
        String className = "className_example"; // String | 
        QueryParameters queryParameters = new QueryParameters(); // QueryParameters | 
        try {
            Object result = apiInstance.getId(className, queryParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaCrudServiceApi#getId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **className** | **String**|  | |
| **queryParameters** | [**QueryParameters**](QueryParameters.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

