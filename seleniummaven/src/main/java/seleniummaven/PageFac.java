package seleniummaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFac {
	WebDriver driver=null;
	
	public PageFac(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "") WebElement  searchButton;
	
	public void search(String sr) {
		//searchButton.sendKeys(sr);
		System.out.println("inside page Factory method");
	}
	
	

}
