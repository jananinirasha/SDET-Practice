package SDET.AutomationPractice;

import org.testng.annotations.Test;



public class MainTest extends BaseTest{
	

	@Test (dataProvider = "Sheet1", dataProviderClass = TestData.class)
	
	
	public void createAccount(String testCaseName,String title,String firstName,String lastName, String passWd,String dob,String newsLetter,String offers,
			String company,String address1,String address2,String city,String state,String zip,String country,String addInfo,String phone,String mobile,
			String alias) {
		
	
		//Open URL
		driver.get("http://automationpractice.com/index.php");
		// Maximize browser		 
		driver.manage().window().maximize();
		
		//Click on Login Button
		login.clickLogin();
		
		//Enter email address and click Create button
		String mail = account.enterEmailAddress();
		account.clickCreateAccount();
		
		//Verify email in next page
		detail.verifyMailAddress(mail);
		
		//Register User
		detail.fillPersonalInfo(title, firstName, lastName, passWd, dob, newsLetter, offers);
		detail.fillAddressInfor(firstName, lastName, company, address1, address2, city, state, zip, country, addInfo, phone, mobile, alias);
		detail.doRegistration();
		
		// Welcome Page Verification
		myPage.verifyWelcome("Welcome to your account. Here you can manage all of your personal information and orders.");
		myPage.signOut();
			
		
	}
	
	

	

}
