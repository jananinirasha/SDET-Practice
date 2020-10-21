package SDET.AutomationPractice;

import org.openqa.selenium.WebDriver;

public class BasePage {
	//Intializing Webdriver
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

}
