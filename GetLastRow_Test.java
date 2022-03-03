package org.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLastRow_Test {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GetLastRow_Test.getLastRow();
		
	}

	static void getLastRow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> Element_2 = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[last()]/td"));
		
		for(WebElement Element:Element_2) {
			System.out.println(Element.getText());
		}
		
		
	}
	
	
}
