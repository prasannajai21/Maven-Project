package com.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Mavan_Project.Baseclass;

import junit.framework.Assert;

public class junitframe extends Baseclass {

	@BeforeClass
	public static void browserStarted() {
		launchBrowser();
		windowmaximize();
		System.out.println("Browser launched");
	}

	@AfterClass
	public static void closebrowser() {

		System.out.println("Browser closed");
	}

	@Before
	public void startingtime() {
		Date d = new Date();
		System.out.println("Time Started " + d);
	}

	@After
	public void endingtime() {
		Date d = new Date();
		System.out.println("Ending Time" + d);
	}

	@Test
	public void tc3() {
		launchurl("https://www.youtube.com/");
		System.out.println("youtube launched");
	}

	@Test
	public void tc7() {
		launchurl("https://inmakes.com/");
		System.out.println("inmakes infotech launched");
	}

	@Test
	public void tc2() {
		launchurl("https://www.facebook.com/");
		System.out.println("Facebook launched");
	}

	@Test
	public void tc1() {
		launchurl("https://accounts.google.com/");
		System.out.println("gmail launched");
		String title = pagetitle();
		Assert.assertTrue("check page Title",title.contains("gmail"));
	}
}