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

export class BeanSorterObject {
    'ascending'?: boolean;
    'columnName'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "ascending",
            "baseName": "ascending",
            "type": "boolean"
        },
        {
            "name": "columnName",
            "baseName": "columnName",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return BeanSorterObject.attributeTypeMap;
    }
}

