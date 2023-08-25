package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps  extends CommonUtility{

	POMFactory pomFactory=new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	click(pomFactory.retailHomePage().hambugerBttn);
	logger.info("The user clicked on Humberger button successfully");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	
		List<List<String>> allSideOptions=dataTable.asLists(String.class);
		for(int i=0; i<allSideOptions.size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[@class='sidebar__content']//span[text()='"
				+allSideOptions.get(0).get(i)+"']"))));
				
		
			
		
		
		
		
		
		
//		List<List<String>>departmentsSBar=dataTable.asLists(String.class);
//		for(int i=0; i<departmentsSBar.get(0).size(); i++) {
//			Assert.assertTrue(isElementDisplayed(
//			getDriver().findElement(By.xpath("//div[@class='sidebar__content']//span[text()='"+departmentsSBar.get(0).get(i)+"']"))));
//		logger.info("Option "+departmentsSBar.get(0)+" is displayed");	
		}
		
		
	}
	@When("User on {string}")
	public void userOn(String departments) {
	List<WebElement>allSideBarDepartments=pomFactory.retailHomePage().allOptions;
	for (int i = 0; i < allSideBarDepartments.size(); i++) {
		if(allSideBarDepartments.get(i).getText().equalsIgnoreCase(departments)) {
			allSideBarDepartments.get(i).click();
			break;
		}
	}
	
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	List<List<String>>departmentOptions=dataTable.asLists(String.class);
	List<WebElement>options=pomFactory.retailHomePage().sideBarOptions;
		
	for(int i=0; i<departmentOptions.get(0).size(); i++) {
		for(WebElement elments: options) {
			if(elments.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
				
				Assert.assertTrue(elments.isDisplayed());
				logger.info("The option "+elments.getText()+" is present");
			}
			
		}
	}

}    
}