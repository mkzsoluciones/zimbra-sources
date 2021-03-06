<!--
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Web Client
 * Copyright (C) 2008, 2009, 2010 VMware, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
-->
<%@ taglib prefix="fmt" uri="com.zimbra.i18n" %>
<h3>Locale: "${requestScope.locale}"</h3>
<fmt:setLocale value="${requestScope.locale}" /> 
<table border="1" cellspacing=0 cellpadding=3>
	<tr><th>Type</th><th>Pattern</th><th>Example</th><th>Parsed</th></tr>
	<jsp:include page="parseNumber_row.jsp">
		<jsp:param name="type" value="number" />
	</jsp:include>
	<jsp:include page="parseNumber_row.jsp">
		<jsp:param name="type" value="currency" />
	</jsp:include>
	<jsp:include page="parseNumber_row.jsp">
		<jsp:param name="type" value="percent" />
	</jsp:include>
</table>
