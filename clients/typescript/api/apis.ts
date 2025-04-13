export * from './dynamiaApplicationMetadataApi';
import { DynamiaApplicationMetadataApi } from './dynamiaApplicationMetadataApi';
export * from './dynamiaCrudServiceApi';
import { DynamiaCrudServiceApi } from './dynamiaCrudServiceApi';
export * from './dynamiaPeriodicTasksApi';
import { DynamiaPeriodicTasksApi } from './dynamiaPeriodicTasksApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [DynamiaApplicationMetadataApi, DynamiaCrudServiceApi, DynamiaPeriodicTasksApi];
