package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop_Test {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DragDrop_Test.dragDropClick();
		
	}
	
	static void dragDropClick() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		
		WebElement Element_1 = driver.findElement(By.xpath("//*[text()='Drag me']"));
		
		Point point = Element_1.getLocation();
		
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(Element_1, 417, 216).build().perform();
		
		
		
		
		
		
	}

}
