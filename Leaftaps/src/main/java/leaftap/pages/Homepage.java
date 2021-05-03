package leaftap.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import leaftap.api.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods {
	
	

	public Homepage(ChromeDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public MyHomePage clickLogin() {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(prop.getProperty("home.login.linktext")).click();
		return new MyHomePage(driver);
	}

	
	
	}


	