// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsPermutationaRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Permutationa Request Builder.
 */
public class WorkbookFunctionsPermutationaRequestBuilder extends BaseWorkbookFunctionsPermutationaRequestBuilder implements IWorkbookFunctionsPermutationaRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPermutationa
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param numberChosen the numberChosen
     */
    public WorkbookFunctionsPermutationaRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement numberChosen) {
        super(requestUrl, client, requestOptions, number, numberChosen);
    }
}
