//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ViewDescriptorMetadata {
  /// Returns a new [ViewDescriptorMetadata] instance.
  ViewDescriptorMetadata({
    this.id,
    this.name,
    this.endpoint,
    this.description,
    this.icon,
    this.view,
    this.device,
    this.beanClass,
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
  String? view;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? device;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? beanClass;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ViewDescriptorMetadata &&
    other.id == id &&
    other.name == name &&
    other.endpoint == endpoint &&
    other.description == description &&
    other.icon == icon &&
    other.view == view &&
    other.device == device &&
    other.beanClass == beanClass;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (endpoint == null ? 0 : endpoint!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (icon == null ? 0 : icon!.hashCode) +
    (view == null ? 0 : view!.hashCode) +
    (device == null ? 0 : device!.hashCode) +
    (beanClass == null ? 0 : beanClass!.hashCode);

  @override
  String toString() => 'ViewDescriptorMetadata[id=$id, name=$name, endpoint=$endpoint, description=$description, icon=$icon, view=$view, device=$device, beanClass=$beanClass]';

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
    if (this.view != null) {
      json[r'view'] = this.view;
    } else {
      json[r'view'] = null;
    }
    if (this.device != null) {
      json[r'device'] = this.device;
    } else {
      json[r'device'] = null;
    }
    if (this.beanClass != null) {
      json[r'beanClass'] = this.beanClass;
    } else {
      json[r'beanClass'] = null;
    }
    return json;
  }

  /// Returns a new [ViewDescriptorMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ViewDescriptorMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ViewDescriptorMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ViewDescriptorMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ViewDescriptorMetadata(
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        endpoint: mapValueOfType<String>(json, r'endpoint'),
        description: mapValueOfType<String>(json, r'description'),
        icon: mapValueOfType<String>(json, r'icon'),
        view: mapValueOfType<String>(json, r'view'),
        device: mapValueOfType<String>(json, r'device'),
        beanClass: mapValueOfType<String>(json, r'beanClass'),
      );
    }
    return null;
  }

  static List<ViewDescriptorMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ViewDescriptorMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ViewDescriptorMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ViewDescriptorMetadata> mapFromJson(dynamic json) {
    final map = <String, ViewDescriptorMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ViewDescriptorMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ViewDescriptorMetadata-objects as value to a dart map
  static Map<String, List<ViewDescriptorMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ViewDescriptorMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ViewDescriptorMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

