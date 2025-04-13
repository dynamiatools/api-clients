//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class QueryParameters {
  /// Returns a new [QueryParameters] instance.
  QueryParameters({
    this.sorter,
    this.paginator,
    this.autocreateSearcheableStrings,
    this.hints = const {},
    this.depth,
    this.maxResults,
    this.sortedKeys = const [],
    this.sorted,
    this.empty,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BeanSorterObject? sorter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DataPaginator? paginator;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? autocreateSearcheableStrings;

  Map<String, Object> hints;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? depth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxResults;

  List<String> sortedKeys;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? sorted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? empty;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QueryParameters &&
    other.sorter == sorter &&
    other.paginator == paginator &&
    other.autocreateSearcheableStrings == autocreateSearcheableStrings &&
    _deepEquality.equals(other.hints, hints) &&
    other.depth == depth &&
    other.maxResults == maxResults &&
    _deepEquality.equals(other.sortedKeys, sortedKeys) &&
    other.sorted == sorted &&
    other.empty == empty;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (sorter == null ? 0 : sorter!.hashCode) +
    (paginator == null ? 0 : paginator!.hashCode) +
    (autocreateSearcheableStrings == null ? 0 : autocreateSearcheableStrings!.hashCode) +
    (hints.hashCode) +
    (depth == null ? 0 : depth!.hashCode) +
    (maxResults == null ? 0 : maxResults!.hashCode) +
    (sortedKeys.hashCode) +
    (sorted == null ? 0 : sorted!.hashCode) +
    (empty == null ? 0 : empty!.hashCode);

  @override
  String toString() => 'QueryParameters[sorter=$sorter, paginator=$paginator, autocreateSearcheableStrings=$autocreateSearcheableStrings, hints=$hints, depth=$depth, maxResults=$maxResults, sortedKeys=$sortedKeys, sorted=$sorted, empty=$empty]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.sorter != null) {
      json[r'sorter'] = this.sorter;
    } else {
      json[r'sorter'] = null;
    }
    if (this.paginator != null) {
      json[r'paginator'] = this.paginator;
    } else {
      json[r'paginator'] = null;
    }
    if (this.autocreateSearcheableStrings != null) {
      json[r'autocreateSearcheableStrings'] = this.autocreateSearcheableStrings;
    } else {
      json[r'autocreateSearcheableStrings'] = null;
    }
      json[r'hints'] = this.hints;
    if (this.depth != null) {
      json[r'depth'] = this.depth;
    } else {
      json[r'depth'] = null;
    }
    if (this.maxResults != null) {
      json[r'maxResults'] = this.maxResults;
    } else {
      json[r'maxResults'] = null;
    }
      json[r'sortedKeys'] = this.sortedKeys;
    if (this.sorted != null) {
      json[r'sorted'] = this.sorted;
    } else {
      json[r'sorted'] = null;
    }
    if (this.empty != null) {
      json[r'empty'] = this.empty;
    } else {
      json[r'empty'] = null;
    }
    return json;
  }

  /// Returns a new [QueryParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QueryParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QueryParameters[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QueryParameters[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QueryParameters(
        sorter: BeanSorterObject.fromJson(json[r'sorter']),
        paginator: DataPaginator.fromJson(json[r'paginator']),
        autocreateSearcheableStrings: mapValueOfType<bool>(json, r'autocreateSearcheableStrings'),
        hints: mapCastOfType<String, Object>(json, r'hints') ?? const {},
        depth: mapValueOfType<int>(json, r'depth'),
        maxResults: mapValueOfType<int>(json, r'maxResults'),
        sortedKeys: json[r'sortedKeys'] is Iterable
            ? (json[r'sortedKeys'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        sorted: mapValueOfType<bool>(json, r'sorted'),
        empty: mapValueOfType<bool>(json, r'empty'),
      );
    }
    return null;
  }

  static List<QueryParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QueryParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QueryParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QueryParameters> mapFromJson(dynamic json) {
    final map = <String, QueryParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QueryParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QueryParameters-objects as value to a dart map
  static Map<String, List<QueryParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QueryParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QueryParameters.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

