package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.assertEquals;

public class stepDef {
    
	WebDriver driver;
	@Given("^Flipkart Website is loaded$")
	public void flipkart_Website_is_loaded() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	}

	@When("^User enters Username and Password and login$")
	public void user_enters_username_and_password() throws Throwable {
	    driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA_1dBPDZ' ]")).sendKeys("Amit");
	    driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv _1dBDZ' ]")).sendKeys("Amit");
	    driver.findElement(By.xpath("//input[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c' ]")).click();
	}

	@Then("^Login should not be successful and Verify error message$")
	public void login_should_not_be_successful_and_Verify_error_message() throws Throwable {
	    
		assertEquals("Please enter valid Email ID/Mobile Number",driver.findElement(By.xpath("//span[2]/span")).getText());
	}
}
/*
 * @Given("^Flipkart Website is loaded$") public void
 * flipkart_Website_is_loaded() throws Throwable { // Write code here that turns
 * the phrase above into concrete actions throw new PendingException(); }
 * 
 * @Then("^Login should not be successful and Verify error message$") public void
 * login_should_not_be_sucessful_and_Verify_error_message() throws Throwable {
 * // Write code here that turns the phrase above into concrete actions throw
 * new PendingException(); }
 */
