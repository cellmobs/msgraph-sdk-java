// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.AndroidGeneralDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Android General Device Configuration Request.
 */
public interface IBaseAndroidGeneralDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidGeneralDeviceConfiguration> callback);

    /**
     * Gets the AndroidGeneralDeviceConfiguration from the service
     *
     * @return the AndroidGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidGeneralDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidGeneralDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidGeneralDeviceConfiguration sourceAndroidGeneralDeviceConfiguration, final ICallback<AndroidGeneralDeviceConfiguration> callback);

    /**
     * Patches this AndroidGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidGeneralDeviceConfiguration patch(final AndroidGeneralDeviceConfiguration sourceAndroidGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a AndroidGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidGeneralDeviceConfiguration newAndroidGeneralDeviceConfiguration, final ICallback<AndroidGeneralDeviceConfiguration> callback);

    /**
     * Posts a AndroidGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidGeneralDeviceConfiguration the new object to create
     * @return the created AndroidGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidGeneralDeviceConfiguration post(final AndroidGeneralDeviceConfiguration newAndroidGeneralDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseAndroidGeneralDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseAndroidGeneralDeviceConfigurationRequest expand(final String value);

}

