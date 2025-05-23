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

export class DataPaginator {
    'totalSize'?: number;
    'pageSize'?: number;
    'firstResult'?: number;
    'page'?: number;
    'pagesNumber'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "totalSize",
            "baseName": "totalSize",
            "type": "number"
        },
        {
            "name": "pageSize",
            "baseName": "pageSize",
            "type": "number"
        },
        {
            "name": "firstResult",
            "baseName": "firstResult",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "pagesNumber",
            "baseName": "pagesNumber",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DataPaginator.attributeTypeMap;
    }
}

