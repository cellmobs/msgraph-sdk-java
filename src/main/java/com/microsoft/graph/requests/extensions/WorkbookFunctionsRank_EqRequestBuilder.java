// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsRank_EqRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rank_Eq Request Builder.
 */
public class WorkbookFunctionsRank_EqRequestBuilder extends BaseWorkbookFunctionsRank_EqRequestBuilder implements IWorkbookFunctionsRank_EqRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRank_Eq
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param ref the ref
     * @param order the order
     */
    public WorkbookFunctionsRank_EqRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement ref, final com.google.gson.JsonElement order) {
        super(requestUrl, client, requestOptions, number, ref, order);
    }
}
