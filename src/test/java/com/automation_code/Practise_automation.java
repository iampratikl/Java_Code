package com.automation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise_automation {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='mobile-menu']/descendant::a[text()='Shop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='pagewrap']/descendant::img[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
