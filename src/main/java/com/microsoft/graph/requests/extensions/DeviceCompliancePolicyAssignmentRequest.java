// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseDeviceCompliancePolicyAssignmentRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Device Compliance Policy Assignment Request.
 */
public class DeviceCompliancePolicyAssignmentRequest extends BaseDeviceCompliancePolicyAssignmentRequest implements IDeviceCompliancePolicyAssignmentRequest {

    /**
     * The request for the DeviceCompliancePolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignment.class);
    }
}
