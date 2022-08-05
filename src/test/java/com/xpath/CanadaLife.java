package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CanadaLife {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canadalife.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//a[contains(@class, 'n-button n-header-ctas-desktop__cta-button is-clear-margin-bottom is-clear-margin-top is-clear-margin-right n-button--primary n-button--default n-button--small')]"))
				.click();
		driver.findElement(
				By.xpath("//a[contains(@class, 'n-link-nav n-secondary-nav-bar__link is-hidden-sm-down is-active')]"))
				.click();
	}

}
