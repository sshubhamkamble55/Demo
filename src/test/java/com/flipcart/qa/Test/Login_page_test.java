package com.flipcart.qa.Test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipcart.qa.Base.Intiolization_Browser;
import com.flipcart.qa.Page.LogIn_page;

public class Login_page_test extends Intiolization_Browser{

	@BeforeClass
	public void opening(){
		openingBrowser("chrome");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Closed successfully");
	}
	
	
	@Test
	void loginPageTest() throws IOException{
		LogIn_page lp = new LogIn_page(driver);
		lp.varifyMail();
		lp.varifypass();
		lp.varify_forgot_btn();
		lp.varify_Login_btn();
		lp.borderMail(driver);
		lp.ss(driver);
		//lp.varify_create_account();
	}
}
