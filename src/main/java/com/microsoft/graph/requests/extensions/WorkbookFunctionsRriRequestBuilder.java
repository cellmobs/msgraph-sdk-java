// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRriRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rri Request Builder.
 */
public class WorkbookFunctionsRriRequestBuilder extends BaseWorkbookFunctionsRriRequestBuilder implements IWorkbookFunctionsRriRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRri
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param nper the nper
     * @param pv the pv
     * @param fv the fv
     */
    public WorkbookFunctionsRriRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv) {
        super(requestUrl, client, requestOptions, nper, pv, fv);
    }
}
