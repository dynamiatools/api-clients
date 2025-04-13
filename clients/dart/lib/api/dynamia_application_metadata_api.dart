//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;


class DynamiaApplicationMetadataApi {
  DynamiaApplicationMetadataApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'POST /api/app/metadata/entities/{className}/action/{action}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [String] action (required):
  ///
  /// * [ActionExecutionRequest] actionExecutionRequest (required):
  Future<Response> executeEntityActionWithHttpInfo(String className, String action, ActionExecutionRequest actionExecutionRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/entities/{className}/action/{action}'
      .replaceAll('{className}', className)
      .replaceAll('{action}', action);

    // ignore: prefer_final_locals
    Object? postBody = actionExecutionRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [String] action (required):
  ///
  /// * [ActionExecutionRequest] actionExecutionRequest (required):
  Future<ActionExecutionResponse?> executeEntityAction(String className, String action, ActionExecutionRequest actionExecutionRequest,) async {
    final response = await executeEntityActionWithHttpInfo(className, action, actionExecutionRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ActionExecutionResponse',) as ActionExecutionResponse;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata/entities/{className}/views' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  Future<Response> executeEntityAction1WithHttpInfo(String className,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/entities/{className}/views'
      .replaceAll('{className}', className);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Parameters:
  ///
  /// * [String] className (required):
  Future<List<ViewDescriptor>?> executeEntityAction1(String className,) async {
    final response = await executeEntityAction1WithHttpInfo(className,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<ViewDescriptor>') as List)
        .cast<ViewDescriptor>()
        .toList(growable: false);

    }
    return null;
  }

  /// Performs an HTTP 'POST /api/app/metadata/actions/{action}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] action (required):
  ///
  /// * [ActionExecutionRequest] request (required):
  Future<Response> executeGlobalActionWithHttpInfo(String action, ActionExecutionRequest request,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/actions/{action}'
      .replaceAll('{action}', action);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'request', request));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Parameters:
  ///
  /// * [String] action (required):
  ///
  /// * [ActionExecutionRequest] request (required):
  Future<ActionExecutionResponse?> executeGlobalAction(String action, ActionExecutionRequest request,) async {
    final response = await executeGlobalActionWithHttpInfo(action, request,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ActionExecutionResponse',) as ActionExecutionResponse;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata/entities' operation and returns the [Response].
  Future<Response> getEntitiesWithHttpInfo() async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/entities';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  Future<ApplicationMetadataEntities?> getEntities() async {
    final response = await getEntitiesWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ApplicationMetadataEntities',) as ApplicationMetadataEntities;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata/entities/{className}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  Future<Response> getEntityMetadataWithHttpInfo(String className,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/entities/{className}'
      .replaceAll('{className}', className);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Parameters:
  ///
  /// * [String] className (required):
  Future<EntityMetadata?> getEntityMetadata(String className,) async {
    final response = await getEntityMetadataWithHttpInfo(className,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'EntityMetadata',) as EntityMetadata;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata/entities/{className}/views/{view}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [String] view (required):
  Future<Response> getEntityViewDescriptorWithHttpInfo(String className, String view,) async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/entities/{className}/views/{view}'
      .replaceAll('{className}', className)
      .replaceAll('{view}', view);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [String] view (required):
  Future<ViewDescriptor?> getEntityViewDescriptor(String className, String view,) async {
    final response = await getEntityViewDescriptorWithHttpInfo(className, view,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ViewDescriptor',) as ViewDescriptor;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata/actions' operation and returns the [Response].
  Future<Response> getGlobalActionsWithHttpInfo() async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/actions';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  Future<ApplicationMetadataActions?> getGlobalActions() async {
    final response = await getGlobalActionsWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ApplicationMetadataActions',) as ApplicationMetadataActions;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata' operation and returns the [Response].
  Future<Response> getMetadataWithHttpInfo() async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  Future<ApplicationMetadata?> getMetadata() async {
    final response = await getMetadataWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ApplicationMetadata',) as ApplicationMetadata;
    
    }
    return null;
  }

  /// Performs an HTTP 'GET /api/app/metadata/navigation' operation and returns the [Response].
  Future<Response> getNavigationWithHttpInfo() async {
    // ignore: prefer_const_declarations
    final path = r'/api/app/metadata/navigation';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  Future<NavigationTree?> getNavigation() async {
    final response = await getNavigationWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'NavigationTree',) as NavigationTree;
    
    }
    return null;
  }
}
