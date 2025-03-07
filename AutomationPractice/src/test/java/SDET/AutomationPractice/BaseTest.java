package SDET.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	public MainTest test;
	public LoginPage login;
	public AccountPage account;
	public DetailPage detail;
	public MyPage myPage;

	
	@BeforeTest
	public void initial(){
		 
		// Initialize browser
		System.setProperty("webdriver.chrome.driver", "C:\\Work Space\\AutomationPractice\\resources\\chromedriver_win32\\chromedriver.exe");

		driver =new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = new MainTest();
		login = new LoginPage(driver);
		account = new AccountPage(driver);
		detail = new DetailPage(driver);
		myPage = new MyPage(driver);
		
		
	}
	
	
	@AfterTest
	
	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.close();

	}

	

	


}


