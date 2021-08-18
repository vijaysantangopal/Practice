package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
public WebDriver initializedriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay.Santangopal\\Desktop\\SE\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return driver;
}

}
