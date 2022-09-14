package testCases;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.PO_001_Login;


public class TC001_login extends DriverSetup {
	@Test
	public void login() throws InterruptedException {
		String baseUrl="https://www.daraz.com.bd/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		PO_001_Login lgObj= new PO_001_Login(driver);
		lgObj.clickLogin();
		
		Thread.sleep(2000);
		
		//putting id and password
		lgObj.typeEmail("mahruf.z44@gmail.com");
		lgObj.typePassword("10525abc");
		
		Thread.sleep(3000);
		
		//click login
		lgObj.clickLoginBtn();
		
		Thread.sleep(2000);
		
	}

}
