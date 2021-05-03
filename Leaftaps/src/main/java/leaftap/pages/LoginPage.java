package leaftap.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import leaftap.api.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(ChromeDriver driver) {
		
		this.driver = driver ;
		// TODO Auto-generated constructor stub
	}

	public LoginPage enterUsername()

	{
		driver.findElementById(prop.getProperty("login.uname.id")).sendKeys("Democsr");
		return this;

	}

	public LoginPage enterPassword()

	{
		driver.findElementById(prop.getProperty("login.pwd.id")).sendKeys("crmsfa");
		return this;

	}

	public Homepage clickSubmit()

	{
		driver.findElementByClassName(prop.getProperty("login.submit.class")).click();
		return new Homepage(driver);

	}

}