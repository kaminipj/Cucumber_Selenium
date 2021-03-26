package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By signIn=By.linkText("Sign in");
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}

}
