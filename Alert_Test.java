package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Test {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Alert_Test.Alert();
	}

	static void Alert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//opens the new browser
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		// gets url
		// maximize window
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Click me'])[2]")).click();
		//By.xpath("(//*[text()='Click me'])[1]")).click();
		//using xpath and click method
		Thread.sleep(6000);
		// use to delay
		
	
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		/*
		 * Alert alert = driver.switchTo().alert(); alert.sendKeys("Prashanna");
		 * alert.accept();
		 */
	}
}
