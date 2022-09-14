package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_003_OrderPlace {
WebDriver driver=null;
	
	public PO_003_OrderPlace(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By scrollToClickSizeElm=By.xpath("//*[@id=\"module_promotion_tags\"]/div/div/div/div/div");
	By clickSizeElm=By.xpath("//*[@id=\"module_sku-select\"]/div/div/div[2]/div/div/div[2]/span[5]/span[1]");
	By buyNowBtn=By.xpath("//*[@id=\"module_add_to_cart\"]/div/button[1]");
	By scrollToPlaceOrderElm=By.xpath("//*[@id=\"textEdit_11002\"]/div/div/div");
	By placeOrderBtn=By.xpath("//*[@id=\"rightContainer_10010\"]/div[6]/div[2]/div/div[3]/button");

	public void scrollToSeeSize() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement e2=driver.findElement(scrollToClickSizeElm);
		js.executeScript("arguments[0].scrollIntoView();",e2);
		
	}
	
	public void chooseAndClickSize() {
		driver.findElement(clickSizeElm).click();
	    
	}
	public void clickBuyNow() {
		driver.findElement(buyNowBtn).click();
		
	}
	
	public void scrollToPlaceOrder() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement e3=driver.findElement(scrollToPlaceOrderElm);
		js.executeScript("arguments[0].scrollIntoView();",e3);
		
	}
	
	public void clickPlaceOrder() {
		driver.findElement(placeOrderBtn).click();
	    
	}
	
	

}
