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
import com.microsoft.graph.models.generated.ConnectionDirection;
import com.microsoft.graph.models.generated.SecurityNetworkProtocol;
import com.microsoft.graph.models.generated.ConnectionStatus;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Network Connection.
 */
public class BaseNetworkConnection implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Name.
     * 
     */
    @SerializedName("applicationName")
    @Expose
    public String applicationName;

    /**
     * The Destination Address.
     * 
     */
    @SerializedName("destinationAddress")
    @Expose
    public String destinationAddress;

    /**
     * The Destination Domain.
     * 
     */
    @SerializedName("destinationDomain")
    @Expose
    public String destinationDomain;

    /**
     * The Destination Port.
     * 
     */
    @SerializedName("destinationPort")
    @Expose
    public String destinationPort;

    /**
     * The Destination Url.
     * 
     */
    @SerializedName("destinationUrl")
    @Expose
    public String destinationUrl;

    /**
     * The Direction.
     * 
     */
    @SerializedName("direction")
    @Expose
    public ConnectionDirection direction;

    /**
     * The Domain Registered Date Time.
     * 
     */
    @SerializedName("domainRegisteredDateTime")
    @Expose
    public java.util.Calendar domainRegisteredDateTime;

    /**
     * The Local Dns Name.
     * 
     */
    @SerializedName("localDnsName")
    @Expose
    public String localDnsName;

    /**
     * The Nat Destination Address.
     * 
     */
    @SerializedName("natDestinationAddress")
    @Expose
    public String natDestinationAddress;

    /**
     * The Nat Destination Port.
     * 
     */
    @SerializedName("natDestinationPort")
    @Expose
    public String natDestinationPort;

    /**
     * The Nat Source Address.
     * 
     */
    @SerializedName("natSourceAddress")
    @Expose
    public String natSourceAddress;

    /**
     * The Nat Source Port.
     * 
     */
    @SerializedName("natSourcePort")
    @Expose
    public String natSourcePort;

    /**
     * The Protocol.
     * 
     */
    @SerializedName("protocol")
    @Expose
    public SecurityNetworkProtocol protocol;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName("riskScore")
    @Expose
    public String riskScore;

    /**
     * The Source Address.
     * 
     */
    @SerializedName("sourceAddress")
    @Expose
    public String sourceAddress;

    /**
     * The Source Port.
     * 
     */
    @SerializedName("sourcePort")
    @Expose
    public String sourcePort;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public ConnectionStatus status;

    /**
     * The Url Parameters.
     * 
     */
    @SerializedName("urlParameters")
    @Expose
    public String urlParameters;


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
