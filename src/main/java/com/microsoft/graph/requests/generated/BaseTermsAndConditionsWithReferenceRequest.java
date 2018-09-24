// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Terms And Conditions With Reference Request.
 */
public class BaseTermsAndConditionsWithReferenceRequest extends BaseRequest implements IBaseTermsAndConditionsWithReferenceRequest {

    /**
     * The request for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTermsAndConditionsWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditions.class);
    }

    public void post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload, final ICallback<TermsAndConditions> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public TermsAndConditions post(final TermsAndConditions newTermsAndConditions, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newTermsAndConditions;
        }
        return null;
    }

    public void get(final ICallback<TermsAndConditions> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public TermsAndConditions get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<TermsAndConditions> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final TermsAndConditions sourceTermsAndConditions, final ICallback<TermsAndConditions> callback) {
		send(HttpMethod.PATCH, callback, sourceTermsAndConditions);
	}

	public TermsAndConditions patch(final TermsAndConditions sourceTermsAndConditions) throws ClientException {
		return send(HttpMethod.PATCH, sourceTermsAndConditions);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITermsAndConditionsWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ITermsAndConditionsWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITermsAndConditionsWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (TermsAndConditionsWithReferenceRequest)this;
    }
}
