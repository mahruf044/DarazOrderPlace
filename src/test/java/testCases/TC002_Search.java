package testCases;

import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.PO_002_Search;


public class TC002_Search extends DriverSetup{
	@Test
	public void search() throws InterruptedException {
		PO_002_Search scObj= new PO_002_Search(driver);
		
		//search
		
		scObj.typeSearch("slim belt");
		
		Thread.sleep(5000);
		
		//search click
		scObj.clickSearchBtn();
		Thread.sleep(5000);
		
		//scroll to find product
		scObj.ScrollUntilProductFound();		
		Thread.sleep(5000);
		
		//Click the desired Product
		scObj.clickDesiredProduct();
		Thread.sleep(5000);
		
		
	}


}
