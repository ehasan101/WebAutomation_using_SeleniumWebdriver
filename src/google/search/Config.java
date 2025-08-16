

package google.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Config {
	
	public static WebDriver getDriver() {
		
		System.setProperty("WebDriver.chrome.driver","C:\\tempppA\\chromedriver_win32\\chromedriver.exe");
	
		// ei driver variable ti diyei sob kichu kora hobe chrome e
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
}
