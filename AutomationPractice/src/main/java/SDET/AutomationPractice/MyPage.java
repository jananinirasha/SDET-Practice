package SDET.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyPage extends BasePage {
	
	// Detail Page object identification
	@FindBy(xpath = "//div[@id='center_column']/p")
	private WebElement eleWelcome;
	
	@FindBy(xpath="//a[@class= 'logout']")
	private WebElement btnSignOut;
	
	public MyPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	// text verification
	
	public void verifyWelcome(String welacome) {
		
		String text = new String();
		text = this.eleWelcome.getText();
		if(text.equalsIgnoreCase(welacome)) {
			System.out.println("Welcome page Verification Pass");
			Assert.assertEquals(text, welacome);
		}else {
			System.out.println("Welcome page Verification Fail");
		}
		
		
		
		
	}
	
	
	//Sign out
	public void signOut() {
		this.btnSignOut.click();
	}

}
