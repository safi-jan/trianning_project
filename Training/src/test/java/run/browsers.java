package run;

import org.testng.annotations.Test;

import dataprovider.pageobjs;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterClass;

public class browsers   {
 public static WebDriver driver;
 
  

 
 
 
 
  @BeforeClass
  public void beforeClass(String browser) {
		  System.out.println("Running browser is:"+browser );
		  if(browser.equalsIgnoreCase("chrome")) { 
		   System.setProperty("webdriver.chrome.driver","/Users/safi/Desktop/chromedriver" );
		  driver =new ChromeDriver();
		   
		  
		  }
		  else if (browser.equals("firefox")) {
			  System.setProperty("webdriver.gecko.driver","/Users/safi/Desktop/geckodriver" );
			  driver =new FirefoxDriver();
			  driver.navigate().to("https://www.facebook.com");
				 driver.manage().window().maximize();
			 
		
	  }
		 
		  }
  

  @AfterClass
  public void afterClass() {
  }

}
