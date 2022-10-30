	package allTests;
	import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	import Base_class.TestBase;
	import webPages.Dashboardpage_2;
	
	public class DashboardTest_2 extends TestBase {
	
	Dashboardpage_2 dashboardpage;
	// dashboardpage reference for Dashboardpage_2 page is created globally
	
	@BeforeMethod
	public void setUp()
		{
			initialization();
			dashboardpage = loadLoginPage().navigateToDashboardPage(driver);
			// To initiate dashboardpage object
			// loadLoginPage() method is written inside the TestBase class
			// loadLoginPage() method returns LoginPage_1 class
			// then we call method navigateToDashboardPage(driver) from LoginPage_1 class
		}
	// setUp method is used to connect first 2 pages with each other
	
	// 1.To verify that User Link is working or not
	@Test
	public void verifyUserPageLink_1()
		{
		   Assert.assertTrue(dashboardpage.checkUserLink());
		}
	
	// 2.To verify that after Selenium, Automation Testing is written
	@Test (dependsOnMethods="verifyUserPageLink_1")
	public void verifyAutomationAfterSelenium_2()
		{
		   Assert.assertTrue(dashboardpage.checkAutomationAfterSelenium_2());
		}
	
	// 3.To verify that after Java / J2EE, Software Development is written
	@Test (dependsOnMethods="verifyAutomationAfterSelenium_2")
	public void verifySoftwareDevelopmentAfterJava_3()
		{
		   Assert.assertTrue(dashboardpage.checkSoftwareDevelopmentAfterJava());
		}
		
	// 4.To verify that after Python, Data Science is written
			@Test (dependsOnMethods="verifySoftwareDevelopmentAfterJava_3")
			public void verifyDataScienceAfterPython_4()
				{
				   Assert.assertTrue(dashboardpage.checkDataScienceAfterPython());
				}
	
	// 5.To verify that after Php, Web Development is written
		@Test (dependsOnMethods="verifyDataScienceAfterPython_4")
		public void verifyWebDevelopmentAfterPhp_5()
			{
			   Assert.assertTrue(dashboardpage.checkWebDevelopmentAfterPhp());
			}
		
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(2000);
			driver.close();
		}
		
}
