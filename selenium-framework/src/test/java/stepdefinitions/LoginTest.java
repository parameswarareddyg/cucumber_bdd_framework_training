package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverManager;
import utils.TestContext;

public class LoginTest{

	LoginPage loginPage;
	
	@Given("user on Login Page")
	public void loadLoginPage()
	{
		DriverManager.getDriver().get("https://www.flipkart.com/account/login?ret=/");
		loginPage = new LoginPage(DriverManager.getDriver());
	}
	
	@When("user enter {string}")
	public void updateMobileNumber(String mobileNumber) {
		loginPage.enterMobileNumber(mobileNumber);
//		System.out.println(TestContext.getData("mobilenumber"));
	}
	
	@When("user enter mobilenumber from excel")
	public void updateMobileNumberFromExcel()
	{
	    String mobileNumber = TestContext.getData("mobilenumber");
	    System.out.println(mobileNumber);
	    loginPage.enterMobileNumber(mobileNumber);
	}
	@And("click for RequestOTP")
	public void requestOTP()
	{	
		loginPage.requestOTP();
	}
	
	@Then("validate verify button")
	public void validateVerifyButton(){
		loginPage.validateVerifyButton();
	}
	
	@Then("validate warning message")
	public void validateWarningMessage()
	{
		loginPage.validateWarningMessage();
	}
}
