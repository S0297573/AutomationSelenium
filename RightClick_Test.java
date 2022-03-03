package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick_Test {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		RightClick_Test.rightClick();

	}
	
	static void rightClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		// setup the browser
		driver = new ChromeDriver();
		// opens new browser
		driver.get("https://demoqa.com/automation-practice-form");
		//opens the URL
		driver.manage().window().maximize();
		//Maximize the window
		WebElement Element_1 = driver.findElement(By.xpath("//*[text()='Name']"));
		//pass the xpath into the webElement
		
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.contextClick(Element_1).build().perform();
		
	}

}
