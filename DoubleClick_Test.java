package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick_Test {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	DoubleClick_Test.DoubleClick();//Call the method from the class
		
	}
	
	//create the method
	static void DoubleClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();// setup chromedriver
		driver = new ChromeDriver(); // open new browser
		
		driver.get("https://demoqa.com/automation-practice-form"); // open the given URL
		
		driver.manage().window().maximize(); // manage the window and maximize the window
		
		Thread.sleep(2000); // delay by given time in mille seconds
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Name']")); // will identify the element
		// need to pass the element into the action
		
		Actions act = new Actions(driver); //instantiate the actions class
		
		Thread.sleep(2000);
		act.doubleClick(element).perform();
		
	}
	
	
	//https://demoqa.com/automation-practice-form
}
