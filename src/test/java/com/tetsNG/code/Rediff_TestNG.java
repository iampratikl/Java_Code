package com.tetsNG.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG {

	public static WebDriver driver;

	@Test

	public void loginCheck() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username = driver.findElement(By.xpath(
				"//div[@id= 'div_login_error']/following-sibling::div[@class= 'table']/descendant::input[@id= 'login1']"));
		username.sendKeys("pratiklenekar");
		WebElement password = driver.findElement(By.xpath(
				"//div[@id= 'div_login_error']/following-sibling::div[@class= 'table']/descendant::input[@id= 'password']"));
		password.sendKeys("abc123");
		WebElement signin = driver
				.findElement(By.xpath("//div[contains(@class, 'floatR rightwidth')]/preceding::input[2]"));
		signin.click();
	}

}
