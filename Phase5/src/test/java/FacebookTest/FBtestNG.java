package FacebookTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FBtestNG {

	WebDriver driver;
	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nithin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nithin@123");
		driver.findElement(By.name("login")).submit();
		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		String path = "D:\\github\\practice\\geckodriver new\\geckodriver.exe";
	   	 System.setProperty("webdriver.gecko.driver", path);
	   	 
	   	 driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
}
