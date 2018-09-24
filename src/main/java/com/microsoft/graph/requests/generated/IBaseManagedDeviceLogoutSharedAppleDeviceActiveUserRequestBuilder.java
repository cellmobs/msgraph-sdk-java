// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Managed Device Logout Shared Apple Device Active User Request Builder.
 */
public interface IBaseManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest
     *
     * @return the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest instance
     */
    IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest buildRequest();

    /**
     * Creates the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest instance
     */
    IManagedDeviceLogoutSharedAppleDeviceActiveUserRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
