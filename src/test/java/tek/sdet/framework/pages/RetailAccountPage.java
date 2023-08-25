package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
//	@userInfoUpdate
	
	@FindBy(linkText="Account")
	public WebElement accountBttn;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updateBttn;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement updateMssg;
	
	
//	@userAddPaymentMethod
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement addPaymentBttn;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement expiratoinYear;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement payementSubmitBttn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully'] ")
	public WebElement paymentMethodSuccessMssg;
	
	
//	user edit payment Information
	
	@FindBy(xpath="//div[@class='account__payment-sub']//p[text()='Master Card']")
	public WebElement paymenteditBttn;
	
	@FindBy(xpath="//button[@class='text-blue-800 cursor-pointer hover:underline' and text()='Edit']")
	public WebElement editBttn;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement updateYourCardBttn;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']  ")
	public WebElement paymentUpdateMssg;
	
//	remove Card
	
	@FindBy(xpath="//p[text()='American Express']")
	public WebElement cardOption;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement removeCard;
	
	@FindBy(xpath="//p[text()='American Express']")
	public WebElement cardRemoved;
	
	
//	user add address
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement addAddressBttn;
	
	@FindBy(id="countryDropdown")
	public WebElement countryDropDown;
	
	@FindBy(id="fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumber;
	
	@FindBy(id="streetInput")
	public WebElement streetInput;
	
	@FindBy(id="apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id="cityInput")
	public WebElement cityInput;
	
	@FindBy(name="state")
	public WebElement stateSelect;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(xpath="//button[text()='Add Your Address']")
	public WebElement addYourAddressBttn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressAddedMssg;
	
	
//	update address button is here and we have used the add addresses locators
//	so for the ones that already have locators 
//	we don't need a new locator
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement addressEditBttn;
	
	@FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddressBttn;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addresssUpdateMssg;
	
	
//	Remove the address
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeBttn;
	
	@FindBy(xpath="//div[@class='account__address-single'] ")
	public WebElement addressRemovedConfirm;
	
}
