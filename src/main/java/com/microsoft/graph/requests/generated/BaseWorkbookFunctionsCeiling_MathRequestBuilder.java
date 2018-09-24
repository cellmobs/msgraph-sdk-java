// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCeiling_MathRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCeiling_MathRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Ceiling_Math Request Builder.
 */
public class BaseWorkbookFunctionsCeiling_MathRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCeiling_Math
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param significance the significance
     * @param mode the mode
     */
    public BaseWorkbookFunctionsCeiling_MathRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance, final com.google.gson.JsonElement mode) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("significance", significance);
        bodyParams.put("mode", mode);
    }

    /**
     * Creates the IWorkbookFunctionsCeiling_MathRequest
     *
     * @return the IWorkbookFunctionsCeiling_MathRequest instance
     */
    public IWorkbookFunctionsCeiling_MathRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCeiling_MathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCeiling_MathRequest instance
     */
    public IWorkbookFunctionsCeiling_MathRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCeiling_MathRequest request = new WorkbookFunctionsCeiling_MathRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("significance")) {
            request.body.significance = getParameter("significance");
        }

        if (hasParameter("mode")) {
            request.body.mode = getParameter("mode");
        }

        return request;
    }
}
