// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookChartImageRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Chart Image Request Builder.
 */
public class WorkbookChartImageRequestBuilder extends BaseWorkbookChartImageRequestBuilder implements IWorkbookChartImageRequestBuilder {

    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param width the width
     */
    public WorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer width) {
        super(requestUrl, client, requestOptions, width);
    }

    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param width the width
     * @param height the height
     */
    public WorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer width, final Integer height) {
        super(requestUrl, client, requestOptions, width, height);
    }

    /**
     * The request builder for this WorkbookChartImage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param width the width
     * @param height the height
     * @param fittingMode the fittingMode
     */
    public WorkbookChartImageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer width, final Integer height, final String fittingMode) {
        super(requestUrl, client, requestOptions, width, height, fittingMode);
    }
}
