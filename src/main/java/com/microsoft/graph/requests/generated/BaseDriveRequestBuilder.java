// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDriveRequest;
import com.microsoft.graph.requests.extensions.DriveRequest;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRecentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRecentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveSharedWithMeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveSharedWithMeCollectionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Request Builder.
 */
public class BaseDriveRequestBuilder extends BaseRequestBuilder implements IBaseDriveRequestBuilder {

    /**
     * The request builder for the Drive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDriveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDriveRequest instance
     */
    public IDriveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDriveRequest instance
     */
    public IDriveRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DriveRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDriveItemCollectionRequestBuilder items() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IDriveItemRequestBuilder items(final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for List
     *
     * @return the IListRequestBuilder instance
     */
    public IListRequestBuilder list() {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("list"), getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    public IDriveItemRequestBuilder root() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("root"), getClient(), null);
    }
    public IDriveItemCollectionRequestBuilder special() {
        return new DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("special"), getClient(), null);
    }

    public IDriveItemRequestBuilder special(final String id) {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("special") + "/" + id, getClient(), null);
    }

    public IDriveRecentCollectionRequestBuilder recent() {
        return new DriveRecentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recent"), getClient(), null);
    }

    public IDriveSearchCollectionRequestBuilder search(final String q) {
        return new DriveSearchCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.search"), getClient(), null, q);
    }

    public IDriveSharedWithMeCollectionRequestBuilder sharedWithMe() {
        return new DriveSharedWithMeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sharedWithMe"), getClient(), null);
    }
}

