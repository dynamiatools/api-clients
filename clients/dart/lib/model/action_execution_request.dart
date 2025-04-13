//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ActionExecutionRequest {
  /// Returns a new [ActionExecutionRequest] instance.
  ActionExecutionRequest({
    this.data,
    this.params = const {},
    this.source_,
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
  bool operator ==(Object other) => identical(this, other) || other is ActionExecutionRequest &&
    other.data == data &&
    _deepEquality.equals(other.params, params) &&
    other.source_ == source_ &&
    other.dataType == dataType &&
    other.dataId == dataId &&
    other.dataName == dataName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data == null ? 0 : data!.hashCode) +
    (params.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (dataType == null ? 0 : dataType!.hashCode) +
    (dataId == null ? 0 : dataId!.hashCode) +
    (dataName == null ? 0 : dataName!.hashCode);

  @override
  String toString() => 'ActionExecutionRequest[data=$data, params=$params, source_=$source_, dataType=$dataType, dataId=$dataId, dataName=$dataName]';

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

  /// Returns a new [ActionExecutionRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ActionExecutionRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ActionExecutionRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ActionExecutionRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ActionExecutionRequest(
        data: mapValueOfType<Object>(json, r'data'),
        params: mapCastOfType<String, Object>(json, r'params') ?? const {},
        source_: mapValueOfType<String>(json, r'source'),
        dataType: mapValueOfType<String>(json, r'dataType'),
        dataId: mapValueOfType<String>(json, r'dataId'),
        dataName: mapValueOfType<String>(json, r'dataName'),
      );
    }
    return null;
  }

  static List<ActionExecutionRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ActionExecutionRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ActionExecutionRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ActionExecutionRequest> mapFromJson(dynamic json) {
    final map = <String, ActionExecutionRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ActionExecutionRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ActionExecutionRequest-objects as value to a dart map
  static Map<String, List<ActionExecutionRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ActionExecutionRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ActionExecutionRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

