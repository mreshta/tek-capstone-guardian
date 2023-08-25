package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class LoginSteps extends CommonUtility{

	POMFactory pomFactory=new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	Assert.assertTrue(pomFactory.homePage().tekschoolLogo.isDisplayed());
	logger.info("The user is on tek retail website");
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	click(pomFactory.loginPage().signInLink);
	logger.info("The User clicked on signIn button successfully");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
	sendText(pomFactory.loginPage().emailField, email);
	sendText(pomFactory.loginPage().passwordField, password);
	logger.info("The user successfully entred the email and password");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	click(pomFactory.loginPage().loginBttn);
	logger.info("the user clicked on the login button successfully");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(pomFactory.loginPage().logoutBttn.isDisplayed());
	logger.info("The user is signed in successfully");
	
	}	    
//	create new account steps
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(pomFactory.loginPage().newAccountBttn);
		logger.info("Create new account bttn clicked successfully");    
	}
	@When("User enter {string} and {string} and {string} and {string}")
	public void userFillTheSignUpInformationWithBelowData(String name, String email, String password, String confPassword) {
		sendText(pomFactory.loginPage().nameInputField, name);
		sendText(pomFactory.loginPage().emailInputField, email);
		sendText(pomFactory.loginPage().passwordInputField, password);
		sendText(pomFactory.loginPage().confirmPassInputField, confPassword);
		logger.info("User information was entered successfully");
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	   
}
	
}	
	
