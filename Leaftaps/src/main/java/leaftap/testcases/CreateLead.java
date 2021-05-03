package leaftap.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import leaftap.api.ProjectSpecificMethods;
import leaftap.pages.Homepage;
import leaftap.pages.LoginPage;
import leaftap.pages.ViewLead;


public class CreateLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	
	public void setData() {
		
		String  fileName = "TC_Create Lead";
		
	}

	
	@Test (dataProvider="getData")
	public void runCreateLead(String cname ,String fname , String lname) {
		System.out.println(fileName);
		
		System.out.println(cname);
		
	 new LoginPage(driver).enterUsername().enterPassword().clickSubmit().clickLogin().clickLead().clickCreateLead().enterCompanyName(cname).enterFirstName(fname).enterLastName(lname).clickSubmit();
	
	}
}



