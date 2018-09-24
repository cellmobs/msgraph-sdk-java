// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsReptRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Rept Request Builder.
 */
public class WorkbookFunctionsReptRequestBuilder extends BaseWorkbookFunctionsReptRequestBuilder implements IWorkbookFunctionsReptRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numberTimes the numberTimes
     */
    public WorkbookFunctionsReptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numberTimes) {
        super(requestUrl, client, requestOptions, text, numberTimes);
    }
}
