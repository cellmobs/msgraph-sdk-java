// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatClearRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatClearRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Line Format Clear Request Builder.
 */
public class BaseWorkbookChartLineFormatClearRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookChartLineFormatClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartLineFormatClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookChartLineFormatClearRequest
     *
     * @return the IWorkbookChartLineFormatClearRequest instance
     */
    public IWorkbookChartLineFormatClearRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartLineFormatClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartLineFormatClearRequest instance
     */
    public IWorkbookChartLineFormatClearRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartLineFormatClearRequest request = new WorkbookChartLineFormatClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
