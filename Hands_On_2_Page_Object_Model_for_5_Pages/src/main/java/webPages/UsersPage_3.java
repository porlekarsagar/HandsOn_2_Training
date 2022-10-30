	
	package webPages;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.PageFactory;
    import ObjectRepo.UsersObjectRepo_3;

public class UsersPage_3 extends UsersObjectRepo_3{

	WebDriver driver;
	
	public UsersPage_3 (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// initElements(WebDriver driver, Object page)
		// driver- The driver that will be used to look up the elements
		// page- The object with WebElement and List<WebElement> fields that should be proxied.
	    //  The driver that will be used to look up the elements
		// with this driver all webElements of UsersObjectRepo will be initiated
	}

	public boolean checkEmailHasSpecialCharacter()
	
	{
		System.out.println("Test 1:-To verify that All email contains @");
		 int size = emails.size();
		 System.out.println("Email Size = "+ size);
		 boolean result = false;
	     for (WebElement email: emails) 
		     {
		    	System.out.println(email.getText());
			    	if (email.getText().contains("@"))
				    	{
			    		result =  true;
				    	}
			    	else
				    	{
			    		System.out.println("All email do not contains @");
			    		result =  false;
				    	}
		    }
		return result;
		
	}

	public boolean checkMobileHasTenDigits() {
		 System.out.println("Test 2: To verify that All mobile numbers are 10 digits");
		  int size = mobiles.size();
		 System.out.println("Mobile Size = "+ size);
		 boolean result = false;
	    for (WebElement mobile: mobiles) {
	    	System.out.println(mobile.getText());
	    	if (mobile.getText().length()==10)
	    	{
    			result =  true;
	    	}
    	else
	    	{
    		 System.out.println("All mobile numbers are not 10 digits");
    		result =  false;
	    	}
	    	
	    }
	    return result;
	}

	public boolean checkGenderMaleFemale() {
		System.out.println("Test 3: To verify that All genders are correct, either Male or Female");
		 int size = genders.size();
		 System.out.println("Geneders Size = "+ size);
		 boolean result = false;
	    for (WebElement gender: genders) {
	    	
	    	System.out.println(gender.getText());
	    	if ((gender.getText().equals("Male")) || (gender.getText().equals("Female"))) {
	    		result =  true;
	    	}
	    	else
	    	{
	    		System.out.println( "====All genders are not correct=======");
	    		result =  false;
	    		break;
	    	}
	    }
	    return result;
	}

	public boolean checkAllUsersMaharashtra() {
		System.out.println("Test 4: To verify that All Users are from Maharashtra or not");
		 int size = states.size();
		 System.out.println("States Size = "+ size);
		 boolean result = false;
	     for (WebElement state: states) {
	    	System.out.println(state.getText());
	    	if ((state.getText().equals("Maharashtra")))  {
	    		result =  true;
	    	}
	    	else
	    	{
	    		System.out.println( "====All Users are not from Maharashtra=======");
	    		result =  false;
	    		break;
	    	}
	    }
	    return result;
	    }

	public boolean checkDeleteButton() {
		 System.out.println("Test 5:-To verify that User delete button available or not in the last column");
		 int size = deletes.size();
		 System.out.println("Delets Size = "+ size);
		 boolean result = false;
	    for (WebElement delete: deletes) {
	    	System.out.println(delete.getText());
	    	if ((delete.getText().equals("Delete")))  {
	    		result =  true;
	    	}
	    	else
	    	{
	    		System.out.println( "====All Users not have delete option=====");
	    		result =  false;
	    		break;
	    	}
	    }
	    return result;	    
	}
	
	// method to navigate to next page
	public OperatorsPage_4 navigateToOperatorsPage_4(WebDriver driver){
		operators.click();
		return new OperatorsPage_4(driver);
	}
	
	
	
	
}
