package org.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Test_2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Alert_Test_2.alertPromptBox();
	}
	static void alertPromptBox() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Click me'])[4]")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Aman");
		
		alert.accept();

		}
}
