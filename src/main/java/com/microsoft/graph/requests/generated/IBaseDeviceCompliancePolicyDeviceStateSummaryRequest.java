// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyDeviceStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Policy Device State Summary Request.
 */
public interface IBaseDeviceCompliancePolicyDeviceStateSummaryRequest extends IHttpRequest {

    /**
     * Gets the DeviceCompliancePolicyDeviceStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceCompliancePolicyDeviceStateSummary> callback);

    /**
     * Gets the DeviceCompliancePolicyDeviceStateSummary from the service
     *
     * @return the DeviceCompliancePolicyDeviceStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyDeviceStateSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceCompliancePolicyDeviceStateSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceCompliancePolicyDeviceStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicyDeviceStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceCompliancePolicyDeviceStateSummary sourceDeviceCompliancePolicyDeviceStateSummary, final ICallback<DeviceCompliancePolicyDeviceStateSummary> callback);

    /**
     * Patches this DeviceCompliancePolicyDeviceStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicyDeviceStateSummary the source object with updates
     * @return the updated DeviceCompliancePolicyDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyDeviceStateSummary patch(final DeviceCompliancePolicyDeviceStateSummary sourceDeviceCompliancePolicyDeviceStateSummary) throws ClientException;

    /**
     * Posts a DeviceCompliancePolicyDeviceStateSummary with a new object
     *
     * @param newDeviceCompliancePolicyDeviceStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceCompliancePolicyDeviceStateSummary newDeviceCompliancePolicyDeviceStateSummary, final ICallback<DeviceCompliancePolicyDeviceStateSummary> callback);

    /**
     * Posts a DeviceCompliancePolicyDeviceStateSummary with a new object
     *
     * @param newDeviceCompliancePolicyDeviceStateSummary the new object to create
     * @return the created DeviceCompliancePolicyDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceCompliancePolicyDeviceStateSummary post(final DeviceCompliancePolicyDeviceStateSummary newDeviceCompliancePolicyDeviceStateSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceCompliancePolicyDeviceStateSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceCompliancePolicyDeviceStateSummaryRequest expand(final String value);

}

