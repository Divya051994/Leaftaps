package leaftap.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import leaftap.api.ProjectSpecificMethods;

public class MyLead extends ProjectSpecificMethods {

	public MyLead(ChromeDriver driver) {
		
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public MyLead clickCreateLead( )

	{
		driver.findElementByLinkText(prop.getProperty("Mylead.clicklead.linktext")).click();
		return this;
		
	}
	
	public MyLead enterCompanyName(String data)
	{
		driver.findElementById(prop.getProperty("Mylead.cname.id")).sendKeys(data);
		return this ;
	}
		
	public MyLead enterFirstName(String data)
	{
		driver.findElementById(prop.getProperty("Mylead.fname.id")).sendKeys(data);
		return this ;
	}
	
	public MyLead enterLastName(String data)
	{
		driver.findElementById(prop.getProperty("Mylead.lname.id")).sendKeys(data);
		return this ;
	}
	
	public ViewLead clickSubmit()
	{
		driver.findElementByName(prop.getProperty("Mylead.clciksubmit.Name")).click();
		return new ViewLead(driver);
	}
		
		
		
		
		

	}
	
