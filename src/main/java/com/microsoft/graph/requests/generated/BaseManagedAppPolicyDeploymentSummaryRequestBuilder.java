// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyDeploymentSummaryRequest;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Policy Deployment Summary Request Builder.
 */
public class BaseManagedAppPolicyDeploymentSummaryRequestBuilder extends BaseRequestBuilder implements IBaseManagedAppPolicyDeploymentSummaryRequestBuilder {

    /**
     * The request builder for the ManagedAppPolicyDeploymentSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppPolicyDeploymentSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedAppPolicyDeploymentSummaryRequest instance
     */
    public IManagedAppPolicyDeploymentSummaryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppPolicyDeploymentSummaryRequest instance
     */
    public IManagedAppPolicyDeploymentSummaryRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedAppPolicyDeploymentSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }

}

