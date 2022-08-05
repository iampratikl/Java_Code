package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class, 'btn btn-black navbar-btn')]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("IamLenekar");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pratik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lenekar");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("pratiklenekar007@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Pratik123@");
	}

}
