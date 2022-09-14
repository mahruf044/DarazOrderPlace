package testCases;



import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.PO_003_OrderPlace;


public class TC003_OrderPlace extends DriverSetup{
	@Test
	public void orderPlace() throws InterruptedException{
	PO_003_OrderPlace odObj= new PO_003_OrderPlace(driver);
	        
	
	
	        //scroll for selecting size
	
			odObj.scrollToSeeSize();
			Thread.sleep(3000);
			
			// click the desired size
			
			odObj.chooseAndClickSize();
			Thread.sleep(3000);
			
			//click the buy now button
			
			odObj.clickBuyNow();
			Thread.sleep(3000);
			
            //scroll to place order
			odObj.scrollToPlaceOrder();
			Thread.sleep(6000);
			
			
			//click place order
			odObj.clickPlaceOrder();
			Thread.sleep(6000);
			

           }
}
