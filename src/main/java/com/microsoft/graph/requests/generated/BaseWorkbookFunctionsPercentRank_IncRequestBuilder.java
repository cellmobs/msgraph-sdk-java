// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPercentRank_IncRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPercentRank_IncRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Percent Rank_Inc Request Builder.
 */
public class BaseWorkbookFunctionsPercentRank_IncRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentRank_Inc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param x the x
     * @param significance the significance
     */
    public BaseWorkbookFunctionsPercentRank_IncRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement x, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("x", x);
        bodyParams.put("significance", significance);
    }

    /**
     * Creates the IWorkbookFunctionsPercentRank_IncRequest
     *
     * @return the IWorkbookFunctionsPercentRank_IncRequest instance
     */
    public IWorkbookFunctionsPercentRank_IncRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPercentRank_IncRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPercentRank_IncRequest instance
     */
    public IWorkbookFunctionsPercentRank_IncRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPercentRank_IncRequest request = new WorkbookFunctionsPercentRank_IncRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        return request;
    }
}
