package com.acc.tests;

import org.testng.annotations.Test;

import com.acc.pages.HomePage;
import com.acc.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LoginTest {

	WebDriver driver;
	HomePage h;
	LoginPage l;

	@Test
	public void logintest() {
		driver.get("http://demowebshop.tricentis.com/");
		h.clickLogin();
		l.enterLoginData("Jyoti@gmail.com", "assewe12");
	}

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\POMFramework\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		h = PageFactory.initElements(driver, HomePage.class);
		l = PageFactory.initElements(driver, LoginPage.class);
	}

}
