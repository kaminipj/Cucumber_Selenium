package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Features/",
glue= {"SeleniumGlueCode"},
plugin = {"pretty", "html:target/cucumber-reports"},
monochrome =true

)
public class testRunner {
	
	   
	    
}
