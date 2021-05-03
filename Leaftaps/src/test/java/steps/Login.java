package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	ChromeDriver driver ;
	
	@Given("open the chrome browes")
	public void open_the_chrome_browes() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	  
	}

	@Given("load the application url")
	public void load_the_application_url() {
		
		
		driver.get("http://leaftaps.com/opentaps/");

	    
	}

	@Given("Maximize the browser")
	public void maximize_the_browser() {
		driver.manage().window().maximize();
	    
	}

	@Given("apply wait")
	public void apply_wait() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@Given("^enter the username as (.*)$")
	public void enter_the_username_as_demosalesmanager(String data) {
		driver.findElementById("username").sendKeys(data);
	   
	}

	@Given("^enter the password as (.*)$")
	public void enter_the_password_as_crmsfa(String data) {
		driver.findElementById("password").sendKeys(data);
	
	}

	@When("clcik login button")
	public void clcik_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	 
	}

	@Then("display home page")
	public void display_home_page() {
		
		System.out.println("Home page");
	 
	}
	
	@But("Display error message")
	public void display_error_message() {
	System.out.println("display error");


}
}
