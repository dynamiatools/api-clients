/**
 * DynamiaTools API
 * DynamiaTools Metadata API
 *
 * The version of the OpenAPI document: 5.3.6
 * Contact: mario@dynamiasoluciones.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class NavigationNode {
    'id'?: string;
    'name'?: string;
    'longName'?: string;
    'type'?: string;
    'description'?: string;
    'icon'?: string;
    'internalPath'?: string;
    'path'?: string;
    'position'?: number;
    'featured'?: boolean;
    'attributes'?: { [key: string]: object; };
    'file'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "longName",
            "baseName": "longName",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "icon",
            "baseName": "icon",
            "type": "string"
        },
        {
            "name": "internalPath",
            "baseName": "internalPath",
            "type": "string"
        },
        {
            "name": "path",
            "baseName": "path",
            "type": "string"
        },
        {
            "name": "position",
            "baseName": "position",
            "type": "number"
        },
        {
            "name": "featured",
            "baseName": "featured",
            "type": "boolean"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "{ [key: string]: object; }"
        },
        {
            "name": "file",
            "baseName": "file",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return NavigationNode.attributeTypeMap;
    }
}

