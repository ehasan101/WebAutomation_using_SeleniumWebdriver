package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracQ3 {

	public static void main(String[] args) {
		
//		add driver, variable name is 'driver'
		WebDriver driver = Config.getDriver();
		
//		1. go url -> get()
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		
//		2. click
		//WebElement element = driver.findElement(By.id("button2"));
		//WebElement ele2 = driver.findElement(By.id("button3"));

//		click on link with click() 
		//element.click();
		//ele2.click();
		
		
//		 3. Type // click on link with .sendKeys() WebElement element=
//		 driver.findElement(By.id("text")); 
//		 // ar akbar 'WebElement element' bananurpor ar WebElement element dite hoy na, just element dilei hoy
//		 element.sendKeys("Mairala Men");
//		  
//		 //password //element= driver.findElement(By.id("password"));
//		 //element.sendKeys("Mara khen khabi!");
//		 driver.findElement(By.id("password")).sendKeys("Mara khen khabi!"); 
//		  
//		 element= driver.findElement(By.id("login-button")); element.click(); 
	 				

//		4. Read
//		.getText();
//		noton kore GetTxt vari. niye seta 'GT' vari. e rakha hoise
		WebElement GetTxt = driver.findElement(By.name("contactme"));
		String GT = GetTxt.getText();

		if(GT.equals("CONTACT US")) {
			System.out.println("Passed. Text is "+GT);
		}else {
			System.out.println("Failed");
		}
			

		
		driver.close();

	
		

	}

}
