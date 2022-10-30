	
	package allTests;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;
    import Base_class.TestBase;
	import webPages.UsefulLinksPage_5;
	
	public class UsefulLinksTests_5 extends TestBase {

	UsefulLinksPage_5 ul;
	@BeforeMethod
	
	public void SetUp() {
		initialization();
		ul = loadLoginPage().navigateToDashboardPage(driver).navigateToUsersPage_3(driver).navigateToOperatorsPage_4(driver).navigateToUsefulLinksPage_5(driver);
	}
	
	@Test 
	public void verifyScheduleButtonClickable_1() throws Exception
	{
		Assert.assertTrue(ul.checkScheduleButtonClickable());
			
	}
	
	@Test (dependsOnMethods = "verifyScheduleButtonClickable_1")
	public void verifyVideoLecturesButtonClickable_2() throws Exception
	{
		Assert.assertTrue(ul.checkVideoLecturesButtonClickable());
			
	}
	
	@Test (dependsOnMethods = "verifyVideoLecturesButtonClickable_2")
	public void verifySeleniumInterviewButtonClickable_3() throws Exception
	{
		Assert.assertTrue(ul.checkSeleniumInterviewButtonClickable());
			
	}
	
	
	@Test (dependsOnMethods = "verifySeleniumInterviewButtonClickable_3")
	public void verifyJavaInterviewButtonClickable_4() throws Exception
	{
		Assert.assertTrue(ul.checkJavaInterviewButtonClickable());
			
	}
	
	@Test (dependsOnMethods = "verifyJavaInterviewButtonClickable_4")
	public void verifyCoursesButtonClickable_5() throws Exception
	{
		Assert.assertTrue(ul.checkCoursesButtonClickable());
	}
	
	
	@Test (dependsOnMethods = "verifyCoursesButtonClickable_5")
	public void verifyPlacementButtonClickable_6() throws Exception
	{
		Assert.assertTrue(ul.checkPlacementButtonClickable());
	}

	@AfterMethod
	
	public void last() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	  
}
