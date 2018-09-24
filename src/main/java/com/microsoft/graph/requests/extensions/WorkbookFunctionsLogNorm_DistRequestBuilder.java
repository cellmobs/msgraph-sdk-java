// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsLogNorm_DistRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Log Norm_Dist Request Builder.
 */
public class WorkbookFunctionsLogNorm_DistRequestBuilder extends BaseWorkbookFunctionsLogNorm_DistRequestBuilder implements IWorkbookFunctionsLogNorm_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLogNorm_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param mean the mean
     * @param standardDev the standardDev
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsLogNorm_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement mean, final com.google.gson.JsonElement standardDev, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions, x, mean, standardDev, cumulative);
    }
}
