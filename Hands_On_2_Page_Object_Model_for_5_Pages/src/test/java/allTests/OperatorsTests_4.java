	
	package allTests;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import Base_class.TestBase;
	import webPages.OperatorsPage_4;

	public class OperatorsTests_4 extends TestBase
	{
	OperatorsPage_4 op;
		@BeforeMethod
		
		public void setUp() throws Exception 
			{
				initialization();
				op = loadLoginPage().navigateToDashboardPage(driver).navigateToUsersPage_3(driver).navigateToOperatorsPage_4(driver);
			// ask above line is it correct way to initialize op
			}
		
		@Test 
		public void verifyOperatorsWithWhatsAppOnly_1() 
			{
				Assert.assertTrue(op.checkOperatorsWithWhatsAppOnly());	
			}
		
		@Test (dependsOnMethods="verifyOperatorsWithWhatsAppOnly_1")
		
		public void verifyWaysOfContactOfNeelamSeemaVarsha_2() 
			{
				Assert.assertTrue(op.checkWaysOfContactOfNeelamSeemaVarsha());	
			}
		
		@Test (dependsOnMethods="verifyWaysOfContactOfNeelamSeemaVarsha_2")
		
		public void verifyOperatorAvailableOnSuday_3() 
			{
				Assert.assertTrue(op.checkOperatorAvailableOnSuday());	
			}
		
		@Test (dependsOnMethods="verifyOperatorAvailableOnSuday_3")
		
		public void verifyAdministrationOperator_4() 
			{
				Assert.assertTrue(op.checkAdministrationOperator());	
			}
		
		@Test (dependsOnMethods="verifyAdministrationOperator_4")
		
		public void verifyInquiryOperator_5() 
			{
				Assert.assertTrue(op.checkInquiryOperator());	
			}
		
		@AfterMethod
		public void tearDown() throws Exception 
			{
				Thread.sleep(2000);
				driver.close();
			}
	}
