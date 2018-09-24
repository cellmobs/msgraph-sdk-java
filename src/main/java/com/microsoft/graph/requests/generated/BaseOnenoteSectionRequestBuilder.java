// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequest;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequest;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCopyToNotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCopyToNotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCopyToSectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCopyToSectionGroupRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Section Request Builder.
 */
public class BaseOnenoteSectionRequestBuilder extends BaseRequestBuilder implements IBaseOnenoteSectionRequestBuilder {

    /**
     * The request builder for the OnenoteSection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseOnenoteSectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOnenoteSectionRequest instance
     */
    public IOnenoteSectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteSectionRequest instance
     */
    public IOnenoteSectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OnenoteSectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for Notebook
     *
     * @return the INotebookRequestBuilder instance
     */
    public INotebookRequestBuilder parentNotebook() {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("parentNotebook"), getClient(), null);
    }

    /**
     * Gets the request builder for SectionGroup
     *
     * @return the ISectionGroupRequestBuilder instance
     */
    public ISectionGroupRequestBuilder parentSectionGroup() {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("parentSectionGroup"), getClient(), null);
    }
    public IOnenotePageCollectionRequestBuilder pages() {
        return new OnenotePageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pages"), getClient(), null);
    }

    public IOnenotePageRequestBuilder pages(final String id) {
        return new OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment("pages") + "/" + id, getClient(), null);
    }

    public IOnenoteSectionCopyToNotebookRequestBuilder copyToNotebook(final String id, final String groupId, final String renameAs, final String siteCollectionId, final String siteId) {
        return new OnenoteSectionCopyToNotebookRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyToNotebook"), getClient(), null, id, groupId, renameAs, siteCollectionId, siteId);
    }

    public IOnenoteSectionCopyToSectionGroupRequestBuilder copyToSectionGroup(final String id, final String groupId, final String renameAs, final String siteCollectionId, final String siteId) {
        return new OnenoteSectionCopyToSectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyToSectionGroup"), getClient(), null, id, groupId, renameAs, siteCollectionId, siteId);
    }
}

