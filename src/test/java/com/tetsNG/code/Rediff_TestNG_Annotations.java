package com.tetsNG.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG_Annotations {
	public static WebDriver driver;

	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@Test
	public void LoginCredentials() {
		WebElement username = driver.findElement(By.xpath("//input[@id= 'login1']"));
		username.sendKeys("pratiklenekar");
		WebElement pass = driver.findElement(By.xpath("//input[@id= 'password']"));
		pass.sendKeys("Nagpur@2022");
		WebElement signin = driver.findElement(By.xpath("//div[@class= 'row']/descendant::input[@class='signinbtn']"));
		signin.click();
	}

	@AfterTest
	public void logot() {
		WebElement signout = driver.findElement(By.xpath("//a[@class= 'rd_logout']"));
		signout.click();
	}

}
