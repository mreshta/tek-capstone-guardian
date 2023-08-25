package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private HomePage homePage;
	private LoginPage loginPage;
	private RetailHomePage retailHomePage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	
	public POMFactory() {

		this.homePage = new HomePage();
		this.loginPage = new LoginPage();
		this.retailHomePage = new RetailHomePage();
		this.retailAccountPage=new RetailAccountPage();
		this.retailOrderPage=new RetailOrderPage();
	}

	public HomePage homePage() {
		return this.homePage;
	}

	public LoginPage loginPage() {
		return this.loginPage;
	}

	public RetailHomePage retailHomePage() {

		return this.retailHomePage;
	}
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
	
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
}
