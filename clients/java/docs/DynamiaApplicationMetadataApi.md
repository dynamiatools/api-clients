# DynamiaApplicationMetadataApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeEntityAction**](DynamiaApplicationMetadataApi.md#executeEntityAction) | **POST** /api/app/metadata/entities/{className}/action/{action} |  |
| [**executeEntityAction1**](DynamiaApplicationMetadataApi.md#executeEntityAction1) | **GET** /api/app/metadata/entities/{className}/views |  |
| [**executeGlobalAction**](DynamiaApplicationMetadataApi.md#executeGlobalAction) | **POST** /api/app/metadata/actions/{action} |  |
| [**getEntities**](DynamiaApplicationMetadataApi.md#getEntities) | **GET** /api/app/metadata/entities |  |
| [**getEntityMetadata**](DynamiaApplicationMetadataApi.md#getEntityMetadata) | **GET** /api/app/metadata/entities/{className} |  |
| [**getEntityViewDescriptor**](DynamiaApplicationMetadataApi.md#getEntityViewDescriptor) | **GET** /api/app/metadata/entities/{className}/views/{view} |  |
| [**getGlobalActions**](DynamiaApplicationMetadataApi.md#getGlobalActions) | **GET** /api/app/metadata/actions |  |
| [**getMetadata**](DynamiaApplicationMetadataApi.md#getMetadata) | **GET** /api/app/metadata |  |
| [**getNavigation**](DynamiaApplicationMetadataApi.md#getNavigation) | **GET** /api/app/metadata/navigation |  |



## executeEntityAction

> ActionExecutionResponse executeEntityAction(className, action, actionExecutionRequest)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        String className = "className_example"; // String | 
        String action = "action_example"; // String | 
        ActionExecutionRequest actionExecutionRequest = new ActionExecutionRequest(); // ActionExecutionRequest | 
        try {
            ActionExecutionResponse result = apiInstance.executeEntityAction(className, action, actionExecutionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#executeEntityAction");
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
| **action** | **String**|  | |
| **actionExecutionRequest** | [**ActionExecutionRequest**](ActionExecutionRequest.md)|  | |

### Return type

[**ActionExecutionResponse**](ActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeEntityAction1

> List&lt;ViewDescriptor&gt; executeEntityAction1(className)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        String className = "className_example"; // String | 
        try {
            List<ViewDescriptor> result = apiInstance.executeEntityAction1(className);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#executeEntityAction1");
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

### Return type

[**List&lt;ViewDescriptor&gt;**](ViewDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeGlobalAction

> ActionExecutionResponse executeGlobalAction(action, request)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        String action = "action_example"; // String | 
        ActionExecutionRequest request = new ActionExecutionRequest(); // ActionExecutionRequest | 
        try {
            ActionExecutionResponse result = apiInstance.executeGlobalAction(action, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#executeGlobalAction");
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
| **action** | **String**|  | |
| **request** | [**ActionExecutionRequest**](.md)|  | |

### Return type

[**ActionExecutionResponse**](ActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEntities

> ApplicationMetadataEntities getEntities()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        try {
            ApplicationMetadataEntities result = apiInstance.getEntities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#getEntities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEntityMetadata

> EntityMetadata getEntityMetadata(className)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        String className = "className_example"; // String | 
        try {
            EntityMetadata result = apiInstance.getEntityMetadata(className);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#getEntityMetadata");
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

### Return type

[**EntityMetadata**](EntityMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEntityViewDescriptor

> ViewDescriptor getEntityViewDescriptor(className, view)



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        String className = "className_example"; // String | 
        String view = "view_example"; // String | 
        try {
            ViewDescriptor result = apiInstance.getEntityViewDescriptor(className, view);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#getEntityViewDescriptor");
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
| **view** | **String**|  | |

### Return type

[**ViewDescriptor**](ViewDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGlobalActions

> ApplicationMetadataActions getGlobalActions()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        try {
            ApplicationMetadataActions result = apiInstance.getGlobalActions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#getGlobalActions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMetadata

> ApplicationMetadata getMetadata()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        try {
            ApplicationMetadata result = apiInstance.getMetadata();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#getMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getNavigation

> NavigationTree getNavigation()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaApplicationMetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaApplicationMetadataApi apiInstance = new DynamiaApplicationMetadataApi(defaultClient);
        try {
            NavigationTree result = apiInstance.getNavigation();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaApplicationMetadataApi#getNavigation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

