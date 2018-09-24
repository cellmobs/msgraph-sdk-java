// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_InvRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Norm_Inv Request Builder.
 */
public interface IBaseWorkbookFunctionsNorm_InvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsNorm_InvRequest
     *
     * @return the IWorkbookFunctionsNorm_InvRequest instance
     */
    IWorkbookFunctionsNorm_InvRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsNorm_InvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_InvRequest instance
     */
    IWorkbookFunctionsNorm_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
