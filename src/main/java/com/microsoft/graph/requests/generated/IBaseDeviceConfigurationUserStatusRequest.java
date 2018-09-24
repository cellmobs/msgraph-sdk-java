// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceConfigurationUserStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Configuration User Status Request.
 */
public interface IBaseDeviceConfigurationUserStatusRequest extends IHttpRequest {

    /**
     * Gets the DeviceConfigurationUserStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceConfigurationUserStatus> callback);

    /**
     * Gets the DeviceConfigurationUserStatus from the service
     *
     * @return the DeviceConfigurationUserStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationUserStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceConfigurationUserStatus> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceConfigurationUserStatus with a source
     *
     * @param sourceDeviceConfigurationUserStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceConfigurationUserStatus sourceDeviceConfigurationUserStatus, final ICallback<DeviceConfigurationUserStatus> callback);

    /**
     * Patches this DeviceConfigurationUserStatus with a source
     *
     * @param sourceDeviceConfigurationUserStatus the source object with updates
     * @return the updated DeviceConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationUserStatus patch(final DeviceConfigurationUserStatus sourceDeviceConfigurationUserStatus) throws ClientException;

    /**
     * Posts a DeviceConfigurationUserStatus with a new object
     *
     * @param newDeviceConfigurationUserStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus, final ICallback<DeviceConfigurationUserStatus> callback);

    /**
     * Posts a DeviceConfigurationUserStatus with a new object
     *
     * @param newDeviceConfigurationUserStatus the new object to create
     * @return the created DeviceConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationUserStatus post(final DeviceConfigurationUserStatus newDeviceConfigurationUserStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceConfigurationUserStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceConfigurationUserStatusRequest expand(final String value);

}

