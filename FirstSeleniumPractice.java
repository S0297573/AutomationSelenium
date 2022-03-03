package org.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumPractice {
	public static WebDriver driver;
	void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) {
		FirstSeleniumPractice fsp=new FirstSeleniumPractice();
		fsp.init();
			
		
		
	}

}
