// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedDeviceSyncDeviceRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Device Sync Device Request Builder.
 */
public interface IBaseManagedDeviceSyncDeviceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceSyncDeviceRequest
     *
     * @return the IManagedDeviceSyncDeviceRequest instance
     */
    IManagedDeviceSyncDeviceRequest buildRequest();

    /**
     * Creates the IManagedDeviceSyncDeviceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceSyncDeviceRequest instance
     */
    IManagedDeviceSyncDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
