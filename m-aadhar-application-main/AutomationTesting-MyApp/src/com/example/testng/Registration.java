package com.example.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Registration {
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/";

	@Test
	public void registration() {
		String path = "D:\\github\\practice\\geckodriver new\\geckodriver.exe";
	   	 System.setProperty("webdriver.gecko.driver", path);
	   	 
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//button[normalize-space()='Register New Citizen']")).click();
		webdriver.findElement(By.xpath("//ul[@class='navbar-nav mr-auto']//a[@class='nav-link']")).click();
		webdriver.findElement(By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//input[@id='fullname']"))
				.sendKeys("Jack Miller");
		webdriver.findElement(By.xpath("(//input[@id='dob'])[1]"))
				.sendKeys("2/2/2008");
		webdriver.findElement(By.xpath("(//input[@id='email'])[1]"))
				.sendKeys("jack@example.com");
		webdriver.findElement(By.xpath("(//input[@id='address'])[1]"))
				.sendKeys("A-10,CityCenter,Puri");
		webdriver.findElement(By.xpath("(//input[@id='gender'])[1]"))
				.sendKeys("Male");
		webdriver.findElement(By.xpath("(//input[@id='phone'])[1]"))
				.sendKeys("99999777");
		webdriver.findElement(By.xpath("(//input[@id='imageUrl'])[1]"))
				.sendKeys("https://bootdey.com/img/Content/avatar/avatar6.png");
		webdriver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Registration Tested Succesfully");
	}
}
