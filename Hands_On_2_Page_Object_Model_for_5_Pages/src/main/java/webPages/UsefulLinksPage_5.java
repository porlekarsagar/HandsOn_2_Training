	package webPages;
	import java.util.Set;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import ObjectRepo.UsefulLinksPageObjectRepo_5;
	
	public class UsefulLinksPage_5 extends UsefulLinksPageObjectRepo_5{
		
	WebDriver driver;
	public UsefulLinksPage_5(WebDriver driver)  {
		this.driver = driver;
		PageFactory.initElements(driver, this);
   }

	public boolean checkScheduleButtonClickable() throws Exception {
		System.out.println("===1. To verify that the button in front of Schedule is clickable or not  ==========");
		String windowParent = driver.getWindowHandle();
		schedule.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		boolean result=false;
		for (String window :windows) {
			if (!window.equals(windowParent)) {
				String title = driver.switchTo().window(window).getTitle();
				Thread.sleep(2000);
	    		System.out.println("Actual Title is : "+ title);
	    		Thread.sleep(2000);
	    		if (title.equals("Page not found | javabyKiran")) 
		    		{
		    			System.out.println("Schedule Title is matched");
		    			result= true;
		    		}
	    		else
		    		{
		    			System.out.println("Schedule Title is not matched");
		    			result=false;
		    		}
			 }
	     }
		return result;
	}

	public boolean checkVideoLecturesButtonClickable() throws Exception 
	{
		System.out.println("===2. To verify that the button in front of \"Video Lactures All Topics\" is clickable or not");
		vedioLectures.click();
		String windowParent = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		boolean result=false;
		for (String window :windows) 
		 {
			if (!window.equals(windowParent)) 
			  {
				String title = driver.switchTo().window(window).getTitle();
				Thread.sleep(2000);
	    		System.out.println("Actual Title is : "+ title);
	    		Thread.sleep(2000);
			    	if (title.equals("Live Videos | javabyKiran")) 
			    		{
			    			System.out.println("Video Lactures Title is matched");
			    			result= true;
			    		}
		    		 else
			    		{
			    			System.out.println("Video Lactures Title is not matched");
			    			result=false;
			    		}
		     }
		}
		return result;
	}

	public boolean checkSeleniumInterviewButtonClickable() throws Exception 
	{
		System.out.println("===3. To verify that the button in front of \"Selenium Interview Questions\" is clickable or not");
		seleniumInterview.click();
		String windowParent = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		boolean result=false;
		for (String window :windows) {
			if (!window.equals(windowParent)) {
				String title = driver.switchTo().window(window).getTitle();
				Thread.sleep(2000);
			    		System.out.println("Actual Title is : "+ title);
			    	   	Thread.sleep(2000);
			    	   	if (title.equals("Page not found | javabyKiran")) 
			    		{
			    			System.out.println("Selenium Interview Questions Title is matched");
			    			result= true;
			    		}
		    		else
			    		{
			    			System.out.println("Selenium Interview Questions Title is not matched");
			    			result=false;
			    		}
				}
			
		}
		return result;
	}

	
   public boolean checkJavaInterviewButtonClickable() throws Exception  {
		
	   System.out.println("===4. To verify that the button in front of \"Java Interview Questions\" is clickable or not");
	   javaInterview.click();
		String windowParent = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		boolean result=false;
		for (String window :windows) {
			if (!window.equals(windowParent)) {
				String title = driver.switchTo().window(window).getTitle();
				        Thread.sleep(2000);
			    		System.out.println("Actual Title is : "+ title);
			    	   	Thread.sleep(2000);
			    	 	if (title.equals("Page not found | javabyKiran")) 
			    		{
			    			System.out.println("Java Interview Questions Title is matched");
			    			result= true;
			    		}
		    		else
			    		{
			    			System.out.println("Java Interview Questions Title is not matched");
			    			result=false;
			    		}
			}
		}
		return result;
	}
   
   
	public boolean checkCoursesButtonClickable() throws Exception {
	
		System.out.println("===5. To verify that the button in front of \"Courses\" is clickable or not");
		courses.click();
		String windowParent = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		boolean result=false;
		for (String window :windows) {
			if (!window.equals(windowParent)) {
				String title = driver.switchTo().window(window).getTitle();
			    		Thread.sleep(2000);
			    		System.out.println("Actual Title is : "+ title);
			    	   	Thread.sleep(2000);
			    	   	if (title.equals("Page not found | javabyKiran")) 
			    		{
			    			System.out.println("Courses Title is matched");
			    			result= true;
			    		}
		    		else
			    		{
			    			System.out.println("Courses Title is not matched");
			    			result=false;
			    		}
			}
		}
		return result;
	}

	public boolean checkPlacementButtonClickable() throws Exception {
		System.out.println("===6. To verify that the button in front of \"Placement\" is clickable or not");
		placement.click();
		String windowParent = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		boolean result=false;
		for (String window :windows) {
			if (!window.equals(windowParent)) {
				String title = driver.switchTo().window(window).getTitle();
			    		Thread.sleep(3000);
			    		System.out.println("Actual Title is : "+ title);
			    	   	Thread.sleep(2000);
			    	   	if (title.equals("Placement | javabyKiran")) 
			    		{
			    			System.out.println("Placement Title is matched");
			    			result= true;
			    		}
		    		else
			    		{
			    			System.out.println("Placement Title is not matched");
			    			result=false;
			    		}
			}
		}
		return result;
	}
	
}