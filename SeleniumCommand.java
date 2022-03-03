package org.selenium.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumCommand {
	
	
	public static WebDriver driver;
	@Test
	void setUP() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("amam@gmail.com");
		//driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		//driver.navigate().forward();
		Thread.sleep(2000);
		String element = driver.findElement(By.id("SubmitLogin")).getText();
		System.out.println(element);
		Thread.sleep(2000);
		driver.close();
	}

}
