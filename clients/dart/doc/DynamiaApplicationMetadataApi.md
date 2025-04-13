# dynamiatools_api.api.DynamiaApplicationMetadataApi

## Load the API package
```dart
import 'package:dynamiatools_api/api.dart';
```

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeEntityAction**](DynamiaApplicationMetadataApi.md#executeentityaction) | **POST** /api/app/metadata/entities/{className}/action/{action} | 
[**executeEntityAction1**](DynamiaApplicationMetadataApi.md#executeentityaction1) | **GET** /api/app/metadata/entities/{className}/views | 
[**executeGlobalAction**](DynamiaApplicationMetadataApi.md#executeglobalaction) | **POST** /api/app/metadata/actions/{action} | 
[**getEntities**](DynamiaApplicationMetadataApi.md#getentities) | **GET** /api/app/metadata/entities | 
[**getEntityMetadata**](DynamiaApplicationMetadataApi.md#getentitymetadata) | **GET** /api/app/metadata/entities/{className} | 
[**getEntityViewDescriptor**](DynamiaApplicationMetadataApi.md#getentityviewdescriptor) | **GET** /api/app/metadata/entities/{className}/views/{view} | 
[**getGlobalActions**](DynamiaApplicationMetadataApi.md#getglobalactions) | **GET** /api/app/metadata/actions | 
[**getMetadata**](DynamiaApplicationMetadataApi.md#getmetadata) | **GET** /api/app/metadata | 
[**getNavigation**](DynamiaApplicationMetadataApi.md#getnavigation) | **GET** /api/app/metadata/navigation | 


# **executeEntityAction**
> ActionExecutionResponse executeEntityAction(className, action, actionExecutionRequest)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();
final className = className_example; // String | 
final action = action_example; // String | 
final actionExecutionRequest = ActionExecutionRequest(); // ActionExecutionRequest | 

try {
    final result = api_instance.executeEntityAction(className, action, actionExecutionRequest);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->executeEntityAction: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **action** | **String**|  | 
 **actionExecutionRequest** | [**ActionExecutionRequest**](ActionExecutionRequest.md)|  | 

### Return type

[**ActionExecutionResponse**](ActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executeEntityAction1**
> List<ViewDescriptor> executeEntityAction1(className)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();
final className = className_example; // String | 

try {
    final result = api_instance.executeEntityAction1(className);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->executeEntityAction1: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 

### Return type

[**List<ViewDescriptor>**](ViewDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executeGlobalAction**
> ActionExecutionResponse executeGlobalAction(action, request)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();
final action = action_example; // String | 
final request = ; // ActionExecutionRequest | 

try {
    final result = api_instance.executeGlobalAction(action, request);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->executeGlobalAction: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | 
 **request** | [**ActionExecutionRequest**](.md)|  | 

### Return type

[**ActionExecutionResponse**](ActionExecutionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEntities**
> ApplicationMetadataEntities getEntities()



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();

try {
    final result = api_instance.getEntities();
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->getEntities: $e\n');
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEntityMetadata**
> EntityMetadata getEntityMetadata(className)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();
final className = className_example; // String | 

try {
    final result = api_instance.getEntityMetadata(className);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->getEntityMetadata: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 

### Return type

[**EntityMetadata**](EntityMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEntityViewDescriptor**
> ViewDescriptor getEntityViewDescriptor(className, view)



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();
final className = className_example; // String | 
final view = view_example; // String | 

try {
    final result = api_instance.getEntityViewDescriptor(className, view);
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->getEntityViewDescriptor: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **className** | **String**|  | 
 **view** | **String**|  | 

### Return type

[**ViewDescriptor**](ViewDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getGlobalActions**
> ApplicationMetadataActions getGlobalActions()



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();

try {
    final result = api_instance.getGlobalActions();
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->getGlobalActions: $e\n');
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMetadata**
> ApplicationMetadata getMetadata()



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();

try {
    final result = api_instance.getMetadata();
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->getMetadata: $e\n');
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNavigation**
> NavigationTree getNavigation()



### Example
```dart
import 'package:dynamiatools_api/api.dart';

final api_instance = DynamiaApplicationMetadataApi();

try {
    final result = api_instance.getNavigation();
    print(result);
} catch (e) {
    print('Exception when calling DynamiaApplicationMetadataApi->getNavigation: $e\n');
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

