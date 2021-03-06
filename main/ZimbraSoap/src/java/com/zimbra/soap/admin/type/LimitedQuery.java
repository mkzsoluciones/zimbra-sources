/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011, 2012 VMware, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.soap.admin.type;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

import com.zimbra.common.service.ServiceException;
import com.zimbra.common.soap.AdminConstants;

@XmlAccessorType(XmlAccessType.NONE)
public class LimitedQuery {

    /**
     * @zm-api-field-tag query
     * @zm-api-field-description Query
     */
    @XmlValue private final String text;
    /**
     * @zm-api-field-tag query-limit
     * @zm-api-field-description Limit.  Default value 10
     */
    @XmlAttribute(name=AdminConstants.A_LIMIT /* limit */, required=false)
    private final Long limit;

    /**
     * no-argument constructor wanted by JAXB
     */
    @SuppressWarnings("unused")
    private LimitedQuery() {
        this((String) null, (Long) null);
    }

    public LimitedQuery(String text, Long limit) {
        this.text = text;
        this.limit = limit;
    }

    public String getText() { return text; }
    public Long getLimit() { return limit; }
}
