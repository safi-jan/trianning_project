package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjs {
	WebDriver driver;
	
	
	@FindBy (id ="email")
	WebElement emailid;
	
	@FindBy(id ="pass")
	WebElement password;
	@FindBy(xpath= "//*[@id=\"u_0_4\"]")
	WebElement signin;
	
	
public  pageobjs(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
}	
public void emailadd() {
	emailid.sendKeys("safi1233@hotmail.com");
}

public void passwordd() {
	password.sendKeys("lolo");
}
public void singing() {
	signin.click();
}
}
