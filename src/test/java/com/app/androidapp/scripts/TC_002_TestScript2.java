package com.app.androidapp.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.LandingPage;

public class TC_002_TestScript2 extends BaseLib{
	
	@Test
	public void tc_002_testTwo() throws IOException, InterruptedException
	{
		LandingPage lp = new LandingPage(driver);
		
		lp.tapOnViewsMenu();
		
	}

}
