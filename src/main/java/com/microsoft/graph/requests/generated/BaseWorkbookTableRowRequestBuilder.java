// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableRowRequest;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowRangeRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowRangeRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Row Request Builder.
 */
public class BaseWorkbookTableRowRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableRowRequestBuilder {

    /**
     * The request builder for the WorkbookTableRow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookTableRowRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookTableRowRequest instance
     */
    public IWorkbookTableRowRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookTableRowRequest instance
     */
    public IWorkbookTableRowRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookTableRowRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookTableRowRangeRequestBuilder range() {
        return new WorkbookTableRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }
}

