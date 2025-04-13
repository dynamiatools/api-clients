//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ActionRef {
  /// Returns a new [ActionRef] instance.
  ActionRef({
    this.id,
    this.width,
    this.visible,
    this.label,
    this.icon,
    this.description,
    this.params = const {},
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
  String? width;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? visible;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? label;

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
  String? description;

  Map<String, Object> params;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ActionRef &&
    other.id == id &&
    other.width == width &&
    other.visible == visible &&
    other.label == label &&
    other.icon == icon &&
    other.description == description &&
    _deepEquality.equals(other.params, params);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (width == null ? 0 : width!.hashCode) +
    (visible == null ? 0 : visible!.hashCode) +
    (label == null ? 0 : label!.hashCode) +
    (icon == null ? 0 : icon!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (params.hashCode);

  @override
  String toString() => 'ActionRef[id=$id, width=$width, visible=$visible, label=$label, icon=$icon, description=$description, params=$params]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.width != null) {
      json[r'width'] = this.width;
    } else {
      json[r'width'] = null;
    }
    if (this.visible != null) {
      json[r'visible'] = this.visible;
    } else {
      json[r'visible'] = null;
    }
    if (this.label != null) {
      json[r'label'] = this.label;
    } else {
      json[r'label'] = null;
    }
    if (this.icon != null) {
      json[r'icon'] = this.icon;
    } else {
      json[r'icon'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'params'] = this.params;
    return json;
  }

  /// Returns a new [ActionRef] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ActionRef? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ActionRef[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ActionRef[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ActionRef(
        id: mapValueOfType<String>(json, r'id'),
        width: mapValueOfType<String>(json, r'width'),
        visible: mapValueOfType<bool>(json, r'visible'),
        label: mapValueOfType<String>(json, r'label'),
        icon: mapValueOfType<String>(json, r'icon'),
        description: mapValueOfType<String>(json, r'description'),
        params: mapCastOfType<String, Object>(json, r'params') ?? const {},
      );
    }
    return null;
  }

  static List<ActionRef> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ActionRef>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ActionRef.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ActionRef> mapFromJson(dynamic json) {
    final map = <String, ActionRef>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ActionRef.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ActionRef-objects as value to a dart map
  static Map<String, List<ActionRef>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ActionRef>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ActionRef.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

