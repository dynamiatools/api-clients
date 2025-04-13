//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class DataPaginator {
  /// Returns a new [DataPaginator] instance.
  DataPaginator({
    this.totalSize,
    this.pageSize,
    this.firstResult,
    this.page,
    this.pagesNumber,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? totalSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pageSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? firstResult;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? page;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pagesNumber;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DataPaginator &&
    other.totalSize == totalSize &&
    other.pageSize == pageSize &&
    other.firstResult == firstResult &&
    other.page == page &&
    other.pagesNumber == pagesNumber;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (totalSize == null ? 0 : totalSize!.hashCode) +
    (pageSize == null ? 0 : pageSize!.hashCode) +
    (firstResult == null ? 0 : firstResult!.hashCode) +
    (page == null ? 0 : page!.hashCode) +
    (pagesNumber == null ? 0 : pagesNumber!.hashCode);

  @override
  String toString() => 'DataPaginator[totalSize=$totalSize, pageSize=$pageSize, firstResult=$firstResult, page=$page, pagesNumber=$pagesNumber]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.totalSize != null) {
      json[r'totalSize'] = this.totalSize;
    } else {
      json[r'totalSize'] = null;
    }
    if (this.pageSize != null) {
      json[r'pageSize'] = this.pageSize;
    } else {
      json[r'pageSize'] = null;
    }
    if (this.firstResult != null) {
      json[r'firstResult'] = this.firstResult;
    } else {
      json[r'firstResult'] = null;
    }
    if (this.page != null) {
      json[r'page'] = this.page;
    } else {
      json[r'page'] = null;
    }
    if (this.pagesNumber != null) {
      json[r'pagesNumber'] = this.pagesNumber;
    } else {
      json[r'pagesNumber'] = null;
    }
    return json;
  }

  /// Returns a new [DataPaginator] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DataPaginator? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DataPaginator[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DataPaginator[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DataPaginator(
        totalSize: mapValueOfType<int>(json, r'totalSize'),
        pageSize: mapValueOfType<int>(json, r'pageSize'),
        firstResult: mapValueOfType<int>(json, r'firstResult'),
        page: mapValueOfType<int>(json, r'page'),
        pagesNumber: mapValueOfType<int>(json, r'pagesNumber'),
      );
    }
    return null;
  }

  static List<DataPaginator> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DataPaginator>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DataPaginator.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DataPaginator> mapFromJson(dynamic json) {
    final map = <String, DataPaginator>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DataPaginator.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DataPaginator-objects as value to a dart map
  static Map<String, List<DataPaginator>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DataPaginator>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DataPaginator.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

