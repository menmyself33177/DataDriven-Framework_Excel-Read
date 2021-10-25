package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
	WebDriver driver;

	// Need to create a Constructor to call "driver" from "LoginTest" page
	// (LoginTest Class)
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]")
	WebElement DASHBOARD_HEADER_FIELD;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMERS_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMERS_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMERS_FIELD;

	public void verifyDashboardPage() {
		Assert.assertEquals("Wrong Page !!!", "Dashboard", DASHBOARD_HEADER_FIELD.getText());
		
	}

	public void clickCustomersButton() {
		CUSTOMERS_FIELD.click();
	}
	public void clickAddCustomersButton() {
		ADD_CUSTOMERS_FIELD.click();
	}
	public void clickListCustomersButton() {
		LIST_CUSTOMERS_FIELD.click();
	}
	
	
}
