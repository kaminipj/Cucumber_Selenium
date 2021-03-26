package SeleniumGlueCode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;
import pages.AuthenticationPage;
import pages.MyAccountPage;


public class Test {
	
	
	public static WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
	AuthenticationPage authPage;
	MyAccountPage myAcctPage;
	
	

	@Given("user is  on homepage")
	public void user_is_on_homepage() throws Throwable {
		//Pease update the location of chrome driver as per your location
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\k.pj\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
	}

	@When("user navigates to Login Page")
	public void user_navigates_to_login_page()throws Throwable {
		loginPage=new LoginPage(driver);
		loginPage.clickSignIn();
        
	}
	@When("new user clicks on create account")
	public void new_user_clicks_on_create_account() throws Throwable{
		authPage=new AuthenticationPage(driver);
		authPage.createNewAccount("3453@rfavdfdol.com");
	}

	@When("a new user registers")
	public void a_new_user_registers() throws Throwable {
		registerPage= new RegisterPage(driver);
		registerPage.registerApp("qaz", "wsx",  "gogog@1234", "street1", "city1", "state1", "30000", "United States", "12345678", "alias1");
		
	   
	}
	@Then("user signs out successfully")
	public void user_signs_out_successfully() throws Throwable  {
		myAcctPage = new MyAccountPage(driver);
		myAcctPage.clickSignOut();
	    
	}
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() throws Throwable  {
		authPage=new AuthenticationPage(driver);
		authPage.signInExistingUser("3453@rfvzqwzw.com","gogog@1234");
	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() throws Throwable  {
		
		myAcctPage = new MyAccountPage(driver);
		myAcctPage.validateCustomerName();
		
	}

	@When("user enters username and Password")
	public void user_enters_username_and_password()throws Throwable {
    	driver.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() throws Throwable {
    	String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
    	String actual = driver.findElement(By.cssSelector(".info-account")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.quit();  
	}
	   
	

}
