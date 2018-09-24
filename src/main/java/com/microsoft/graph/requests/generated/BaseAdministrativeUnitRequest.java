// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequest;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequest;
import com.microsoft.graph.models.extensions.AdministrativeUnit;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Administrative Unit Request.
 */
public class BaseAdministrativeUnitRequest extends BaseRequest implements IBaseAdministrativeUnitRequest {

    /**
     * The request for the AdministrativeUnit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseAdministrativeUnitRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<AdministrativeUnit> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the AdministrativeUnit from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AdministrativeUnit> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AdministrativeUnit from the service
     *
     * @return the AdministrativeUnit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdministrativeUnit get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AdministrativeUnit> callback) {
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
     * Patches this AdministrativeUnit with a source
     *
     * @param sourceAdministrativeUnit the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AdministrativeUnit sourceAdministrativeUnit, final ICallback<AdministrativeUnit> callback) {
        send(HttpMethod.PATCH, callback, sourceAdministrativeUnit);
    }

    /**
     * Patches this AdministrativeUnit with a source
     *
     * @param sourceAdministrativeUnit the source object with updates
     * @return the updated AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdministrativeUnit patch(final AdministrativeUnit sourceAdministrativeUnit) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AdministrativeUnit newAdministrativeUnit, final ICallback<AdministrativeUnit> callback) {
        send(HttpMethod.POST, callback, newAdministrativeUnit);
    }

    /**
     * Creates a AdministrativeUnit with a new object
     *
     * @param newAdministrativeUnit the new object to create
     * @return the created AdministrativeUnit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdministrativeUnit post(final AdministrativeUnit newAdministrativeUnit) throws ClientException {
        return send(HttpMethod.POST, newAdministrativeUnit);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAdministrativeUnitRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (AdministrativeUnitRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAdministrativeUnitRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (AdministrativeUnitRequest)this;
     }

}

