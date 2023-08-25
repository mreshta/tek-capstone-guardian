package tek.sdet.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String categorty) {
		selectByVisibleText(pomFactory.retailOrderPage().search, categorty);
		logger.info("The user successfully clicked ");
	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String itemName) {
		sendText(pomFactory.retailOrderPage().searchInput, itemName);
		logger.info("User enterd the item for search successfully");
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(pomFactory.retailOrderPage().searchBttn);
		logger.info("User clicked on the Search button successfully");
	}

	@When("User click on item")
	public void userClickOnItem() {
		click(pomFactory.retailOrderPage().theItem);
		logger.info("User clicked on the Item successfully");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQTY) {
		selectByVisibleText(pomFactory.retailOrderPage().itemQty, itemQTY);
		logger.info("User selected the item quantity successfully");
	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(pomFactory.retailOrderPage().addToCartBttn);
		logger.info("User clicked on add to cart button successfully");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemsOnCart) {
		Assert.assertEquals(itemsOnCart, pomFactory.retailOrderPage().numberOfItemsOnCart.getText());
		logger.info("The number of the items in the cart is equal to the expected quantity successfully");

	}
// User Place Order

	@When("User change the category to {string} Apex Legends")
	public void userChangeTheCategoryToApexLegends(String electronics) {
		selectByVisibleText(pomFactory.retailOrderPage().searchElectronics, electronics);
		logger.info("User changed the category to Electronics Successfully");

	}

	@When("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String ApexLegend) {
		sendText(pomFactory.retailOrderPage().searchInputApex, ApexLegend);
		logger.info("User search for an item Apex Legend Successfully");
	}

	@When("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(pomFactory.retailOrderPage().apexSearch);
		logger.info("User clicked on Apex Legend item Successfully");
	}

	@When("User select quantity {string} Apex Legends")
	public void userSelectQuantityApexLegends(String apexQTY) {
		selectByVisibleText(pomFactory.retailOrderPage().qtySelectApex, apexQTY);
		logger.info("User selected quantity of Apex Legend");
	}

	@Then("the cart icon quantity should change to {string} Apex Legends")
	public void theCartIconQuantityShouldChangeToApexLegends(String apexCartQTY) {
		Assert.assertEquals(pomFactory.retailOrderPage().cartQTYApex.getText(), apexCartQTY);
		logger.info("The cart cart quantity chanded Successfully");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(pomFactory.retailOrderPage().cartBttnApex);
		logger.info("User click on Cart option");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(pomFactory.retailOrderPage().proceedBttn);
		logger.info("User clicked on proceed to checkout Successfully");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(pomFactory.retailOrderPage().placeOrderBttn);
		logger.info("User click on place your order Successfully");

	}

	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String mssgDisplayed) {
		waitTillPresence(pomFactory.retailOrderPage().orderPlacedMssg);
		Assert.assertEquals(mssgDisplayed, pomFactory.retailOrderPage().orderPlacedMssg.getText());
		logger.info("The message was displayed Successfully");
		
	}

//	Cancel Order Message

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(pomFactory.retailOrderPage().ordersBttn);
		logger.info("User click on orders successfully");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(pomFactory.retailOrderPage().firstOrder);
		logger.info("User clicked on the first Order successfully");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(pomFactory.retailOrderPage().cancelBttn);
		logger.info("User click on cancel order button successfully");

	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(pomFactory.retailOrderPage().cancelReason, reason);
		logger.info("User selected the cancelation reason successfully");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(pomFactory.retailOrderPage().orderSbmtBttn);
		logger.info("User clicked on cancel order button successfully");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String mssgDisplayed) {
	 if (mssgDisplayed.contains("Your Order Has Been Cancelled")) {
		 waitTillPresence(pomFactory.retailOrderPage().cancelMssg);
		Assert.assertEquals(pomFactory.retailOrderPage().cancelMssg.getText(), mssgDisplayed);
		logger.info("a cancelation message was displayed successfully");
	} else if (mssgDisplayed.contains("Return was successful")) {
		waitTillPresence(pomFactory.retailOrderPage().returnSuccessMssg);
		Assert.assertEquals(pomFactory.retailOrderPage().returnSuccessMssg.getText(), mssgDisplayed);
		logger.info("The return message was displayed successfully");
		}
	}

//	return Order steps

	@When("User click on Orders section on page")
	public void userClickOnOrdersSectionOnPage() {
		click(pomFactory.retailOrderPage().ordersBttnReturn);
		logger.info("User click on orders section successfully");
	}

	@When("User click on first order in list on page")
	public void userClickOnFirstOrderInListOnPage() {
		click(pomFactory.retailOrderPage().firstOrderReturn);
		logger.info("User click on first order successfully");
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(pomFactory.retailOrderPage().returnOrderBttn);
		logger.info("User clicked on return order button successfully");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(pomFactory.retailOrderPage().rReasonInput, reason);
		logger.info("User select the return reason successfully");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String serviceName) {
		selectByVisibleText(pomFactory.retailOrderPage().dropOffService, serviceName);
		logger.info("User select the drop off service reason successfully");
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(pomFactory.retailOrderPage().orderReturnSbmtBttn);
		logger.info("User click on return order button successfully");
	}

//	user adds a review 
	
	@When("User click on Orders section on home")
	public void userClickOnOrdersSectionOnHome() {
	click(pomFactory.retailOrderPage().ordersReview);
	logger.info("user clicked on the orders section successfully");
		
	}
	@When("User click on first order in list on first page")
	public void userClickOnFirstOrderInListOnFirstPage() {
	click(pomFactory.retailOrderPage().firstOrderReview);
	logger.info("user clicked on first order in the list successfully");
		
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	click(pomFactory.retailOrderPage().reviewBttn);
	logger.info("user clicked on review button successfully");
	}
	
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String description) {
	sendText(pomFactory.retailOrderPage().headLineInput, headline);
	sendText(pomFactory.retailOrderPage().descriptionInput, description);
	logger.info("User wrote a headline and description for the order successfully");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	click(pomFactory.retailOrderPage().reviewSubmitBttn);
	logger.info("user clicked on the review button successfully");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewSbmtMssg) {
	waitTillPresence(pomFactory.retailOrderPage().reviewSubmitMssg);
	Assert.assertEquals(pomFactory.retailOrderPage().reviewSubmitMssg.getText(),reviewSbmtMssg);  
	logger.info("The review message was displayed successfully");
	
	}
	
	
}
