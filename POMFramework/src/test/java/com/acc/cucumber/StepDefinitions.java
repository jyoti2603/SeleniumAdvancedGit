package com.acc.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
    WebDriver driver;
@Given("^When I am on the Tricentis login page$")
public void when_I_am_on_the_Tricentis_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse\\eclipse\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get("http://demowebshop.tricentis.com/");
}

@When("^I give abc and xyz$")
public void i_give_abc_and_xyz() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Enter U and P");
}
@When("^I click on login button$")
public void i_click_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Click on login");
}

@Then("^I should be able to login$")
public void i_should_be_able_to_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Login");
}


}
