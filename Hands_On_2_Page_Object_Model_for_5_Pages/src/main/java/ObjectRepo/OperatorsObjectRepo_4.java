package ObjectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorsObjectRepo_4 {
	
	//1
	@FindBy(xpath=("//tr[2]//td[4]//span"))
	public WebElement whatsApp1;
	//1
	@FindBy(xpath=("//tr[6]//td[4]//span"))
	public WebElement whatsApp2;
	//1
	@FindBy(xpath=("//td[2]"))
	public List<WebElement> persons;
	
	// To navigate to next page
	@FindBy(xpath=("//*[text()='     Useful Links']"))
	public WebElement usefulLinks;
	//2
	//@FindBy(xpath=("//tr[\"+i+\"]//td[2]"))
	//public WebElement nameOperator;


}
