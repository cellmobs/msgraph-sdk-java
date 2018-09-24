// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions Norm_Dist Request Builder.
 */
public interface IBaseWorkbookFunctionsNorm_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsNorm_DistRequest
     *
     * @return the IWorkbookFunctionsNorm_DistRequest instance
     */
    IWorkbookFunctionsNorm_DistRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsNorm_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_DistRequest instance
     */
    IWorkbookFunctionsNorm_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
