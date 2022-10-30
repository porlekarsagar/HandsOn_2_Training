	
	package webPages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import ObjectRepo.DashboardObjectRepo_2;
	
	public class Dashboardpage_2 extends DashboardObjectRepo_2 {
	
		WebDriver driver;

	public Dashboardpage_2 (WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	public boolean checkUserLink() 
	{
		System.out.println("Test 1 :- To verify that User Link is working or not ");
		String actual = "JavaByKiran | User";  // here should be expected??
		users.click();
		
		if (driver.getTitle().equals(actual)) 
			{
				System.out.println("Test:1- User Link is working");
				return true;
			}
		else 
			{
				System.out.println("Test:1- User Link is not working");
				return false;
				
			}
	}

	public boolean checkAutomationAfterSelenium_2() 
	{
		System.out.println("Test 2 :- To verify that after Selenium, Automation Testing is written or not");
		String act = automation.getText();
		String expect = "Automation Testing";
		if (act.equals(expect)) 
		{
			System.out.println("Test:2-Automation Title is matched");
			return true;
		}
		else 
		{
			System.out.println("Automation Title is not matched");
			return false;
		}
			
	}

	public boolean checkSoftwareDevelopmentAfterJava() 
	{
		System.out.println("Test 3 :- To verify that after Java , Software Development is written or not");
		String act = development.getText();
		String expect = "Software Development";
		if (act.equals(expect)) 
			{
				System.out.println("Test:3-Software Development Title is matched");
				return true;
			}
		else 
			{
				System.out.println("Software Development Title is not matched");
				return false;
			}
	}

	public boolean checkDataScienceAfterPython() 
	{
		System.out.println("Test 4 :-To verify that after Python, Data Science is written or not");
		String act = dataScience.getText();
		String expect = "Data Science";
		if (act.equals(expect)) 
			{
				System.out.println("Test:4-Data Science Title is matched");
				return true;
			}
		else 
			{
				System.out.println("Data Science Title is not matched");
				return false;
			}
	}
	
	
	public boolean checkWebDevelopmentAfterPhp() 
	{
		System.out.println("Test 5 :-To verify that after Php, Web Development is written or not");
		String act = webDevelopment.getText();
		String expect = "Web Development";
		if (act.equals(expect)) 
			{
				System.out.println("Test:5-Web Development Title is matched");
				return true;
			}
		else 
			{
				System.out.println("Web Development Title is not matched");
				return false;
			}
	}

public UsersPage_3 navigateToUsersPage_3(WebDriver driver){
	    user.click();
		return new UsersPage_3(driver);
	}
	
}
