package com.automation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc_code {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//body[@class='ui-overflow-hidden']/descendant::button[contains(text(), 'OK')]"))
				.click();
		driver.findElement(By.xpath(
				"//form[@class='ng-pristine ng-invalid ng-touched']/descendant::input[contains(@class, 'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]"))
				.sendKeys("Pune");
		driver.findElement(By.xpath(
				"//div[@class= 'main-back']/descendant::input[contains(@class, 'ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]"))
				.sendKeys("Gondia");

	}

}
