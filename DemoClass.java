package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoClass {

	
	
	
	
	public static WebDriver driver;
	void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus 6T");
	driver.findElement(By.cssSelector("#gh-btn")).click();
	}
	
	public static void main(String[] args) {
		DemoClass fsp=new DemoClass();
		fsp.init();
			

	}

}
