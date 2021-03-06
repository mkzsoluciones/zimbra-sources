/*
 * ***** BEGIN LICENSE BLOCK *****
 * 
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2012 VMware, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * 
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.qa.selenium.projects.admin.tests.cos;

import org.testng.annotations.Test;

import com.zimbra.qa.selenium.framework.util.HarnessException;
import com.zimbra.qa.selenium.framework.util.ZAssert;
import com.zimbra.qa.selenium.projects.admin.core.AdminCommonTest;
import com.zimbra.qa.selenium.projects.admin.ui.PageManageCOS;

public class NavigateCos extends AdminCommonTest {
	public NavigateCos() {
		logger.info("New "+ NavigateCos.class.getCanonicalName());

		// All tests start at the "Cos" page
		super.startingPage = app.zPageManageCOS;
	}
	
	/**
	 * Testcase : Navigate to Cos page
	 * Steps :
	 * 1. Go to Accounts
	 * 2. Verify navigation path -- "Home --> Configure --> Class Of Service"
	 * @throws HarnessException
	 */
	@Test(	description = "Navigate to Cos",
			groups = { "sanity" })
			public void NavigateCos_01() throws HarnessException {
		
		/*
		 * Verify navigation path -- "Home --> Configure --> Class Of Service"
		 */
		ZAssert.assertTrue(app.zPageManageCOS.zVerifyHeader(PageManageCOS.Locators.HOME), "Verfiy the \"Home\" text exists in navigation path");
		ZAssert.assertTrue(app.zPageManageCOS.zVerifyHeader(PageManageCOS.Locators.CONFIGURE), "Verfiy the \"Configure\" text exists in navigation path");
		ZAssert.assertTrue(app.zPageManageCOS.zVerifyHeader(PageManageCOS.Locators.CLASS_OS_SERVICE), "Verfiy the \"Class Of Service\" text exists in navigation path");
		
	}

}
