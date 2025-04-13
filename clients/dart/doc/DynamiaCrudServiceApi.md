# dynamiatools_api.api.DynamiaCrudServiceApi

## Load the API package
```dart
import 'package:dynamiatools_api/api.dart';
```

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callGet**](DynamiaCrudServiceApi.md#callget) | **GET** /crud-service/{className}/{id} | 
[**createOrSave**](DynamiaCrudServiceApi.md#createorsave) | **POST** /crud-service/{className} | 
[**createOrSave1**](DynamiaCrudServiceApi.md#createorsave1) | **PUT** /crud-service/{className} | 
[**delete**](DynamiaCrudServiceApi.md#delete) | **DELETE** /crud-service/{className}/{id} | 
[**find**](DynamiaCrudServiceApi.md#find) | **POST** /crud-service/{className}/find | 
[**getId**](DynamiaCrudServiceApi.md#getid) | **POST** /crud-service/{className}/id | 


# **callGet**
> Object callGet(className, id)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaCrudServiceApi();
final className = className_example; // String | 
final id = Object; // Object | 

try {
    final result = api_instance.callGet(className, id);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaCrudServiceApi->callGet: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **id** | [**Object**](.md)|  | 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createOrSave**
> Object createOrSave(className, body)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaCrudServiceApi();
final className = className_example; // String | 
final body = String(); // String | 

try {
    final result = api_instance.createOrSave(className, body);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaCrudServiceApi->createOrSave: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **body** | **String**|  | 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createOrSave1**
> Object createOrSave1(className, body)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaCrudServiceApi();
final className = className_example; // String | 
final body = String(); // String | 

try {
    final result = api_instance.createOrSave1(className, body);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaCrudServiceApi->createOrSave1: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **body** | **String**|  | 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> Object delete(className, id)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaCrudServiceApi();
final className = className_example; // String | 
final id = Object; // Object | 

try {
    final result = api_instance.delete(className, id);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaCrudServiceApi->delete: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **id** | [**Object**](.md)|  | 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find**
> List<Object> find(className, queryParameters)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaCrudServiceApi();
final className = className_example; // String | 
final queryParameters = QueryParameters(); // QueryParameters | 

try {
    final result = api_instance.find(className, queryParameters);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaCrudServiceApi->find: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **queryParameters** | [**QueryParameters**](QueryParameters.md)|  | 

### Return type

[**List<Object>**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getId**
> Object getId(className, queryParameters)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaCrudServiceApi();
final className = className_example; // String | 
final queryParameters = QueryParameters(); // QueryParameters | 

try {
    final result = api_instance.getId(className, queryParameters);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaCrudServiceApi->getId: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **queryParameters** | [**QueryParameters**](QueryParameters.md)|  | 

### Return type

[**Object**](Object.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

