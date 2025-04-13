//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ActionExecutionResponse {
  /// Returns a new [ActionExecutionResponse] instance.
  ActionExecutionResponse({
    this.data,
    this.params = const {},
    this.source_,
    this.status,
    this.statusCode,
    this.dataType,
    this.dataId,
    this.dataName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? data;

  Map<String, Object> params;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? source_;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? statusCode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? dataType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? dataId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? dataName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ActionExecutionResponse &&
    other.data == data &&
    _deepEquality.equals(other.params, params) &&
    other.source_ == source_ &&
    other.status == status &&
    other.statusCode == statusCode &&
    other.dataType == dataType &&
    other.dataId == dataId &&
    other.dataName == dataName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data == null ? 0 : data!.hashCode) +
    (params.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (statusCode == null ? 0 : statusCode!.hashCode) +
    (dataType == null ? 0 : dataType!.hashCode) +
    (dataId == null ? 0 : dataId!.hashCode) +
    (dataName == null ? 0 : dataName!.hashCode);

  @override
  String toString() => 'ActionExecutionResponse[data=$data, params=$params, source_=$source_, status=$status, statusCode=$statusCode, dataType=$dataType, dataId=$dataId, dataName=$dataName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.data != null) {
      json[r'data'] = this.data;
    } else {
      json[r'data'] = null;
    }
      json[r'params'] = this.params;
    if (this.source_ != null) {
      json[r'source'] = this.source_;
    } else {
      json[r'source'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.statusCode != null) {
      json[r'statusCode'] = this.statusCode;
    } else {
      json[r'statusCode'] = null;
    }
    if (this.dataType != null) {
      json[r'dataType'] = this.dataType;
    } else {
      json[r'dataType'] = null;
    }
    if (this.dataId != null) {
      json[r'dataId'] = this.dataId;
    } else {
      json[r'dataId'] = null;
    }
    if (this.dataName != null) {
      json[r'dataName'] = this.dataName;
    } else {
      json[r'dataName'] = null;
    }
    return json;
  }

  /// Returns a new [ActionExecutionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ActionExecutionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ActionExecutionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ActionExecutionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ActionExecutionResponse(
        data: mapValueOfType<Object>(json, r'data'),
        params: mapCastOfType<String, Object>(json, r'params') ?? const {},
        source_: mapValueOfType<String>(json, r'source'),
        status: mapValueOfType<String>(json, r'status'),
        statusCode: mapValueOfType<int>(json, r'statusCode'),
        dataType: mapValueOfType<String>(json, r'dataType'),
        dataId: mapValueOfType<String>(json, r'dataId'),
        dataName: mapValueOfType<String>(json, r'dataName'),
      );
    }
    return null;
  }

  static List<ActionExecutionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ActionExecutionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ActionExecutionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ActionExecutionResponse> mapFromJson(dynamic json) {
    final map = <String, ActionExecutionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ActionExecutionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ActionExecutionResponse-objects as value to a dart map
  static Map<String, List<ActionExecutionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ActionExecutionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ActionExecutionResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

