package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage {
	WebDriver driver;
	By titleMr=By.id("id_gender1");
	By titleMrs= By.id("uniform-id_gender2");
	By firstName =By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By email =By.id("email");
	By password=By.id("passwd");
	By date=By.id("days");
	By month =By.id("months");
	By year =By.id("years");
	By company =By.id("company");
	By address1= By.name("address1");
	By city =By.name("city");
	By state =By.name("id_state");
	By postCode =By.name("postcode");
	By country =By.name("id_country");
	By mobile= By.name("phone_mobile");
	By alias=By.name("alias");
	By registerButton =By.name("submitAccount");
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void setTitle() {
		driver.findElement(titleMr).click();
	}
	public void firstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void lastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
		}
	
	public void email(String emailId) {
		driver.findElement(email).sendKeys(emailId);
		
	}
	public void password(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void address(String address) {
		driver.findElement(address1).sendKeys(address);
		
	}
	public void city(String cityName) {
		driver.findElement(city).sendKeys(cityName);
		
	}
	public void state(String stateName) {
		driver.findElement(state).sendKeys(stateName);
		
	}
	public void postCode(String postal) {
		driver.findElement(postCode).sendKeys(postal);
		
	}
	public void country(String countryName) {
		driver.findElement(country).sendKeys(countryName);
		
	}
	public void phone(String mobileNum) {
		driver.findElement(mobile).sendKeys(mobileNum);
		
	}
	
	public void alias(String aliasAddress) {
		driver.findElement(alias).sendKeys(aliasAddress);
		
	}
	
	public void clickRegister() {
		driver.findElement(registerButton).click();
	}
	
	public void registerApp(String firstName, String lastName, String pwd, String address, String cityName, String stateName, String postal, String countryName, String mobileNum, String aliasAddress) {
		this.firstName(firstName);
		this.lastName(lastName);
		this.password(pwd);
		this.address(address);
		this.city(cityName);
		this.state(stateName);
		this.postCode(postal);
		this.country(countryName);
		this.phone(mobileNum);
		this.alias(aliasAddress);
		this.clickRegister();
		 	
	}
	

}
