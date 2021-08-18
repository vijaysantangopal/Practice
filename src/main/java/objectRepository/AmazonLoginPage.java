package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPage {
	WebDriver driver;
	public AmazonLoginPage(WebDriver driver)
	{
		this.driver = driver;		
	}
	
	By Username = By.id("ap_email");
	By Continue_button =  By.id("continue");
	By Password =  By.id("ap_password");
    By SignIn_Button =  By.id("signInSubmit");
	
public WebElement Username()
	
	{
		return driver.findElement(Username);
	}
public WebElement Continue_button()

{
	return driver.findElement(Continue_button);
}
public WebElement Password()

{
	return driver.findElement(Password);
}
public WebElement SignIn_Button()

{
	return driver.findElement(SignIn_Button);
}

	

}
