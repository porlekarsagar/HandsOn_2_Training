		
	package allTests;
    import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import Base_class.TestBase;
	import webPages.LoginPage_1;
		
	public class LoginTest_1 extends TestBase {
	WebDriver driver = null;
	LoginPage_1 lp;
	// loginpage object created
	// so that we can call methods from LoginPage_1 class by using lp object in this class
	
	@BeforeMethod
	public void setUp() 
		{
			driver = initialization();
			lp = loadLoginPage();    //  we get  object of LoginPage
			// Initialiation of lp, object of LoginPage_1
			// loadLoginPage() method returns LoginPage_1
			// so that methods from LoginPage_1 class can be called here
		}
	
	// methods required upto or for setUp method are written inside the TestBase class
	// OR methods required  for Initial setUp are written inside the TestBase class
	
	@Test
	// All Test cases related to LoginPage are written here 
	// and methods required to run loginPage Test cases are written in LoginPage_1 class of webPages Package
	public void verifyTitleOfHomePage_1() 
		{
			Assert.assertTrue(lp.checkCorrectCred());
		}
	
	@Test(dependsOnMethods = "verifyTitleOfHomePage_1")
	public void verifyRegisterLink_2()  
		{
			Assert.assertEquals(lp.registerLinktitle(),"JavaByKiran | Registration Page" );
			System.out.println("Registration link is clickable");
		}

	@Test(dependsOnMethods = "verifyRegisterLink_2")
	
	public void verifyRegistrationAlertmsg_3() throws Exception 
		{
			Assert.assertTrue(lp.checkRegistrationAlertmsg());
		}

	@Test(dependsOnMethods = "verifyRegistrationAlertmsg_3")
	
	public void verifyRegisterBlankPassError_4()  
		{
			Assert.assertTrue(lp.checkRegisterBlankPasswordError());
		}
	
    @Test(dependsOnMethods = "verifyRegisterBlankPassError_4")
	
    public void verifyRegisterBlankEmailError_5() 
	    {
			Assert.assertTrue(lp.checkRegisterBlankEmailError());
		}
	
    @Test(dependsOnMethods = "verifyRegisterBlankEmailError_5")
	
    public void verifyRegisterInvalidEmailError_6() 
	    {
			Assert.assertTrue(lp.checkRegisterInvalidEmailError());
		}
	    
	@AfterMethod
	public void tearDown() throws Exception 
		{
			Thread.sleep(2000);
			driver.close();
		}
}
