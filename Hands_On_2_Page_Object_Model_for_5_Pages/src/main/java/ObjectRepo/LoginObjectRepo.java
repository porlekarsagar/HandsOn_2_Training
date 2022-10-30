package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectRepo {

	// WebElements on this page
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//button")
	public WebElement button;
	
	@FindBy(className="text-center")
	public WebElement registerLink;
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(id="mobile")
	public WebElement mobile;
	
	@FindBy(id="email")
	public WebElement email2;
	
	@FindBy(id="password")
	public WebElement password2;
	
	@FindBy(xpath="//button")
	public WebElement button2;
	
	@FindBy(id="password_error")
	public WebElement passError;
	
	@FindBy(id="email_error")
	public WebElement emailError;
	
	
	
}
