# DynamiaPeriodicTasksApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeAfternoonTasks**](DynamiaPeriodicTasksApi.md#executeAfternoonTasks) | **GET** /schedule/execute-tasks/afternoon |  |
| [**executeMiddayTasks**](DynamiaPeriodicTasksApi.md#executeMiddayTasks) | **GET** /schedule/execute-tasks/midday |  |
| [**executeMidnightTasks**](DynamiaPeriodicTasksApi.md#executeMidnightTasks) | **GET** /schedule/execute-tasks/evening |  |
| [**executeMorningTasks**](DynamiaPeriodicTasksApi.md#executeMorningTasks) | **GET** /schedule/execute-tasks/morning |  |



## executeAfternoonTasks

> executeAfternoonTasks()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaPeriodicTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaPeriodicTasksApi apiInstance = new DynamiaPeriodicTasksApi(defaultClient);
        try {
            apiInstance.executeAfternoonTasks();
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaPeriodicTasksApi#executeAfternoonTasks");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeMiddayTasks

> executeMiddayTasks()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaPeriodicTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaPeriodicTasksApi apiInstance = new DynamiaPeriodicTasksApi(defaultClient);
        try {
            apiInstance.executeMiddayTasks();
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaPeriodicTasksApi#executeMiddayTasks");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeMidnightTasks

> executeMidnightTasks()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaPeriodicTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaPeriodicTasksApi apiInstance = new DynamiaPeriodicTasksApi(defaultClient);
        try {
            apiInstance.executeMidnightTasks();
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaPeriodicTasksApi#executeMidnightTasks");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeMorningTasks

> executeMorningTasks()



### Example

```java
// Import classes:
import tools.dynamia.clients.ApiClient;
import tools.dynamia.clients.ApiException;
import tools.dynamia.clients.Configuration;
import tools.dynamia.clients.models.*;
import tools.dynamia.clients.api.DynamiaPeriodicTasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        DynamiaPeriodicTasksApi apiInstance = new DynamiaPeriodicTasksApi(defaultClient);
        try {
            apiInstance.executeMorningTasks();
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamiaPeriodicTasksApi#executeMorningTasks");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

