package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_002_Search {
WebDriver driver=null;
	
	public PO_002_Search(WebDriver driver) 
	{
		this.driver=driver;
	}
	By searchElm=By.xpath("//*[@id=\"q\"]");
	By searchBtn=By.xpath("//*[@id=\"topActionHeader\"]/div/div[2]/div/div[2]/form/div/div[2]/button");
	By scrollElm=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div[2]");
	By desiredProductElm=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div[2]/div[10]/div/div/div[2]/div[2]");

	
	public void typeSearch(String valueSearch) 
	{
		driver.findElement(searchElm).sendKeys(valueSearch);
	}
	public void clickSearchBtn() 
	{
		driver.findElement(searchBtn).click();
	}
	public void ScrollUntilProductFound() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement e1=driver.findElement(scrollElm);
		js.executeScript("arguments[0].scrollIntoView();",e1);
	}
	
	public void clickDesiredProduct() 
	{
		driver.findElement(desiredProductElm).click();
	}

}
