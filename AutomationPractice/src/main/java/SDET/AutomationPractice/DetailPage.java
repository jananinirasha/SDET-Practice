package SDET.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DetailPage extends BasePage {
	
	// Detail Page object identification
	@FindBy(id = "id_gender1")
	private WebElement btnMr;
	
	@FindBy (id="id_gender2")
	private WebElement btnMrs; 
	
	@FindBy(id = "customer_firstname")
	private WebElement txtFirstName;
	
	@FindBy (id="customer_lastname")
	private WebElement txtLastName;
	
	@FindBy(id = "passwd")
	private WebElement txtPassWd;
	
	@FindBy (id="days")
	private WebElement drpDays; 
	
	@FindBy (id="months")
	private WebElement drpMonths; 
	
	@FindBy (id="years")
	private WebElement drpYears; 
	
	@FindBy (id="firstname")
	private WebElement txtAddFirstName; 
	
	@FindBy(id = "lastname")
	private WebElement txtAddLastName;
	
	@FindBy (id="company")
	private WebElement txtCompany;
	
	@FindBy(id = "address1")
	private WebElement txtAddress1;
	
	
	@FindBy (id="address2")
	private WebElement txtAddress2; 
	
	@FindBy (id="city")
	private WebElement txtCity; 
	
	@FindBy(id = "id_state")
	private WebElement drpUniformState;
	
	@FindBy (id="postcode")
	private WebElement txtZipCode;
	
	@FindBy(id = "id_country")
	private WebElement drpCountry;
	
	@FindBy (id="other")
	private WebElement txtOther; 
	
	@FindBy(id = "phone")
	private WebElement txtPhone;
	
	@FindBy (id="phone_mobile")
	private WebElement txtMobile;
	
	@FindBy(id = "alias")
	private WebElement txtAlias;
	
	@FindBy(xpath="//button[@id='submitAccount']/span")
	private WebElement btnRegister;
	
	@FindBy (id="optin")
	private WebElement btnOptin;
	
	@FindBy(id = "newsletter")
	private WebElement btnNewsletter;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement txtEmail;
	
	
	
	public DetailPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	//Verify Mail Address
	public void verifyMailAddress(String mailAddress) {
		/*
		 * String mailValue = txtEmail.getAttribute("value");
		 * System.out.println(mailValue); WebDriverWait wait = new WebDriverWait(driver,
		 * 15);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		 */
		
		if(txtEmail.getAttribute("value").equalsIgnoreCase(mailAddress)) {
			System.out.println("Mail Address Verification Pass");
			Assert.assertEquals(txtEmail.getAttribute("value"), mailAddress);
		}else {
			System.out.println("Mail Address Verification Fail");
		}
		
		
		
	}
	
	//Fill Personal Information
	public void fillPersonalInfo(String title, String firstName, String lastName, String passWd,
			String birthDay, String newsLetter, String option) {
		
	 //Click Titile		
		if(title.equalsIgnoreCase("Mr")) {
			this.btnMr.click();
		}else if(title.equalsIgnoreCase("Mrs")){
			this.btnMrs.click();
		}
		
	// Set First Name
		this.txtFirstName.clear();
		this.txtFirstName.sendKeys(firstName);
		
	// Set Last Name
		this.txtLastName.clear();
		this.txtLastName.sendKeys(lastName);
		
	// Set PassWord
		this.txtPassWd.clear();
		this.txtPassWd.sendKeys(passWd);
		
	// Set Birthday
		String Array[]=birthDay.split("/");
		
		Select days = new Select(drpDays);
		days.selectByValue(Array[0]);
		
		Select month = new Select(drpMonths);
		month.selectByValue(Array[1]);
		
		Select year = new Select(drpYears);
		year.selectByValue(Array[2]);
		
	// Set Sign-ups
		if (newsLetter.equalsIgnoreCase("yes")) {
			this.btnNewsletter.click();
		}
		
		if (option.equalsIgnoreCase("yes")) {
			this.btnOptin.click();
		}
	}
	
	//Fill Address Information
	public void fillAddressInfor(String firstName, String lastName, String company, String address1,
			String address2, String city, String stateName, String zip,String countryName, String other,
			String phone, String mobile, String alias) {
		
		
	// Set First Name
		this.txtAddFirstName.clear();
		this.txtAddFirstName.sendKeys(firstName);
		
	// Set Last Name
		this.txtAddLastName.clear();
		this.txtAddLastName.sendKeys(lastName);
		
	// Set Company
		this.txtCompany.clear();
		this.txtCompany.sendKeys(company);
		
	// Set Address 1
		this.txtAddress1.clear();
		this.txtAddress1.sendKeys(address1);
		
	// Set Address 2
		this.txtAddress2.clear();
		this.txtAddress2.sendKeys(address2);
		
	// Set City 
		this.txtCity.clear();
		this.txtCity.sendKeys(city);
		
	// Set State
		Select state = new Select(drpUniformState);
		state.selectByVisibleText(stateName);
	
	// Set Zip Code
		this.txtZipCode.clear();
		this.txtZipCode.sendKeys(zip);	
		
	// Set Country
		Select country = new Select(drpCountry);
		country.selectByVisibleText(countryName);
		
	// Set Additional information
		this.txtOther.clear();
		this.txtOther.sendKeys(other);	
		
	// Set home Phone
		this.txtPhone.clear();
		if(phone==null) {
			this.txtPhone.sendKeys("");
		}else {
			this.txtPhone.sendKeys(phone);	
		}
			
		
	// Set mobile phone
		this.txtMobile.clear();
		this.txtMobile.sendKeys(mobile);	
		
	// Set Alias
		this.txtAlias.clear();
		this.txtAlias.sendKeys(alias);
		
	}
	
	// Perform Registration
	
	public void doRegistration() {
		this.btnRegister.click();
	}

}
