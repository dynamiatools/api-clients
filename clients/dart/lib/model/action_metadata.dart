//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ActionMetadata {
  /// Returns a new [ActionMetadata] instance.
  ActionMetadata({
    this.id,
    this.name,
    this.endpoint,
    this.description,
    this.icon,
    this.group,
    this.renderer,
    this.applicableClasses = const [],
    this.applicableStates = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? endpoint;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? icon;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? group;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? renderer;

  List<String> applicableClasses;

  List<String> applicableStates;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ActionMetadata &&
    other.id == id &&
    other.name == name &&
    other.endpoint == endpoint &&
    other.description == description &&
    other.icon == icon &&
    other.group == group &&
    other.renderer == renderer &&
    _deepEquality.equals(other.applicableClasses, applicableClasses) &&
    _deepEquality.equals(other.applicableStates, applicableStates);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (endpoint == null ? 0 : endpoint!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (icon == null ? 0 : icon!.hashCode) +
    (group == null ? 0 : group!.hashCode) +
    (renderer == null ? 0 : renderer!.hashCode) +
    (applicableClasses.hashCode) +
    (applicableStates.hashCode);

  @override
  String toString() => 'ActionMetadata[id=$id, name=$name, endpoint=$endpoint, description=$description, icon=$icon, group=$group, renderer=$renderer, applicableClasses=$applicableClasses, applicableStates=$applicableStates]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.endpoint != null) {
      json[r'endpoint'] = this.endpoint;
    } else {
      json[r'endpoint'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.icon != null) {
      json[r'icon'] = this.icon;
    } else {
      json[r'icon'] = null;
    }
    if (this.group != null) {
      json[r'group'] = this.group;
    } else {
      json[r'group'] = null;
    }
    if (this.renderer != null) {
      json[r'renderer'] = this.renderer;
    } else {
      json[r'renderer'] = null;
    }
      json[r'applicableClasses'] = this.applicableClasses;
      json[r'applicableStates'] = this.applicableStates;
    return json;
  }

  /// Returns a new [ActionMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ActionMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ActionMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ActionMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ActionMetadata(
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        endpoint: mapValueOfType<String>(json, r'endpoint'),
        description: mapValueOfType<String>(json, r'description'),
        icon: mapValueOfType<String>(json, r'icon'),
        group: mapValueOfType<String>(json, r'group'),
        renderer: mapValueOfType<String>(json, r'renderer'),
        applicableClasses: json[r'applicableClasses'] is Iterable
            ? (json[r'applicableClasses'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        applicableStates: json[r'applicableStates'] is Iterable
            ? (json[r'applicableStates'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ActionMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ActionMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ActionMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ActionMetadata> mapFromJson(dynamic json) {
    final map = <String, ActionMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ActionMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ActionMetadata-objects as value to a dart map
  static Map<String, List<ActionMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ActionMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ActionMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

