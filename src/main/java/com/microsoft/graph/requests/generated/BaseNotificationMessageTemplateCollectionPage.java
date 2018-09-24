// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Notification Message Template Collection Page.
 */
public class BaseNotificationMessageTemplateCollectionPage extends BaseCollectionPage<NotificationMessageTemplate, INotificationMessageTemplateCollectionRequestBuilder> implements IBaseNotificationMessageTemplateCollectionPage {

    /**
     * A collection page for NotificationMessageTemplate
     *
     * @param response the serialized BaseNotificationMessageTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseNotificationMessageTemplateCollectionPage(final BaseNotificationMessageTemplateCollectionResponse response, final INotificationMessageTemplateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
