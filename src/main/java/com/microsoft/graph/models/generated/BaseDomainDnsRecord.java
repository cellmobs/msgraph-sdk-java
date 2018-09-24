// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Domain Dns Record.
 */
public class BaseDomainDnsRecord extends Entity implements IJsonBackedObject {


    /**
     * The Is Optional.
     * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain.
     */
    @SerializedName("isOptional")
    @Expose
    public Boolean isOptional;

    /**
     * The Label.
     * Value used when configuring the name of the DNS record at the DNS host.
     */
    @SerializedName("label")
    @Expose
    public String label;

    /**
     * The Record Type.
     * Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, TxtKey
     */
    @SerializedName("recordType")
    @Expose
    public String recordType;

    /**
     * The Supported Service.
     * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune
     */
    @SerializedName("supportedService")
    @Expose
    public String supportedService;

    /**
     * The Ttl.
     * Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable
     */
    @SerializedName("ttl")
    @Expose
    public Integer ttl;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
