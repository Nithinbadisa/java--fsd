package com.simplilearn;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Flipkart {
	
	WebDriver driver;
	
	 public void flipkart() throws Exception  {
		
		driver.get("https://www.flipkart.com/search");
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button")).click();
		
		 Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Reached At bottom of the page");
		
		
		//identify image
	      WebElement i = driver.findElement
	      (By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
	      // Javascript executor to check image
	      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	     //verify if status is true
	      if (p) {
	         System.out.println("Logo present");
	      } else {
	         System.out.println("Logo not present");
	      }
		
		
		
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS)
.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
			//	return driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._3_C9Hx > div > a:nth-child(1) > img"));
				
				WebElement element= driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div.go_DOp._2errNR > div > div > div > a"));
				String getTextOnPage= element.getText();
				
				if(getTextOnPage.equals("Login")) {
					System.out.println(getTextOnPage);
					System.out.println("Passed");
					return element;
				}
				else {
					System.out.println("Fluent Wait Fail!, Element Not Loaded Yet");
					return null;
				}
				
				
			}
		});
		}
		
		
	
	@BeforeMethod
	public void beforeMethod() {
		String path = "D:\\github\\practice\\geckodriver new\\geckodriver.exe";
	   	 System.setProperty("webdriver.gecko.driver", path);
	   	 
	   	 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		//driver.navigate().refresh();
		driver=null;
	}
	
	
}

