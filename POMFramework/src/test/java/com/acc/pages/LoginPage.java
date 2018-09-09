package com.acc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver d;
	
	@FindBy(id="Email")
	static WebElement TextBox_username;
	@FindBy(id="Password")
	static WebElement TextBox_password;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	static WebElement Btn_Login;
	
	public void enterLoginData(String u, String p)
	{
		TextBox_username.sendKeys(u);
		TextBox_password.sendKeys(p);
		Btn_Login.click();
		
	}
	

}
