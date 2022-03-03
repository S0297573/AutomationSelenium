package org.selenium.practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RadioButtonTest_1 {

	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException
	{
		RadioButtonTest_1.clickOnRadioButton();
		
	}

	static void clickOnRadioButton() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afctp0SqhlvEXT9hkZYdBSVpWtOZv43ABDxXCdQT8yjOu_wZm6Q7TMs3uohlOaRmGVkphaIYQuq3XShHH56gqp2F&smuh=53308&lh=Ac-6XWlO2vQQi517SA8");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(text(),'Create new account')]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//*[@class='_5k_2 _5dba']/child::label)[1]")).click();
	}
	
	static void clickOnRadioButtons(String radioLabel) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afctp0SqhlvEXT9hkZYdBSVpWtOZv43ABDxXCdQT8yjOu_wZm6Q7TMs3uohlOaRmGVkphaIYQuq3XShHH56gqp2F&smuh=53308&lh=Ac-6XWlO2vQQi517SA8");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(text(),'Create new account')]")).click();
		 Thread.sleep(2000);
		 
		 List<WebElement> radioButton = driver.findElements(By.xpath("(//*[@class='_5k_2 _5dba']/child::label)"));
		 
		 //List<WebElement> radioButton = driver.findElements(By.xpath("(//*[@class='_5k_2 _5dba']/child::label)"));
		 // ppt
		 //actual code
		 //List<WebElement> radioButton = driver.findElements(By.xpath("//*[@class='_5k_2 _5dba']/child::label)"));
		 
		
		 
		 for(int i = 0; i<radioButton.size();i++) {
			 radioButton.get(i).click();
		 }
	}
}
