	// four methods are written 
    /*  1.   readProperties method 
        2.   launchApplication method
		3.   Initialization method
		4.   loadLoginPage method*/

// FileInputStream class

	package Base_class;
	import java.io.FileInputStream;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
    import org.apache.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import webPages.LoginPage_1;

	public class TestBase {
	
		public static WebDriver driver;
		FileInputStream fis = null;
		
		public static Logger log = Logger.getLogger("TestBase.class");
		//Logger Class 
		// Most logging operations, except configuration, are done through this Logger class
		// import org.apache.log4j.Logger;
		// use above to import Logger
		// following 3 variables are  used for ExtentReports
		public static ExtentReports report = null;
		public static ExtentTest test = null;
		public static ExtentSparkReporter spark = null;
		
		// method to read config.properties file
		// and ie  to read the browser and url
		// 1. method to read config.properties file
		// Properties class
				// load method
				// getProperty method
		// FileInputStream class 
		public String readProperties(String key) {
			
			Properties pro = new Properties();
			try {
				fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
			    // To provide the path from current Project 
				// if we provide the detail path from our local drive
				// other person cannot read the file
				// for this System.getProperty("user.dir") is used
				//load () method
				// Reads a property list (key and element pairs) from the input byte stream.
				// load(InputStream inStream)
				pro.load(fis);
			}
			catch (Exception e ) {
				e.printStackTrace();
			}
			return pro.getProperty(key);
			// Returns:the value in this property list with the specified key value.
		}
		
		
		// to open website by URL and to set waits
		
		public void launchApplication() {
			
			driver.get(readProperties("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//Specifies the amount of time the driver should wait when searching for an element 
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			//Sets the amount of time to wait for a page load to complete before throwing an error.
		}
		
		// 3. Browser and driver Initialization method
		// Also used to initialize the driver in the Test classes
		// driver = initialization()
		public WebDriver initialization() {
			
			// System.out.println("Browser Initialization started");
			log.info("Browser Initialization started");
			if (readProperties ("browser").contains("chrome"))
				//readProperty method  is used above 
			{
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
				launchApplication();
				
				return driver;
			}
			else 
			{
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
				launchApplication();
				return driver;
			}
		}
		
		
		// methods to return page classes
		// which can be used to initialise the object of respective page
		public LoginPage_1 loadLoginPage()
		{
			LoginPage_1 lp = new LoginPage_1(driver);
			return lp;
			// method returns LoginPage_1
			// so that we can use methods of LoginPage_1
			// method which can be used to initialize the object of LoginPage_1 in webpages
		}
				
		/*
		public Dashboardpage_2 loadDashboardpage_2()
		{
			Dashboardpage_2 dp = new Dashboardpage_2(driver);
			return dp;
			// method returns OperatorsPage_3
			// so that we can use methods of OperatorsPage_3
		}
		
		/* To initialize the usersPage_3 variable in UsersTest_3 class, following method is important
		public UsersPage_3 loadUsersPage_3()
		{
			UsersPage_3 up = new UsersPage_3(driver);
			return up;
			// method returns OperatorsPage_3
			// so that we can use methods of OperatorsPage_3
		}*/
		
		
		
		/*public OperatorsPage_3 loadOperatorsPage_3()
		{
			OperatorsPage_3 op = new OperatorsPage_3(driver);
			return op;
			// method returns OperatorsPage_3
			// so that we can use methods of OperatorsPage_3
		}
		*/
		
		public void reportInit() {
			
			report = new ExtentReports();
			spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReport.html");
			// ExtentSparkReporter - To provide path to ExtentReport to save
			report.attachReporter(spark);
		}
		
		
		
	}