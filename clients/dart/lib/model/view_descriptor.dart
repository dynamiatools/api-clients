//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of dynamia.tools.api;

class ViewDescriptor {
  /// Returns a new [ViewDescriptor] instance.
  ViewDescriptor({
    this.fields = const [],
    this.actions = const [],
    this.id,
    this.params = const {},
    this.layout,
    this.extends_,
    this.autofields,
    this.device,
    this.viewTypeName,
    this.messages,
    this.fieldGroups = const [],
  });

  List<Field> fields;

  List<ActionRef> actions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  Map<String, Object> params;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ViewLayout? layout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? extends_;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? autofields;

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
  String? viewTypeName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? messages;

  List<FieldGroup> fieldGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ViewDescriptor &&
    _deepEquality.equals(other.fields, fields) &&
    _deepEquality.equals(other.actions, actions) &&
    other.id == id &&
    _deepEquality.equals(other.params, params) &&
    other.layout == layout &&
    other.extends_ == extends_ &&
    other.autofields == autofields &&
    other.device == device &&
    other.viewTypeName == viewTypeName &&
    other.messages == messages &&
    _deepEquality.equals(other.fieldGroups, fieldGroups);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fields.hashCode) +
    (actions.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (params.hashCode) +
    (layout == null ? 0 : layout!.hashCode) +
    (extends_ == null ? 0 : extends_!.hashCode) +
    (autofields == null ? 0 : autofields!.hashCode) +
    (device == null ? 0 : device!.hashCode) +
    (viewTypeName == null ? 0 : viewTypeName!.hashCode) +
    (messages == null ? 0 : messages!.hashCode) +
    (fieldGroups.hashCode);

  @override
  String toString() => 'ViewDescriptor[fields=$fields, actions=$actions, id=$id, params=$params, layout=$layout, extends_=$extends_, autofields=$autofields, device=$device, viewTypeName=$viewTypeName, messages=$messages, fieldGroups=$fieldGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'fields'] = this.fields;
      json[r'actions'] = this.actions;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
      json[r'params'] = this.params;
    if (this.layout != null) {
      json[r'layout'] = this.layout;
    } else {
      json[r'layout'] = null;
    }
    if (this.extends_ != null) {
      json[r'extends'] = this.extends_;
    } else {
      json[r'extends'] = null;
    }
    if (this.autofields != null) {
      json[r'autofields'] = this.autofields;
    } else {
      json[r'autofields'] = null;
    }
    if (this.device != null) {
      json[r'device'] = this.device;
    } else {
      json[r'device'] = null;
    }
    if (this.viewTypeName != null) {
      json[r'viewTypeName'] = this.viewTypeName;
    } else {
      json[r'viewTypeName'] = null;
    }
    if (this.messages != null) {
      json[r'messages'] = this.messages;
    } else {
      json[r'messages'] = null;
    }
      json[r'fieldGroups'] = this.fieldGroups;
    return json;
  }

  /// Returns a new [ViewDescriptor] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ViewDescriptor? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ViewDescriptor[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ViewDescriptor[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ViewDescriptor(
        fields: Field.listFromJson(json[r'fields']),
        actions: ActionRef.listFromJson(json[r'actions']),
        id: mapValueOfType<String>(json, r'id'),
        params: mapCastOfType<String, Object>(json, r'params') ?? const {},
        layout: ViewLayout.fromJson(json[r'layout']),
        extends_: mapValueOfType<String>(json, r'extends'),
        autofields: mapValueOfType<bool>(json, r'autofields'),
        device: mapValueOfType<String>(json, r'device'),
        viewTypeName: mapValueOfType<String>(json, r'viewTypeName'),
        messages: mapValueOfType<String>(json, r'messages'),
        fieldGroups: FieldGroup.listFromJson(json[r'fieldGroups']),
      );
    }
    return null;
  }

  static List<ViewDescriptor> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ViewDescriptor>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ViewDescriptor.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ViewDescriptor> mapFromJson(dynamic json) {
    final map = <String, ViewDescriptor>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ViewDescriptor.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ViewDescriptor-objects as value to a dart map
  static Map<String, List<ViewDescriptor>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ViewDescriptor>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ViewDescriptor.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

