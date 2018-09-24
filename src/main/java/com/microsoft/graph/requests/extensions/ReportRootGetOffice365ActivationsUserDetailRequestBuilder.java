// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseReportRootGetOffice365ActivationsUserDetailRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Report Root Get Office365Activations User Detail Request Builder.
 */
public class ReportRootGetOffice365ActivationsUserDetailRequestBuilder extends BaseReportRootGetOffice365ActivationsUserDetailRequestBuilder implements IReportRootGetOffice365ActivationsUserDetailRequestBuilder {

    /**
     * The request builder for this ReportRootGetOffice365ActivationsUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserDetailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
