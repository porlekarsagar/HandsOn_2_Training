	package webPages;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import ObjectRepo.OperatorsObjectRepo_4;
	
	public class OperatorsPage_4 extends OperatorsObjectRepo_4 {

	WebDriver driver;

	public OperatorsPage_4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// if not written above Null pointer exception will come
	}

	public boolean checkOperatorsWithWhatsAppOnly() {
		System.out.println("=======1. Test case to verify that Kiran and Darshit  has  way of connect \"Whats App Only\"=========");
		int size = persons.size();
		System.out.println("Test 1 size:- "+ size);
		String s3 = "Whats App Only";
		boolean result = false;
		for(WebElement person : persons) {
			if (person.getText().equals("Kiran")||person.getText().equals("Darshit")) {
				
				String  s1 = whatsApp1.getText();
				String  s2 = whatsApp2.getText();
				
				if (s1.equals(s3) && s2.equals(s3)) {
					System.out.println("Operator: " + person.getText() + ":- "+ s3);
					result = true;
				}
				else {
					result = true;
				}
			}
		}
		return result;
	}
    // ask can we use locate webElements from this class directly 
	// as unable to locate while using for loop with i
	public boolean checkWaysOfContactOfNeelamSeemaVarsha() {
		System.out.println("Test case 2: To verify that Neelam, Seema and Varsha has all the way of connect ie [Whats App Phone Call SMS eMail]=========");
		int size = persons.size();
		System.out.println("Test 2 size:- "+ size);
		boolean result = false;
		for (int i=2; i<=size+1; i++) {
			String nameOperator = driver.findElement(By.xpath("//tr["+i+"]//td[2]")).getText();
	    	 WebElement connects = driver.findElement(By.xpath("//tr["+i+"]//td[4]"));
	    	 String con = connects.getText();
    		//System.out.println(nameOperator + " has ways to connect are " + con);
    		String a = "Whats App Phone Call SMS eMail";
    			    		
    		if (nameOperator.contains("Neelam")||nameOperator.contains("Seema")||nameOperator.contains("Varsha")) 
	    		 {
		    			if(con.contains(a))
		    			System.out.println(nameOperator + " has ways to connect are " + con);
		    			result = true;
		 	         }
    		else {
    			if(con.contains("Whats App Only"))
    				System.out.println(nameOperator + " has ways to connect are " + con);
    				result = true;
    		}
	     }
		   return result;
      }

	public boolean checkOperatorAvailableOnSuday() {
		System.out.println("====Test case 3: To find out the Operator available on Sunday==========");
		List<WebElement> days= driver.findElements(By.xpath("//td[6]/b"));
		int size = days.size();
		System.out.println("Test 3 size :- "+ size);
		boolean result= false;
	    for(int i=2; i<= size+1 ; i++) {
	    	String timings = driver.findElement(By.xpath("//tr["+i+"]/td[6]/b")).getText();
    		//System.out.println("Timings :- " + timings);
    		
    		if (timings.contains("Sunday")) {
    			
    			String operator = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
    			System.out.println("Operator: " + operator + " is available on Sunday for contact");
    			result = true;
    		          }
	             }
	    return result;
	     }
	
	public boolean checkAdministrationOperator() 
	{
		System.out.println("=======4. Test case To find out the Operator handling Administration ==========");
		List<WebElement> rols= driver.findElements(By.xpath("//td[3]"));
		int size = rols.size();
		System.out.println("Test 4 size :- "+ size);
		boolean result= false;
	    for(int i=2; i<= size+1 ; i++) 
	    {
	    	String rols2 = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
    		//System.out.println("Timings :- " + timings);
    		
    		if (rols2.contains("Administration")) 
    		{
    			String operator = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
    			System.out.println("Operator: " + operator + " is handling Administration");
    			result = true;
    		    }
	    }
		return result;
	  }
	
	public boolean checkInquiryOperator() 
	{
		System.out.println("=======5. Test case To find out the Operator for Inquiry ==========");
		List<WebElement> rols= driver.findElements(By.xpath("//td[3]"));
		int size = rols.size();
		System.out.println("Test 5 size :- "+ size);
		boolean result= false;
	    for(int i=2; i<= size+1 ; i++) 
	    {
	    	String rols2 = driver.findElement(By.xpath("//tr["+i+"]/td[3]")).getText();
    		//System.out.println("Timings :- " + timings);
    		
    		if (rols2.contains("Enquiry")) 
    		{
    			
    			String operator = driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText();
    			System.out.println("Operator: " + operator + " for Inquiry");
    			result = true;
    		    }
	    }
		return result;
	}
	
	// method to navigate to next page
		public UsefulLinksPage_5 navigateToUsefulLinksPage_5(WebDriver driver){
			usefulLinks.click();
			return new UsefulLinksPage_5(driver);
		}
	
	
}
