	
	package allTests;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	import Base_class.TestBase;
	import webPages.Dashboardpage_2;
	import webPages.UsersPage_3;


public class UsersTest_3 extends TestBase {

	UsersPage_3 usersPage_3;
	// UsersPage_3 variable is created 
	// so that we can call methods here from UsersPage_3 Class to run the Test cases
	
	@BeforeMethod
	public void setUp()
		{
			initialization(); // Browser initialization
			Dashboardpage_2 dp = loadLoginPage().navigateToDashboardPage(driver);
			// shifting from first LoginPage to DashboardPage second 
			usersPage_3 = dp.navigateToUsersPage_3(driver);
			// shifting from second DashboardPage to Users third page
			// also usersPage_3 variable initialized, so that we can use methods from UsersPage_3
		}
	
	@Test
	public void verifyEmailHasSpecialCharacter_1()
		{
			Assert.assertTrue(usersPage_3.checkEmailHasSpecialCharacter());
			System.out.println("All email contains @");
		}
	
	@Test   // This Test 2 will fail
	public void verifyMobileHasTenDigits_2()
		{
			Assert.assertTrue(usersPage_3.checkMobileHasTenDigits());
		}
	
	@Test // This Test 3 will fail
	public void verifyGenderMaleFemale_3()
		{
			Assert.assertTrue(usersPage_3.checkGenderMaleFemale());
		}
	
	@Test // This Test 4 will fail
	public void verifyAllUsersMaharashtra_4()
		{
			Assert.assertTrue(usersPage_3.checkAllUsersMaharashtra());
		}
	
	@Test 
	public void verifyDeleteButton_5()
		{
			Assert.assertTrue(usersPage_3.checkDeleteButton());
			System.out.println("======All users have delete option=====");
		}
	@AfterMethod
	public void tearDown() throws Exception 
		{
			Thread.sleep(2000);
			driver.close();
		}
	
}
