// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsChiSq_Inv_RTRequest;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Chi Sq_Inv_RTRequest.
 */
public class WorkbookFunctionsChiSq_Inv_RTRequest extends BaseWorkbookFunctionsChiSq_Inv_RTRequest implements IWorkbookFunctionsChiSq_Inv_RTRequest {

    /**
     * The request for this WorkbookFunctionsChiSq_Inv_RT
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsChiSq_Inv_RTRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
}
