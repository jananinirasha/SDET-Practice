package SDET.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage  {
	
	// Account Page object identification
	@FindBy(xpath = "//button[@id=\'SubmitCreate\']/span")
	private WebElement btnCreateAccount;
	
	@FindBy (id="email_create")
	private WebElement txtMailAddress; 
	
	
	public AccountPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	//Insert Mail Address
	public String enterEmailAddress() {
		int random =(int)(Math.random()* 10000 + 2);
		String email = "test"+random+"@email.com";
		
		this.txtMailAddress.sendKeys(email);
		
		return email;
	}
	
	
	//Click Create Account Button
	
	public void clickCreateAccount() {
		this.btnCreateAccount.click();
		
	}
	
	
	
}
