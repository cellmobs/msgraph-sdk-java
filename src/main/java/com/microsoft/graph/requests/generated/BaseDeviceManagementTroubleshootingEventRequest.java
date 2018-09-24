// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequest;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Management Troubleshooting Event Request.
 */
public class BaseDeviceManagementTroubleshootingEventRequest extends BaseRequest implements IBaseDeviceManagementTroubleshootingEventRequest {

    /**
     * The request for the DeviceManagementTroubleshootingEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceManagementTroubleshootingEventRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DeviceManagementTroubleshootingEvent> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceManagementTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementTroubleshootingEvent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementTroubleshootingEvent from the service
     *
     * @return the DeviceManagementTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementTroubleshootingEvent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementTroubleshootingEvent> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementTroubleshootingEvent with a source
     *
     * @param sourceDeviceManagementTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementTroubleshootingEvent sourceDeviceManagementTroubleshootingEvent, final ICallback<DeviceManagementTroubleshootingEvent> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementTroubleshootingEvent);
    }

    /**
     * Patches this DeviceManagementTroubleshootingEvent with a source
     *
     * @param sourceDeviceManagementTroubleshootingEvent the source object with updates
     * @return the updated DeviceManagementTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementTroubleshootingEvent patch(final DeviceManagementTroubleshootingEvent sourceDeviceManagementTroubleshootingEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementTroubleshootingEvent);
    }

    /**
     * Creates a DeviceManagementTroubleshootingEvent with a new object
     *
     * @param newDeviceManagementTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent, final ICallback<DeviceManagementTroubleshootingEvent> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementTroubleshootingEvent);
    }

    /**
     * Creates a DeviceManagementTroubleshootingEvent with a new object
     *
     * @param newDeviceManagementTroubleshootingEvent the new object to create
     * @return the created DeviceManagementTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementTroubleshootingEvent post(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementTroubleshootingEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementTroubleshootingEventRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementTroubleshootingEventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementTroubleshootingEventRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementTroubleshootingEventRequest)this;
     }

}

