package leaftap.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import leaftap.util.ReadExcel;


public class ProjectSpecificMethods {

	public  ChromeDriver driver;
	public String fileName;
	public static Properties prop;
	
	@BeforeSuite
	
	public void loadobject() throws FileNotFoundException, IOException
	{
	    prop = new Properties();
		prop.load(new FileInputStream("./Objects/English.properties"));
		
		
	}
	


	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider
	
	public String[][] getData() throws IOException {
		return new ReadExcel().readExcel(fileName);
	
		
	
		
	
	}


}