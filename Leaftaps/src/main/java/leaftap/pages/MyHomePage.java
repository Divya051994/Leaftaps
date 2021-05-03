package leaftap.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import leaftap.api.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage(ChromeDriver driver) {
		
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public MyLead clickLead()

	{
		driver.findElementByLinkText(prop.getProperty("Myhome.lead.linktext")).click();
		return new MyLead(driver);

	}
}