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
import { EntityMetadata } from './entityMetadata';

export class ApplicationMetadataEntities {
    'entities'?: Array<EntityMetadata>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "entities",
            "baseName": "entities",
            "type": "Array<EntityMetadata>"
        }    ];

    static getAttributeTypeMap() {
        return ApplicationMetadataEntities.attributeTypeMap;
    }
}

