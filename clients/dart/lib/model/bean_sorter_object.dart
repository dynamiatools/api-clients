//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class BeanSorterObject {
  /// Returns a new [BeanSorterObject] instance.
  BeanSorterObject({
    this.ascending,
    this.columnName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? ascending;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? columnName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BeanSorterObject &&
    other.ascending == ascending &&
    other.columnName == columnName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ascending == null ? 0 : ascending!.hashCode) +
    (columnName == null ? 0 : columnName!.hashCode);

  @override
  String toString() => 'BeanSorterObject[ascending=$ascending, columnName=$columnName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ascending != null) {
      json[r'ascending'] = this.ascending;
    } else {
      json[r'ascending'] = null;
    }
    if (this.columnName != null) {
      json[r'columnName'] = this.columnName;
    } else {
      json[r'columnName'] = null;
    }
    return json;
  }

  /// Returns a new [BeanSorterObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BeanSorterObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BeanSorterObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BeanSorterObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BeanSorterObject(
        ascending: mapValueOfType<bool>(json, r'ascending'),
        columnName: mapValueOfType<String>(json, r'columnName'),
      );
    }
    return null;
  }

  static List<BeanSorterObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BeanSorterObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BeanSorterObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BeanSorterObject> mapFromJson(dynamic json) {
    final map = <String, BeanSorterObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BeanSorterObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BeanSorterObject-objects as value to a dart map
  static Map<String, List<BeanSorterObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BeanSorterObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BeanSorterObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

