package TestNG;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mavan_Project.Baseclass;

public class tagannotations extends Baseclass{
   
	
	@Test(priority=2)
  public void tc1() {
		launchurl("https://accounts.google.com/");
	  System.out.println("Gmail Executed");
  }
	@Test(priority=4)
	  public void tc4() {
			launchurl("https://www.amazon.in/");
		  System.out.println("amazon Executed");
	  }
	@Test(priority=3)
	  public void tc5() {
			launchurl("https://www.facebook.com/");
		  System.out.println("facebook Executed");
	  }
	@Test(priority=1)
	  public void tc6() {
			launchurl("https://www.flipkart.com/");
		  System.out.println("flipkart Executed");
	  }
	@Test(priority=5)
	  public void tc7() {
			launchurl("https://www.youtube.com/");
		  System.out.println("youtube Executed");
	  }
	
	@Test(priority=7)
	  public void tc2() {
		
		launchurl("https://inmakes.com/");
		  System.out.println("inmakes Executed");
	  }
	
	@Test(priority=6)
	  public void tc3() {
		launchurl("https://www.redbus.in/");
		  System.out.println("TestCase 3 Executed");
	  }
    @BeforeClass
    public void launchbrowser() {
    	launchBrowser();
    	windowmaximize();
    	System.out.println("Browser Launching");
    }
    @AfterClass
    public void browserclosed() {
    	closebrowser();
    	System.out.println("Browser closed");
    }
    @BeforeMethod
     public void Startingtime() {
    	Date d = new Date();
    	 System.out.println("Starting time" + d);
     }
    @AfterMethod
    public void Endingtime() {
    	Date d = new Date();
   	 System.out.println("endingtime time" + d);
    }
    
	
}
