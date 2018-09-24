// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedMobileLobAppRequest;
import com.microsoft.graph.requests.extensions.ManagedMobileLobAppRequest;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Mobile Lob App Request.
 */
public class BaseManagedMobileLobAppRequest extends BaseRequest implements IBaseManagedMobileLobAppRequest {

    /**
     * The request for the ManagedMobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedMobileLobAppRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends ManagedMobileLobApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedMobileLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedMobileLobApp from the service
     *
     * @return the ManagedMobileLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ManagedMobileLobApp> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedMobileLobApp sourceManagedMobileLobApp, final ICallback<ManagedMobileLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedMobileLobApp);
    }

    /**
     * Patches this ManagedMobileLobApp with a source
     *
     * @param sourceManagedMobileLobApp the source object with updates
     * @return the updated ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp patch(final ManagedMobileLobApp sourceManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedMobileLobApp newManagedMobileLobApp, final ICallback<ManagedMobileLobApp> callback) {
        send(HttpMethod.POST, callback, newManagedMobileLobApp);
    }

    /**
     * Creates a ManagedMobileLobApp with a new object
     *
     * @param newManagedMobileLobApp the new object to create
     * @return the created ManagedMobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedMobileLobApp post(final ManagedMobileLobApp newManagedMobileLobApp) throws ClientException {
        return send(HttpMethod.POST, newManagedMobileLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedMobileLobAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedMobileLobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedMobileLobAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedMobileLobAppRequest)this;
     }

}

