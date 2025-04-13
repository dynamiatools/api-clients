//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;


class DynamiaCrudServiceApi {
  DynamiaCrudServiceApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Performs an HTTP 'GET /crud-service/{className}/{id}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [Object] id (required):
  Future<Response> callGetWithHttpInfo(String className, Object id,) async {
    // ignore: prefer_const_declarations
    final path = r'/crud-service/{className}/{id}'
      .replaceAll('{className}', className)
      .replaceAll('{id}', id.toString());

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
  /// * [Object] id (required):
  Future<Object?> callGet(String className, Object id,) async {
    final response = await callGetWithHttpInfo(className, id,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Object',) as Object;
    
    }
    return null;
  }

  /// Performs an HTTP 'POST /crud-service/{className}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [String] body (required):
  Future<Response> createOrSaveWithHttpInfo(String className, String body,) async {
    // ignore: prefer_const_declarations
    final path = r'/crud-service/{className}'
      .replaceAll('{className}', className);

    // ignore: prefer_final_locals
    Object? postBody = body;

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
  /// * [String] body (required):
  Future<Object?> createOrSave(String className, String body,) async {
    final response = await createOrSaveWithHttpInfo(className, body,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Object',) as Object;
    
    }
    return null;
  }

  /// Performs an HTTP 'PUT /crud-service/{className}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [String] body (required):
  Future<Response> createOrSave1WithHttpInfo(String className, String body,) async {
    // ignore: prefer_const_declarations
    final path = r'/crud-service/{className}'
      .replaceAll('{className}', className);

    // ignore: prefer_final_locals
    Object? postBody = body;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'PUT',
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
  /// * [String] body (required):
  Future<Object?> createOrSave1(String className, String body,) async {
    final response = await createOrSave1WithHttpInfo(className, body,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Object',) as Object;
    
    }
    return null;
  }

  /// Performs an HTTP 'DELETE /crud-service/{className}/{id}' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [Object] id (required):
  Future<Response> deleteWithHttpInfo(String className, Object id,) async {
    // ignore: prefer_const_declarations
    final path = r'/crud-service/{className}/{id}'
      .replaceAll('{className}', className)
      .replaceAll('{id}', id.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
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
  /// * [Object] id (required):
  Future<Object?> delete(String className, Object id,) async {
    final response = await deleteWithHttpInfo(className, id,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Object',) as Object;
    
    }
    return null;
  }

  /// Performs an HTTP 'POST /crud-service/{className}/find' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [QueryParameters] queryParameters (required):
  Future<Response> findWithHttpInfo(String className, QueryParameters queryParameters,) async {
    // ignore: prefer_const_declarations
    final path = r'/crud-service/{className}/find'
      .replaceAll('{className}', className);

    // ignore: prefer_final_locals
    Object? postBody = queryParameters;

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
  /// * [QueryParameters] queryParameters (required):
  Future<List<Object>?> find(String className, QueryParameters queryParameters,) async {
    final response = await findWithHttpInfo(className, queryParameters,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<Object>') as List)
        .cast<Object>()
        .toList(growable: false);

    }
    return null;
  }

  /// Performs an HTTP 'POST /crud-service/{className}/id' operation and returns the [Response].
  /// Parameters:
  ///
  /// * [String] className (required):
  ///
  /// * [QueryParameters] queryParameters (required):
  Future<Response> getIdWithHttpInfo(String className, QueryParameters queryParameters,) async {
    // ignore: prefer_const_declarations
    final path = r'/crud-service/{className}/id'
      .replaceAll('{className}', className);

    // ignore: prefer_final_locals
    Object? postBody = queryParameters;

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
  /// * [QueryParameters] queryParameters (required):
  Future<Object?> getId(String className, QueryParameters queryParameters,) async {
    final response = await getIdWithHttpInfo(className, queryParameters,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Object',) as Object;
    
    }
    return null;
  }
}
