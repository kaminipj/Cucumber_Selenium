package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;



public class MyAccountPage {
	
	WebDriver driver;
	By custName= By.className("header_user_info");
	By signOut=By.linkText("Sign out");
	
	public MyAccountPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void validateCustomerName() {
		String nameOnAccountPage= driver.findElement(custName).getText();
		Assert.assertEquals("qaz wsx", nameOnAccountPage);
		
	
		
		}
	
	public void clickSignOut() {
		driver.findElement(signOut).click();	
		}

}
