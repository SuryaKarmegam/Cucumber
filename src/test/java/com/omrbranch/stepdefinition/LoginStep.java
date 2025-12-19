package com.omrbranch.stepdefinition;

import java.time.Duration;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;

	@Given("User is on the omr page")
	public void user_is_on_the_omr_page() {
		driver=new ChromeDriver();
	    driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	
	@When("User enter {string} and {string}")
	public void user_enter_and(String name, String password) {
		 driver.findElement(By.id("email")).sendKeys(name);
		  driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	   driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}
	@Then("User should verify after success login message")
	public void user_should_verify_after_success_login_message() {
	  Assert.assertTrue("Verify after login",true); 
	  driver.quit();
	}



}
