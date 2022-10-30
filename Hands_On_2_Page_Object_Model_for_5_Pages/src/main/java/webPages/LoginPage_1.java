    package webPages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import ObjectRepo.LoginObjectRepo;
	public class LoginPage_1 extends LoginObjectRepo {
	
	// page object model
	// WebElements and its methods 
	// or methods only here and WebElements in class of  ObjectRepo package separately
	
	WebDriver driver;
	
	/*@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="//button")
	public WebElement button;
	*/
	
	// constructor of LoginPage_1
	// methods only written here

	public LoginPage_1(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// to provide driver to all webElements
		//  The driver that will be used to look up the elements
		// with this driver all webElements of LoginObjectRepo will be initiated called here
		// in this class, we are using different webelements from LoginObjectRepo
		// to provide driver to all webElements, this method is written
	}
	
	// to navigate to next page and to initiate Dashboardpage_2 object this method can be used
	public Dashboardpage_2 navigateToDashboardPage(WebDriver driver){
		
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		button.click();
		return new Dashboardpage_2(driver);
	}
	
	public boolean checkCorrectCred()
	{
		System.out.println("Test 1: To verify the Title of Dashboard HomePage");
		navigateToDashboardPage(driver);
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";
		if (actTitle.equals(expTitle)) {
			
			System.out.println("Title is matched");
			return true;
		}
		else 
		{
			System.out.println("Title is not matched");
			return false;
		}
		
	}
	
	public String registerLinktitle() {
		registerLink.click();
		String title = driver.getTitle();
		return title;
	}

	public boolean checkRegistrationAlertmsg() throws Exception {
		System.out.println("Test 3:To verify Registration alert message");
		registerLinktitle();
		name.sendKeys("Kiran");
		mobile.sendKeys("1234567890");
		email2.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		button2.click();
		String actalertmsg = driver.switchTo().alert().getText();
		System.out.println("Alert message:-  "+actalertmsg);
		String expectedmsg = "User registered successfully.";
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		if (actalertmsg.equals(expectedmsg)) {
			
			System.out.println("Alert message is matched");
			return true;
		}
		else 
		{
			System.out.println("Alert message is not matched");
			return false;
		}
		
	}

	public boolean checkRegisterBlankPasswordError() {
		System.out.println("Test4 :- To verify Registration password blank error");
		registerLinktitle();
		name.sendKeys("Kiran");
		mobile.sendKeys("1234567890");
		email2.sendKeys("kiran@gmail.com");
		button2.click();
		String actpasswordError = passError.getText();
		System.out.println("Blank Password Error is:-  "+ actpasswordError);
		String expPassError = "Please enter Password.";
		
		
	if (actpasswordError.equals(expPassError)) {
			
			System.out.println("Password Error is matched");
			return true;
		}
		else 
		{
			System.out.println("Password Error is not matched");
			return false;
		}
		
	}

	public boolean checkRegisterBlankEmailError() {
		System.out.println("Test:5 - To verify Registration email blank error");
		registerLinktitle();
		name.sendKeys("Kiran");
		mobile.sendKeys("1234567890");
		password.sendKeys("123456");
		button2.click();
		String actEmailError = emailError.getText();
		System.out.println("Blank Email Error is:-  "+ actEmailError);
		String expEmailError = "Please enter Email.";
		
		
	if (actEmailError.equals(expEmailError)) {
			
			System.out.println("Email Error is matched");
			return true;
		}
		else 
		{
			System.out.println("Email Error is not matched");
			return false;
		}
		
	}

	public boolean checkRegisterInvalidEmailError() {
		System.out.println("Test 6:-To verify Registration invalid email error");
		registerLinktitle();
		name.sendKeys("Kiran");
		email2.sendKeys("ramgmail.com"); // invalid
		password.sendKeys("123456");
		button2.click();
		String actEmailError = emailError.getText();
		System.out.println("Blank Email Error is:-  "+ actEmailError);
		String expEmailError = "Please enter valid email.";
		
	    if (actEmailError.equals(expEmailError)) {
			
			System.out.println("Email Error is matched");
			return true;
		}
		else 
		{
			System.out.println("Email Error is not matched");
			return false;
		}
	}
	
}
