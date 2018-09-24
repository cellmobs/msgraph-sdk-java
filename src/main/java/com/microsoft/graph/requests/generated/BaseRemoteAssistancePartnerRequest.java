// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequest;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequest;
import com.microsoft.graph.models.extensions.RemoteAssistancePartner;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Remote Assistance Partner Request.
 */
public class BaseRemoteAssistancePartnerRequest extends BaseRequest implements IBaseRemoteAssistancePartnerRequest {

    /**
     * The request for the RemoteAssistancePartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseRemoteAssistancePartnerRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<RemoteAssistancePartner> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the RemoteAssistancePartner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<RemoteAssistancePartner> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RemoteAssistancePartner from the service
     *
     * @return the RemoteAssistancePartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RemoteAssistancePartner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<RemoteAssistancePartner> callback) {
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
     * Patches this RemoteAssistancePartner with a source
     *
     * @param sourceRemoteAssistancePartner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RemoteAssistancePartner sourceRemoteAssistancePartner, final ICallback<RemoteAssistancePartner> callback) {
        send(HttpMethod.PATCH, callback, sourceRemoteAssistancePartner);
    }

    /**
     * Patches this RemoteAssistancePartner with a source
     *
     * @param sourceRemoteAssistancePartner the source object with updates
     * @return the updated RemoteAssistancePartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RemoteAssistancePartner patch(final RemoteAssistancePartner sourceRemoteAssistancePartner) throws ClientException {
        return send(HttpMethod.PATCH, sourceRemoteAssistancePartner);
    }

    /**
     * Creates a RemoteAssistancePartner with a new object
     *
     * @param newRemoteAssistancePartner the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RemoteAssistancePartner newRemoteAssistancePartner, final ICallback<RemoteAssistancePartner> callback) {
        send(HttpMethod.POST, callback, newRemoteAssistancePartner);
    }

    /**
     * Creates a RemoteAssistancePartner with a new object
     *
     * @param newRemoteAssistancePartner the new object to create
     * @return the created RemoteAssistancePartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RemoteAssistancePartner post(final RemoteAssistancePartner newRemoteAssistancePartner) throws ClientException {
        return send(HttpMethod.POST, newRemoteAssistancePartner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRemoteAssistancePartnerRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (RemoteAssistancePartnerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRemoteAssistancePartnerRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (RemoteAssistancePartnerRequest)this;
     }

}

