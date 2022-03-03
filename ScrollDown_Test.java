package org.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown_Test {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ScrollDown_Test.scrollDown(); // call from the class of the method
		
	}
	
	static void scrollDown() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); //setup the browser
		driver = new ChromeDriver();// opens new chrome browser
		
		driver.get("https://demoqa.com/automation-practice-form"); // open the given URL
		driver.manage().window().maximize();// maximize the window
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		/*
		 * jse.executeScript("window.scrollBy(0,200)"); // vertical scroll
		 * Thread.sleep(2000); jse.executeScript("window.scrollBy(0,-200)");
		 */
		// horizontal scroll
	//	jse.executeScript("window.scrollBy(200,0)");
		
		WebElement ele = driver.findElement(By.xpath("(//*[@class=' css-1wa3eu0-placeholder'])[1]"));

		/*
		 * “arguments[0]” means first index of page starting at 0.
		 * Where an ” Element ” is the locator on the web page.
		 */

		jse.executeScript("arguments[0].scrollIntoView();", ele); //scroll down the web page by the visibility of the element.


		
		
		// to scroll bottom of the screen
		//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//scroll a specific DIV
		//jse.executeScript("arguments[0].scrollIntoView(true);", ele);

		
	}

}
