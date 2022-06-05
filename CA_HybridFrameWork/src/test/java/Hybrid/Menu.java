package Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {

	WebDriver driver;
	public Menu(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div[@id='main-menu']") WebElement loginoo ;
	@FindBy(xpath="//a[@class='nb__3Tx_U nb__2jlgw']")WebElement click_paint;
	
 
	
	public void signtobrokerr() throws InterruptedException
	{
		loginoo.click();
		click_paint.click();
		driver.navigate().back();
		
		
		
		
				
			}
}
