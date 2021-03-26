package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
	WebDriver driver;
	By email=By.name("email_create");
	By createAccount=By.id("SubmitCreate");
	By registeredEmail =By.id("email")  ;    //).sendKeys("blog.cucumber@gmail.com");
    By password =By.id("passwd");//).sendKeys("Cucumber@blog");B
    By signIn=By.id("SubmitLogin");//).click();
	
	public AuthenticationPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void populateEmail(String emailId) {
		driver.findElement(email).sendKeys(emailId);
	}
	
	public void clickCreateAccount() {
		driver.findElement(createAccount).click();
	}
	public void registeredEmail(String email) {
		driver.findElement(registeredEmail).sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	public void clickSignIn() {
		driver.findElement(signIn).click();
		}
	
	public void signInExistingUser(String email, String pwd) {
		this.registeredEmail(email);
		this.enterPassword(pwd);
		this.clickSignIn();
		
		
	}
	
	public void createNewAccount(String emailId) {
		this.populateEmail(emailId);
		this.clickCreateAccount();
		
	}

}
