// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsErf_PreciseRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Erf_Precise Request Builder.
 */
public interface IBaseWorkbookFunctionsErf_PreciseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsErf_PreciseRequest
     *
     * @return the IWorkbookFunctionsErf_PreciseRequest instance
     */
    IWorkbookFunctionsErf_PreciseRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsErf_PreciseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsErf_PreciseRequest instance
     */
    IWorkbookFunctionsErf_PreciseRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
