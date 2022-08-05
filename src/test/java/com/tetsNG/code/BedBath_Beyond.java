package com.tetsNG.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BedBath_Beyond {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bedbathandbeyond.com");
		
	}
	@Test
	public void searchproduct() {
		driver.findElement(By.xpath(""))
	}

}
