//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ApplicationMetadataActions {
  /// Returns a new [ApplicationMetadataActions] instance.
  ApplicationMetadataActions({
    this.actions = const [],
  });

  List<ActionMetadata> actions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ApplicationMetadataActions &&
    _deepEquality.equals(other.actions, actions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (actions.hashCode);

  @override
  String toString() => 'ApplicationMetadataActions[actions=$actions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'actions'] = this.actions;
    return json;
  }

  /// Returns a new [ApplicationMetadataActions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ApplicationMetadataActions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ApplicationMetadataActions[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ApplicationMetadataActions[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ApplicationMetadataActions(
        actions: ActionMetadata.listFromJson(json[r'actions']),
      );
    }
    return null;
  }

  static List<ApplicationMetadataActions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ApplicationMetadataActions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ApplicationMetadataActions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ApplicationMetadataActions> mapFromJson(dynamic json) {
    final map = <String, ApplicationMetadataActions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ApplicationMetadataActions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ApplicationMetadataActions-objects as value to a dart map
  static Map<String, List<ApplicationMetadataActions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ApplicationMetadataActions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ApplicationMetadataActions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

