package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardObjectRepo_2 {
	
	// WebElements on this Dashboard page
	
		@FindBy(xpath="//*[text()='Users']")
		public WebElement users;
		
		@FindBy(xpath="//h3[text () ='Selenium']")
		public WebElement selenium;
		
		
		@FindBy(xpath="//h3[text () ='Selenium']//following-sibling::*")
		public WebElement automation;
		
		@FindBy(xpath="//h3[text () ='Java / J2EE']")
		public WebElement java;
		
		@FindBy(xpath="//h3[text () ='Java / J2EE']//following-sibling::*")
		public WebElement development;
		
		@FindBy(xpath="//h3[text () ='Php']//following-sibling::*")
		public WebElement webDevelopment;
		
		@FindBy(xpath="//h3[text () ='Python']//following-sibling::*")
		public WebElement dataScience;
	
		@FindBy(xpath="//*[text() = 'Users']")
		public WebElement user;
}
