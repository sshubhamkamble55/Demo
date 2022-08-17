package com.flipcart.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Intiolization_Browser {

	public WebDriver driver;
	public void openingBrowser(String Browser){
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:/JavaLibrary/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver","D:/JavaLibrary/msedgedriver.exe");
	        driver = new EdgeDriver();
		}else{
			System.out.println("Not Match");
		}
		driver.get("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
	}
	
}
