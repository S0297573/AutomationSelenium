package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop_Test2 {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DragDrop_Test2.dragDropClick();
		
		
	}

	
	static void dragDropClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Element_1 = driver.findElement(By.xpath("//*[text()='Axis Restricted']"));
		Element_1.click();
		
		WebElement From = driver.findElement(By.xpath("//*[text()='Only X']"));
		WebElement To = driver.findElement(By.xpath("//*[text()='Only Y']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
		
		
	}
}
