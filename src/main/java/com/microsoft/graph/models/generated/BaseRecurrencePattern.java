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
import com.microsoft.graph.models.generated.RecurrencePatternType;
import com.microsoft.graph.models.generated.DayOfWeek;
import com.microsoft.graph.models.generated.WeekIndex;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Recurrence Pattern.
 */
public class BaseRecurrencePattern implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Type.
     * The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required.
     */
    @SerializedName("type")
    @Expose
    public RecurrencePatternType type;

    /**
     * The Interval.
     * The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     */
    @SerializedName("interval")
    @Expose
    public Integer interval;

    /**
     * The Month.
     * The month in which the event occurs.  This is a number from 1 to 12.
     */
    @SerializedName("month")
    @Expose
    public Integer month;

    /**
     * The Day Of Month.
     * The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     */
    @SerializedName("dayOfMonth")
    @Expose
    public Integer dayOfMonth;

    /**
     * The Days Of Week.
     * A collection of the days of the week on which the event occurs. Possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     */
    @SerializedName("daysOfWeek")
    @Expose
    public java.util.List<DayOfWeek> daysOfWeek;

    /**
     * The First Day Of Week.
     * The first day of the week. Possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly.
     */
    @SerializedName("firstDayOfWeek")
    @Expose
    public DayOfWeek firstDayOfWeek;

    /**
     * The Index.
     * Specifies on which instance of the allowed days specified in daysOfsWeek the event occurs, counted from the first instance in the month. Possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     */
    @SerializedName("index")
    @Expose
    public WeekIndex index;


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
