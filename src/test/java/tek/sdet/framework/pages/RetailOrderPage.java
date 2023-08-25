package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		
	
	PageFactory.initElements(getDriver(), this);

	}
	
//	@FindBy(linkText="TEKSCHOOL")
//	public WebElement tekSlogo;
//	
//	@FindBy(linkText="Sign in")
//	public WebElement signIn;
//	
//	@FindBy(id="email")
//	public WebElement email;
//	
//	@FindBy(id="password")
//	public WebElement password;
//	
//	@FindBy(xpath="//button[text()='Login']")
//	public WebElement loginBttn;
//	
//	@FindBy(xpath="//button[text()='Log out']")
//	public WebElement logOutBttn;
	
	@FindBy(xpath="//select[@id='search']")
	public WebElement search;
	
	@FindBy(id="searchInput")
	public WebElement searchInput;
	
	@FindBy(id="searchBtn")
	public WebElement searchBttn;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement theItem;
	
	@FindBy(xpath="//select[starts-with(@class,'product')]")
	public WebElement itemQty;
	
	@FindBy(id="addToCartBtn")
	public WebElement addToCartBttn;

	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement numberOfItemsOnCart;
	
	
	
//	Apex Legend order and checkout and place order
	
	@FindBy(id="search")
	public WebElement searchElectronics;
	
	@FindBy(id="searchInput")
	public WebElement searchInputApex;
	
	@FindBy(id="searchBtn")
	public WebElement searchBttnApex;
	
	@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexSearch;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement qtySelectApex;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartBttnApex;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQTYApex;
	
	@FindBy(id="cartBtn")
	public WebElement cartBttnApex;
	
	@FindBy(id="proceedBtn")
	public WebElement proceedBttn;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBttn;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMssg;
	
	
//	userCancelTheOrder
	
	@FindBy(linkText="Orders")
	public WebElement ordersBttn;
	
	@FindBy(xpath="(//p[text()='Show Details'])[1]")
	public WebElement firstOrder;
	
	@FindBy(id="cancelBtn")
	public WebElement cancelBttn;
	
	@FindBy(id="reasonInput")
	public WebElement cancelReason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement orderSbmtBttn;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelMssg;
	
	
//	userReturnTheOrder
	
	@FindBy(linkText="Orders")
	public WebElement ordersBttnReturn;
	
	@FindBy(xpath="(//p[text()='Show Details'])[1]")
	public WebElement firstOrderReturn;
	
	@FindBy(id="returnBtn")
	public WebElement returnOrderBttn;
	
	@FindBy(id="reasonInput")
	public WebElement rReasonInput;
	
	@FindBy(xpath="//div//div[@class='order__cancel-input-wrapper']//select[@id='dropOffInput']")
	public WebElement dropOffService;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement orderReturnSbmtBttn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnSuccessMssg;
	
	
//	userAdd review
	
	@FindBy(linkText="Orders")
	public WebElement ordersReview;
	
	@FindBy(xpath="(//p[text()='Show Details'])[1]")
	public WebElement firstOrderReview;
	
	@FindBy(xpath="//button[text()='Review']")
	public WebElement reviewBttn;
	
	@FindBy(id="headlineInput")
	public WebElement headLineInput;
	
	@FindBy(id="descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement reviewSubmitBttn;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewSubmitMssg;
	
	
	
	
	
	
	
}