package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	
		WebDriver driver;
		public AmazonHomePage(WebDriver driver)
		{
			this.driver = driver;		
		}
		By GoToLogin = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	

	public WebElement GoToSignIn()
	
	{
		return driver.findElement(GoToLogin);
	}
}