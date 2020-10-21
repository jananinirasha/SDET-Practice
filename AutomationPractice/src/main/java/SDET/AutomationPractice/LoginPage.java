package SDET.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	public LoginPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	
		
	// Login Page object identification
	
	//@FindBy(linkText="http://automationpractice.com/index.php?controller=my-account")
	//@FindBy(xpath="//a[@class= 'login']")
	@FindBy(xpath="//header[@id='header']/div[2]/div/div/nav/div[1]/a")
	private WebElement btnSignIn;
	
	
	

	//Click Log-in
	public void clickLogin() {
		this.btnSignIn.click();
		
		
	}
	
	
	

}
