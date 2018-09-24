// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DefaultManagedAppProtection;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Default Managed App Protection Collection Page.
 */
public class BaseDefaultManagedAppProtectionCollectionPage extends BaseCollectionPage<DefaultManagedAppProtection, IDefaultManagedAppProtectionCollectionRequestBuilder> implements IBaseDefaultManagedAppProtectionCollectionPage {

    /**
     * A collection page for DefaultManagedAppProtection
     *
     * @param response the serialized BaseDefaultManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDefaultManagedAppProtectionCollectionPage(final BaseDefaultManagedAppProtectionCollectionResponse response, final IDefaultManagedAppProtectionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
