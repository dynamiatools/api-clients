//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class NavigationNode {
  /// Returns a new [NavigationNode] instance.
  NavigationNode({
    this.id,
    this.name,
    this.longName,
    this.type,
    this.description,
    this.icon,
    this.internalPath,
    this.path,
    this.position,
    this.featured,
    this.attributes = const {},
    this.file,
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
  String? longName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

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
  String? internalPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? position;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? featured;

  Map<String, Object> attributes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? file;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NavigationNode &&
    other.id == id &&
    other.name == name &&
    other.longName == longName &&
    other.type == type &&
    other.description == description &&
    other.icon == icon &&
    other.internalPath == internalPath &&
    other.path == path &&
    other.position == position &&
    other.featured == featured &&
    _deepEquality.equals(other.attributes, attributes) &&
    other.file == file;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (longName == null ? 0 : longName!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (icon == null ? 0 : icon!.hashCode) +
    (internalPath == null ? 0 : internalPath!.hashCode) +
    (path == null ? 0 : path!.hashCode) +
    (position == null ? 0 : position!.hashCode) +
    (featured == null ? 0 : featured!.hashCode) +
    (attributes.hashCode) +
    (file == null ? 0 : file!.hashCode);

  @override
  String toString() => 'NavigationNode[id=$id, name=$name, longName=$longName, type=$type, description=$description, icon=$icon, internalPath=$internalPath, path=$path, position=$position, featured=$featured, attributes=$attributes, file=$file]';

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
    if (this.longName != null) {
      json[r'longName'] = this.longName;
    } else {
      json[r'longName'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
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
    if (this.internalPath != null) {
      json[r'internalPath'] = this.internalPath;
    } else {
      json[r'internalPath'] = null;
    }
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.position != null) {
      json[r'position'] = this.position;
    } else {
      json[r'position'] = null;
    }
    if (this.featured != null) {
      json[r'featured'] = this.featured;
    } else {
      json[r'featured'] = null;
    }
      json[r'attributes'] = this.attributes;
    if (this.file != null) {
      json[r'file'] = this.file;
    } else {
      json[r'file'] = null;
    }
    return json;
  }

  /// Returns a new [NavigationNode] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NavigationNode? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "NavigationNode[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "NavigationNode[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return NavigationNode(
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        longName: mapValueOfType<String>(json, r'longName'),
        type: mapValueOfType<String>(json, r'type'),
        description: mapValueOfType<String>(json, r'description'),
        icon: mapValueOfType<String>(json, r'icon'),
        internalPath: mapValueOfType<String>(json, r'internalPath'),
        path: mapValueOfType<String>(json, r'path'),
        position: mapValueOfType<double>(json, r'position'),
        featured: mapValueOfType<bool>(json, r'featured'),
        attributes: mapCastOfType<String, Object>(json, r'attributes') ?? const {},
        file: mapValueOfType<String>(json, r'file'),
      );
    }
    return null;
  }

  static List<NavigationNode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NavigationNode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NavigationNode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NavigationNode> mapFromJson(dynamic json) {
    final map = <String, NavigationNode>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NavigationNode.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NavigationNode-objects as value to a dart map
  static Map<String, List<NavigationNode>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NavigationNode>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NavigationNode.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

