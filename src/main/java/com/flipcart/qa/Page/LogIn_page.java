package com.flipcart.qa.Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipcart.qa.Base.Intiolization_Browser;
import com.flipcart.qa.Utility.Utilities;

public class LogIn_page{

	@FindBy (xpath="//div[@class='IiD88i _351hSN']/input") private WebElement mail; 
	@FindBy (xpath="//input[@type='password']") private WebElement pass;
	@FindBy (xpath="//span[text()='Forgot?']") private WebElement forgot;
	@FindBy (xpath="//div[@class='_1D1L_j']//button") private WebElement logIN;
	//@FindBy (xpath="") private WebElement otp;
	@FindBy (xpath="//a[text()='New to Flipkart? Create an account']") private WebElement create_account;
	
	@Test
	public LogIn_page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void varifyMail(){
		Assert.assertTrue(mail.isDisplayed(), "Not Display mail id");
		Assert.assertTrue(mail.isEnabled(), "mail is not enabled");
		mail.sendKeys("9150508055");
		Reporter.log("Mail Varified");
	}
	
	public void varifypass(){
		Assert.assertTrue(pass.isDisplayed(), "Not Display pass id");
		Assert.assertTrue(pass.isEnabled(), "pass is not enabled");
		pass.sendKeys("9150508055");
		Reporter.log("Password Varified");
	}
	
	public void varify_forgot_btn(){
		Assert.assertTrue(forgot.isDisplayed(), "Not Display forgot btn");
		Reporter.log("Forgot btn Varified");
	}
	
	public void varify_Login_btn(){
		Assert.assertTrue(logIN.isDisplayed(), "Not Display logIN id");
		Reporter.log("logIN_btn Varified");
	}
	
	public void varify_create_account(){
		Assert.assertTrue(create_account.isDisplayed(), "Not Display create_account btn");
		create_account.click();
		Reporter.log("create_account_btn Varified");
	}
	
	public void borderMail(WebDriver driver){
		Utilities ut = new Utilities();
		ut.border(driver, pass);
		System.out.println("Border done");
	}
	
	public void ss(WebDriver driver) throws IOException{
		Utilities ut = new Utilities();
		ut.Screenshot(driver);
	}
	
}
