package com.example.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Update {

	WebDriver webdriver = null;
	String URL = "http://localhost:4200/";

	@Test
	public void update() {
		String path = "D:\\github\\practice\\geckodriver new\\geckodriver.exe";
	   	 System.setProperty("webdriver.gecko.driver", path);
	   	 
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//button[normalize-space()='Admin LogIn']")).click();
		webdriver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		webdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		webdriver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		webdriver.findElement(By.xpath("//div[8]//div[1]//div[2]//div[1]//a[1]//i[1]")).click();

		webdriver.findElement(By.xpath("//input[@ng-reflect-model='https://bootdey.com/img/Conten']")).clear();
		webdriver.findElement(By.xpath("//input[@ng-reflect-model='https://bootdey.com/img/Conten']"))
				.sendKeys("https://bootdey.com/img/Content/avatar/avatar7.png");
		webdriver.findElement(By.xpath("//button[@data-dismiss='modal'][normalize-space()='Save changes']")).click();
		System.out.println("Updation Tested Succesfully");
	}
}
