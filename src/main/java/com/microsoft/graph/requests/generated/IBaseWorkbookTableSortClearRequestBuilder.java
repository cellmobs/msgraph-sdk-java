// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookTableSortClearRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Sort Clear Request Builder.
 */
public interface IBaseWorkbookTableSortClearRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableSortClearRequest
     *
     * @return the IWorkbookTableSortClearRequest instance
     */
    IWorkbookTableSortClearRequest buildRequest();

    /**
     * Creates the IWorkbookTableSortClearRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableSortClearRequest instance
     */
    IWorkbookTableSortClearRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
