// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ISubscriptionRequest;
import com.microsoft.graph.requests.extensions.SubscriptionRequest;
import com.microsoft.graph.models.extensions.Subscription;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Subscription Request.
 */
public class BaseSubscriptionRequest extends BaseRequest implements IBaseSubscriptionRequest {

    /**
     * The request for the Subscription
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseSubscriptionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<Subscription> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Subscription from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Subscription> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Subscription from the service
     *
     * @return the Subscription from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Subscription get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Subscription> callback) {
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
     * Patches this Subscription with a source
     *
     * @param sourceSubscription the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Subscription sourceSubscription, final ICallback<Subscription> callback) {
        send(HttpMethod.PATCH, callback, sourceSubscription);
    }

    /**
     * Patches this Subscription with a source
     *
     * @param sourceSubscription the source object with updates
     * @return the updated Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Subscription patch(final Subscription sourceSubscription) throws ClientException {
        return send(HttpMethod.PATCH, sourceSubscription);
    }

    /**
     * Creates a Subscription with a new object
     *
     * @param newSubscription the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Subscription newSubscription, final ICallback<Subscription> callback) {
        send(HttpMethod.POST, callback, newSubscription);
    }

    /**
     * Creates a Subscription with a new object
     *
     * @param newSubscription the new object to create
     * @return the created Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Subscription post(final Subscription newSubscription) throws ClientException {
        return send(HttpMethod.POST, newSubscription);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISubscriptionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (SubscriptionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISubscriptionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (SubscriptionRequest)this;
     }

}

