package com.automation_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbSignUp {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/descendant::input[1]")).sendKeys("lucifer");
		driver.findElement(By.xpath(
				"//div[@id='reg_error']/following-sibling::form[@id= 'reg']/descendant::input[@name= 'lastname']"))
				.sendKeys("Johnson");

		driver.findElement(By.xpath(
				"//div[@class='_9bq4']/preceding-sibling::div[@class= 'hidden_elem']//preceding::input[@name= 'reg_email__']"))
				.sendKeys("9404433344");
		driver.findElement(By.xpath(
				"//div[@id='globalContainer']/descendant::div[@id='reg_form_box']/descendant::input[@name= 'reg_passwd__']"))
				.sendKeys("abc123");
		driver.findElement(
				By.xpath("//div[@id= 'fullname_field']/following-sibling::div[@id= 'u_0_n_oD']/descendant::label[2]"))
				.click();

	}

}
