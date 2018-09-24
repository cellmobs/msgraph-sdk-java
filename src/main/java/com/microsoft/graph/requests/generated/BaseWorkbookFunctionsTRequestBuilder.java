// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsTRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions TRequest Builder.
 */
public class BaseWorkbookFunctionsTRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsT
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public BaseWorkbookFunctionsTRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsTRequest
     *
     * @return the IWorkbookFunctionsTRequest instance
     */
    public IWorkbookFunctionsTRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsTRequest instance
     */
    public IWorkbookFunctionsTRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsTRequest request = new WorkbookFunctionsTRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }

        return request;
    }
}
