package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTestClass_1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		CheckBoxTestClass_1.checkBox();
		
		

	}
	
	static void checkBox() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Opens the browser window
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//label[text()='Sports']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@class='custom-control custom-checkbox custom-control-inline']/child::label)[1]")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
