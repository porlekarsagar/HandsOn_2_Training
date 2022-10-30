	
	package ObjectRepo;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class UsefulLinksPageObjectRepo_5 {
		
		@FindBy(xpath=("//tr[2]//td[3]//a"))
		public WebElement schedule;
		
		@FindBy(xpath=("//tr[3]//td[3]//a"))
		public WebElement vedioLectures;
		
		@FindBy(xpath=("//tr[4]//td[3]//a"))
		public WebElement seleniumInterview;
		
		@FindBy(xpath=("//tr[4]//td[3]//a"))
		public WebElement javaInterview;
		
		@FindBy(xpath=("//tr[6]//td[3]//a"))
		public WebElement courses;
		
		@FindBy(xpath=("//tr[7]//td[3]//a"))
		public WebElement placement;
		
	}
