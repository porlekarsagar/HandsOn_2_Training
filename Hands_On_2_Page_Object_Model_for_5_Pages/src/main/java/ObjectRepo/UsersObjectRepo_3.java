package ObjectRepo;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersObjectRepo_3 {
	// WebElements on this page
	
	//1
	@FindBy(xpath=("//td[3]"))
	public List<WebElement> emails;
	//2
	@FindBy(xpath=("//td[4]"))
	public List<WebElement> mobiles;
	//3
	@FindBy(xpath=("//td[6]"))
	public List<WebElement> genders;
	//4
	@FindBy(xpath=("//td[7]"))
	public List<WebElement> states;
	//5
	@FindBy(xpath=("//td[8]"))
	public List<WebElement> deletes;
	
	//6 - Navigate to next page
	@FindBy(xpath=("//span[text() = 'Operators']"))
	public WebElement operators;
	
}
