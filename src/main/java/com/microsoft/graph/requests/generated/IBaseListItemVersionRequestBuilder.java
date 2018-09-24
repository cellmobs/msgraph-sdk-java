// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IListItemVersionRequest;
import com.microsoft.graph.requests.extensions.IFieldValueSetRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemVersionRestoreVersionRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base List Item Version Request Builder.
 */
public interface IBaseListItemVersionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IListItemVersionRequest instance
     */
    IListItemVersionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IListItemVersionRequest instance
     */
    IListItemVersionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for FieldValueSet
     *
     * @return the IFieldValueSetRequestBuilder instance
     */
    IFieldValueSetRequestBuilder fields();
    IListItemVersionRestoreVersionRequestBuilder restoreVersion();

}
