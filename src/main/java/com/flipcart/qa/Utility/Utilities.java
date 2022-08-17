package com.flipcart.qa.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.flipcart.qa.Base.Intiolization_Browser;

public class Utilities extends Intiolization_Browser{

	@Test
	public void border(WebDriver driver,WebElement element){
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='15px solid red'", element);
	}
	
	public void Screenshot(WebDriver driver) throws IOException{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File file = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:/workspace3/com.flipcart.qa/Screenshots//flipcart.png");
		FileUtils.copyFile(file, dest);
		System.out.println("Screenshot taken");
	}
}
