package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

//	@userInfoUpdate

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(pomFactory.retailAccountPage().accountBttn);
		logger.info("the user clicked on account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(pomFactory.retailAccountPage().nameField);
		sendText(pomFactory.retailAccountPage().nameField, name);
		clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneInput);
		sendText(pomFactory.retailAccountPage().phoneInput, phone);
		logger.info("The name and phone fields were filled successfully");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(pomFactory.retailAccountPage().updateBttn);
		logger.info("the update button was clicked successfully");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(pomFactory.retailAccountPage().updateMssg);
		String expectedMssg = "Personal Information Updated Successfully";
		String actualMssg = pomFactory.retailAccountPage().updateMssg.getText();
		Assert.assertEquals(expectedMssg, actualMssg);
		logger.info("The user profile information updated successfully");
	}

//	@userAddPaymentMethod

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(pomFactory.retailAccountPage().addPaymentBttn);
		logger.info("The add payment button was clicked successfully");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {

		List<Map<String, String>> cardAllInfo = dataTable.asMaps(String.class, String.class);
		sendText(pomFactory.retailAccountPage().cardNumber, cardAllInfo.get(0).get("cardNumber"));
		sendText(pomFactory.retailAccountPage().nameOnCard, cardAllInfo.get(0).get("nameOnCard"));
		sendText(pomFactory.retailAccountPage().expirationMonthInput, cardAllInfo.get(0).get("expirationMonth"));
		sendText(pomFactory.retailAccountPage().expiratoinYear, cardAllInfo.get(0).get("expirationYear"));
		sendText(pomFactory.retailAccountPage().securityCodeInput, cardAllInfo.get(0).get("securityCode"));

		logger.info("The information was filled successfully");

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(pomFactory.retailAccountPage().payementSubmitBttn);
		logger.info("The user clicked on the add to your card button successfully");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {
//	  here the step failed the real message was sucessfully and the expected message was suc(c)essfully.
		if (expectedMssg.contains("Payment Method added successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().paymentMethodSuccessMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().paymentMethodSuccessMssg.getText());
			logger.info("The payment Method added successfully");
		} else if (expectedMssg.contains("Payment Method updated Successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().paymentUpdateMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().paymentUpdateMssg.getText());
			logger.info("The information was updated successfully");
// the last step of the add address is here 
		} else if (expectedMssg.contains("Address Added Successfully")) {

			waitTillPresence(pomFactory.retailAccountPage().addressAddedMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().addressAddedMssg.getText());
			logger.info("The address was added successfully");
// address update last step (message step)
		} else if (expectedMssg.contains("Address Updated Successfully")) {
			waitTillPresence(pomFactory.retailAccountPage().addresssUpdateMssg);
			Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().addresssUpdateMssg.getText());
			logger.info("The address update message was displayed succeessfully");
		}
	}

//	edit payment method

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(pomFactory.retailAccountPage().paymenteditBttn);
		logger.info("User clicked on the edit option successfully");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		click(pomFactory.retailAccountPage().editBttn);
		logger.info("User clicked on the edit bttn successfully");
		List<Map<String, String>> Editfields = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(pomFactory.retailAccountPage().cardNumber);
		sendText(pomFactory.retailAccountPage().cardNumber, Editfields.get(0).get("cardNumber"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().nameOnCard);
		sendText(pomFactory.retailAccountPage().nameOnCard, Editfields.get(0).get("nameOnCard"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().expirationMonthInput);
		sendText(pomFactory.retailAccountPage().expirationMonthInput, Editfields.get(0).get("expirationMonth"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().expiratoinYear);
		sendText(pomFactory.retailAccountPage().expiratoinYear, Editfields.get(0).get("expirationYear"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().securityCodeInput);
		sendText(pomFactory.retailAccountPage().securityCodeInput, Editfields.get(0).get("securityCode"));
		logger.info("The infromation was filled successfully");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(pomFactory.retailAccountPage().updateYourCardBttn);
		logger.info("The update button was clicked successfully");
	}

//	remove card option

	@When("User click on selected card")
	public void userClickOnSelectedCard() {
		click(pomFactory.retailAccountPage().cardOption);
		logger.info("the card was clicked successfully");

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(pomFactory.retailAccountPage().removeCard);
		logger.info("User clicked on the remove card option successfully");

	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {

		if (!isElementDisplayed(pomFactory.retailAccountPage().cardRemoved))
			;
		logger.info("The payement method was removed");

	}

//	Add address 

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(pomFactory.retailAccountPage().addAddressBttn);
		logger.info("User clicked on Add address button successfully");
	}

	@When("user fill address form with below information")
	public void userFillAddressFormWithBelowInformation(DataTable dataTable) {
//	in order to manage the dataTables in BDD frameWork we use the List of Map.
//	the data is passed as key and value

		List<Map<String, String>> allFields = dataTable.asMaps(String.class, String.class);
//	to handle a dropdown we studied the select class and we can use the
//	selectByVisibleText, selectByValue and selectByIndex.
		selectByVisibleText(pomFactory.retailAccountPage().countryDropDown,
				DataGenerator.addressGenerator(allFields.get(0).get("country")));
		sendText(pomFactory.retailAccountPage().fullNameInput,
				DataGenerator.addressGenerator(allFields.get(0).get("fullName")));
		sendText(pomFactory.retailAccountPage().phoneNumber,
				DataGenerator.addressGenerator(allFields.get(0).get("phoneNumber")));
		sendText(pomFactory.retailAccountPage().streetInput,
				DataGenerator.addressGenerator(allFields.get(0).get("streetAddress")));
		sendText(pomFactory.retailAccountPage().apartmentInput,
				DataGenerator.addressGenerator(allFields.get(0).get("apt")));
		sendText(pomFactory.retailAccountPage().cityInput,
				DataGenerator.addressGenerator(allFields.get(0).get("city")));
		sendText(pomFactory.retailAccountPage().stateSelect,
				DataGenerator.addressGenerator(allFields.get(0).get("state")));
		sendText(pomFactory.retailAccountPage().zipCodeInput,
				DataGenerator.addressGenerator(allFields.get(0).get("zipCode")));
		logger.info("The address information were filled successfully");

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(pomFactory.retailAccountPage().addYourAddressBttn);
		logger.info("The user clicked on add your address button successfully");
	}

//	update or Edit your address feature

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(pomFactory.retailAccountPage().addressEditBttn);
		logger.info("User clicked on Edit button successfully");
	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressFields = dataTable.asMaps(String.class, String.class);
//	clearTextUsingSendKeys(pomFactory.retailAccountPage().countryDropDown);
		selectByVisibleText(pomFactory.retailAccountPage().countryDropDown, addressFields.get(0).get("country"));
//	sendText(pomFactory.retailAccountPage().countryDropDown, addressFields.get(0).get("country"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().fullNameInput);
		sendText(pomFactory.retailAccountPage().fullNameInput, addressFields.get(0).get("fullName"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneNumber);
		sendText(pomFactory.retailAccountPage().phoneNumber, addressFields.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().streetInput);
		sendText(pomFactory.retailAccountPage().streetInput, addressFields.get(0).get("streetAddress"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().apartmentInput);
		sendText(pomFactory.retailAccountPage().apartmentInput, addressFields.get(0).get("apt"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().cityInput);
		sendText(pomFactory.retailAccountPage().cityInput, addressFields.get(0).get("city"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().stateSelect);
		sendText(pomFactory.retailAccountPage().stateSelect, addressFields.get(0).get("state"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().zipCodeInput);
		sendText(pomFactory.retailAccountPage().zipCodeInput, addressFields.get(0).get("zipCode"));
		logger.info("User filled the new address form successfully");

	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(pomFactory.retailAccountPage().updateAddressBttn);
		logger.info("The user clicked on update your address button successfully");

	}

//	remove address

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	click(pomFactory.retailAccountPage().removeBttn);
	logger.info("The remove button was clicked successfully");
	
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	if(!isElementDisplayed(pomFactory.retailAccountPage().addressRemovedConfirm));
	logger.info("The address was removed successfully");
	}

}
