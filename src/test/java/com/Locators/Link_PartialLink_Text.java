package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_PartialLink_Text {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://rediff.com");
		// driver.findElement(By.linkText("Create Account")).click();
		driver.get("https://www.amazon.com");
		driver.findElement(By.linkText("Sign in")).click();
	}

}
