package com.automation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BedBath_Beyond {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bedbathandbeyond.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("sHide")).sendKeys("kitchen trash cans");
		Thread.sleep(3000);

	}

}
