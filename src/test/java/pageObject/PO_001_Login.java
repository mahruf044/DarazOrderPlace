package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001_Login {
WebDriver driver=null;
	
	public PO_001_Login(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By loginElm=By.xpath("//*[@id=\"anonLogin\"]/a");
	By emailElm=By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
	By passwordElm=By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
	By loginBtn=By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button");

	public void clickLogin() 
	{
		driver.findElement(loginElm).click();
	}
	
	public void typeEmail(String valueEmail) 
	{
		driver.findElement(emailElm).sendKeys(valueEmail);
	}
	
	public void typePassword(String valuePass) 
	{
		driver.findElement(passwordElm).sendKeys(valuePass);
	}
	public void clickLoginBtn() 
	{
		driver.findElement(loginBtn).click();
	}
	

	

}
