//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class EntityMetadata {
  /// Returns a new [EntityMetadata] instance.
  EntityMetadata({
    this.id,
    this.name,
    this.endpoint,
    this.description,
    this.icon,
    this.className,
    this.actions = const [],
    this.descriptors = const [],
    this.actionsEndpoint,
    this.viewsEndpoint,
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
  String? className;

  List<ActionMetadata> actions;

  List<ViewDescriptorMetadata> descriptors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? actionsEndpoint;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? viewsEndpoint;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EntityMetadata &&
    other.id == id &&
    other.name == name &&
    other.endpoint == endpoint &&
    other.description == description &&
    other.icon == icon &&
    other.className == className &&
    _deepEquality.equals(other.actions, actions) &&
    _deepEquality.equals(other.descriptors, descriptors) &&
    other.actionsEndpoint == actionsEndpoint &&
    other.viewsEndpoint == viewsEndpoint;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (endpoint == null ? 0 : endpoint!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (icon == null ? 0 : icon!.hashCode) +
    (className == null ? 0 : className!.hashCode) +
    (actions.hashCode) +
    (descriptors.hashCode) +
    (actionsEndpoint == null ? 0 : actionsEndpoint!.hashCode) +
    (viewsEndpoint == null ? 0 : viewsEndpoint!.hashCode);

  @override
  String toString() => 'EntityMetadata[id=$id, name=$name, endpoint=$endpoint, description=$description, icon=$icon, className=$className, actions=$actions, descriptors=$descriptors, actionsEndpoint=$actionsEndpoint, viewsEndpoint=$viewsEndpoint]';

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
    if (this.className != null) {
      json[r'className'] = this.className;
    } else {
      json[r'className'] = null;
    }
      json[r'actions'] = this.actions;
      json[r'descriptors'] = this.descriptors;
    if (this.actionsEndpoint != null) {
      json[r'actionsEndpoint'] = this.actionsEndpoint;
    } else {
      json[r'actionsEndpoint'] = null;
    }
    if (this.viewsEndpoint != null) {
      json[r'viewsEndpoint'] = this.viewsEndpoint;
    } else {
      json[r'viewsEndpoint'] = null;
    }
    return json;
  }

  /// Returns a new [EntityMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EntityMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EntityMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EntityMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EntityMetadata(
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        endpoint: mapValueOfType<String>(json, r'endpoint'),
        description: mapValueOfType<String>(json, r'description'),
        icon: mapValueOfType<String>(json, r'icon'),
        className: mapValueOfType<String>(json, r'className'),
        actions: ActionMetadata.listFromJson(json[r'actions']),
        descriptors: ViewDescriptorMetadata.listFromJson(json[r'descriptors']),
        actionsEndpoint: mapValueOfType<String>(json, r'actionsEndpoint'),
        viewsEndpoint: mapValueOfType<String>(json, r'viewsEndpoint'),
      );
    }
    return null;
  }

  static List<EntityMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EntityMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EntityMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EntityMetadata> mapFromJson(dynamic json) {
    final map = <String, EntityMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EntityMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EntityMetadata-objects as value to a dart map
  static Map<String, List<EntityMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EntityMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EntityMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

