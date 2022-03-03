package org.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountColumnRows_Test {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CountColumnRows_Test.countColumnRow();

	}

	static void countColumnRow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		List<WebElement> Element_1 = driver.findElements(By.xpath("//*[@class='dataTable']/thead/tr/th"));
		System.out.println(Element_1.size());

		List<WebElement> Row = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		System.out.println(Row.size());
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
