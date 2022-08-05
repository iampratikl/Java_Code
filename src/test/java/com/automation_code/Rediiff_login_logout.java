package com.automation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediiff_login_logout {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("seleniumpanda@rediffmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("selenium@123");
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.name("proceed"));
		signup.click();
	}

}
