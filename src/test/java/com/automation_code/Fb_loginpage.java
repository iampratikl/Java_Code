package com.automation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_loginpage {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Lucifer");
		driver.findElement(By.name("lastname")).sendKeys("Johnson");
		Thread.sleep(3000);
		driver.quit();

	}

}
