// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IUserFindMeetingTimesRequest;
import com.microsoft.graph.requests.extensions.UserFindMeetingTimesRequest;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Find Meeting Times Request Builder.
 */
public class BaseUserFindMeetingTimesRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserFindMeetingTimes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param attendees the attendees
     * @param locationConstraint the locationConstraint
     * @param timeConstraint the timeConstraint
     * @param meetingDuration the meetingDuration
     * @param maxCandidates the maxCandidates
     * @param isOrganizerOptional the isOrganizerOptional
     * @param returnSuggestionReasons the returnSuggestionReasons
     * @param minimumAttendeePercentage the minimumAttendeePercentage
     */
    public BaseUserFindMeetingTimesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<AttendeeBase> attendees, final LocationConstraint locationConstraint, final TimeConstraint timeConstraint, final javax.xml.datatype.Duration meetingDuration, final Integer maxCandidates, final Boolean isOrganizerOptional, final Boolean returnSuggestionReasons, final Double minimumAttendeePercentage) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("attendees", attendees);
        bodyParams.put("locationConstraint", locationConstraint);
        bodyParams.put("timeConstraint", timeConstraint);
        bodyParams.put("meetingDuration", meetingDuration);
        bodyParams.put("maxCandidates", maxCandidates);
        bodyParams.put("isOrganizerOptional", isOrganizerOptional);
        bodyParams.put("returnSuggestionReasons", returnSuggestionReasons);
        bodyParams.put("minimumAttendeePercentage", minimumAttendeePercentage);
    }

    /**
     * Creates the IUserFindMeetingTimesRequest
     *
     * @return the IUserFindMeetingTimesRequest instance
     */
    public IUserFindMeetingTimesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserFindMeetingTimesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserFindMeetingTimesRequest instance
     */
    public IUserFindMeetingTimesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserFindMeetingTimesRequest request = new UserFindMeetingTimesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("attendees")) {
            request.body.attendees = getParameter("attendees");
        }

        if (hasParameter("locationConstraint")) {
            request.body.locationConstraint = getParameter("locationConstraint");
        }

        if (hasParameter("timeConstraint")) {
            request.body.timeConstraint = getParameter("timeConstraint");
        }

        if (hasParameter("meetingDuration")) {
            request.body.meetingDuration = getParameter("meetingDuration");
        }

        if (hasParameter("maxCandidates")) {
            request.body.maxCandidates = getParameter("maxCandidates");
        }

        if (hasParameter("isOrganizerOptional")) {
            request.body.isOrganizerOptional = getParameter("isOrganizerOptional");
        }

        if (hasParameter("returnSuggestionReasons")) {
            request.body.returnSuggestionReasons = getParameter("returnSuggestionReasons");
        }

        if (hasParameter("minimumAttendeePercentage")) {
            request.body.minimumAttendeePercentage = getParameter("minimumAttendeePercentage");
        }

        return request;
    }
}
