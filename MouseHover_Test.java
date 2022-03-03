package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Test {

	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MouseHover_Test.mouseHover(); // caling the method from the class
		
	}

	static void mouseHover() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// setup webdriver Manager
		driver = new ChromeDriver();
		// opens new browser
		
		driver.get("http://automationpractice.com/index.php?id_category=9&controller=category");
		// gets the given URL
		driver.manage().window().maximize();
		// maximize the window
		
		Thread.sleep(2000);
		// delay by 2000 milliseconds
		
		WebElement Element_1 = driver.findElement(By.xpath("(//*[text()='Dresses'])[2]")); 
		// find the element on website and pass it to Element_1
		
		WebElement Element_2 = driver.findElement(By.xpath("(//*[text()='Evening Dresses'])[2]"));
		// find the element on website and pass it to Element_2
		
		Actions act = new Actions(driver);
		//instantiate the Actions class
		
		act.moveToElement(Element_1).click(Element_2).build().perform(); // Mouse Hover
		
		
		
	}
	
	
}
