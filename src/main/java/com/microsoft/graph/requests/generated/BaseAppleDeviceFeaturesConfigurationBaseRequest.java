// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IAppleDeviceFeaturesConfigurationBaseRequest;
import com.microsoft.graph.requests.extensions.AppleDeviceFeaturesConfigurationBaseRequest;
import com.microsoft.graph.models.extensions.AppleDeviceFeaturesConfigurationBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Apple Device Features Configuration Base Request.
 */
public class BaseAppleDeviceFeaturesConfigurationBaseRequest extends BaseRequest implements IBaseAppleDeviceFeaturesConfigurationBaseRequest {

    /**
     * The request for the AppleDeviceFeaturesConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseAppleDeviceFeaturesConfigurationBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends AppleDeviceFeaturesConfigurationBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @return the AppleDeviceFeaturesConfigurationBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleDeviceFeaturesConfigurationBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AppleDeviceFeaturesConfigurationBase> callback) {
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
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase, final ICallback<AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @return the updated AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleDeviceFeaturesConfigurationBase patch(final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase, final ICallback<AppleDeviceFeaturesConfigurationBase> callback) {
        send(HttpMethod.POST, callback, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @return the created AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleDeviceFeaturesConfigurationBase post(final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.POST, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAppleDeviceFeaturesConfigurationBaseRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (AppleDeviceFeaturesConfigurationBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAppleDeviceFeaturesConfigurationBaseRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (AppleDeviceFeaturesConfigurationBaseRequest)this;
     }

}

