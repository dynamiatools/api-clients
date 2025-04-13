//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

library dynamia.tools.api;

import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:collection/collection.dart';
import 'package:http/http.dart';
import 'package:intl/intl.dart';
import 'package:meta/meta.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';
part 'auth/http_bearer_auth.dart';

part 'api/dynamia_application_metadata_api.dart';
part 'api/dynamia_crud_service_api.dart';
part 'api/dynamia_periodic_tasks_api.dart';

part 'model/action_execution_request.dart';
part 'model/action_execution_response.dart';
part 'model/action_metadata.dart';
part 'model/action_ref.dart';
part 'model/application_metadata.dart';
part 'model/application_metadata_actions.dart';
part 'model/application_metadata_entities.dart';
part 'model/bean_sorter_object.dart';
part 'model/data_paginator.dart';
part 'model/entity_metadata.dart';
part 'model/field.dart';
part 'model/field_group.dart';
part 'model/navigation_node.dart';
part 'model/navigation_tree.dart';
part 'model/query_parameters.dart';
part 'model/view_descriptor.dart';
part 'model/view_descriptor_metadata.dart';
part 'model/view_layout.dart';


/// An [ApiClient] instance that uses the default values obtained from
/// the OpenAPI specification file.
var defaultApiClient = ApiClient();

const _delimiters = {'csv': ',', 'ssv': ' ', 'tsv': '\t', 'pipes': '|'};
const _dateEpochMarker = 'epoch';
const _deepEquality = DeepCollectionEquality();
final _dateFormatter = DateFormat('yyyy-MM-dd');
final _regList = RegExp(r'^List<(.*)>$');
final _regSet = RegExp(r'^Set<(.*)>$');
final _regMap = RegExp(r'^Map<String,(.*)>$');

bool _isEpochMarker(String? pattern) => pattern == _dateEpochMarker || pattern == '/$_dateEpochMarker/';
