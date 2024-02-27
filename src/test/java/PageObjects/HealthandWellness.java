package PageObjects;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class HealthandWellness extends BaseClass{



	public HealthandWellness(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='nav-interact']") 
	WebElement forCorporates;
	public void click_forCorporates()
	{
		forCorporates.click();
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Health & Wellness Plans']")
	WebElement healthandWellnessPlans;
	public void click_healthandWellnessPlans()
	{
		healthandWellnessPlans.click();
	}
	@FindBy(xpath="//header[@id='header']//input[@id='name']")
    WebElement name;
    public void set_name(String n)
    
    { 
    	name.sendKeys(n);
    }
    @FindBy(xpath="//header[@id='header']//input[@id='organizationName']")
    WebElement organizationName;
    public void set_organizationName(String on)
    {
    	organizationName.sendKeys(on);
	}


     @FindBy(xpath="//header[@id='header']//input[@id='contactNumber']")
     WebElement contactNumber;
     public void set_contactNumber(String cn)
     {
    	 contactNumber.sendKeys(cn);
     }

     @FindBy(xpath="//header[@id='header']//input[@id='officialEmailId']") 
     WebElement invalidlEmailID;
     public void set_invalid_officialEmailID(String inmail)
     {
    	 invalidlEmailID.sendKeys(inmail);
     }
     @FindBy(xpath="//header[@id='header']//input[@id='officialEmailId']") 
     WebElement validEmailID;
     public void set_valid_officialEmailID(String vmail)
     {
    	 validEmailID.clear();
    	 validEmailID.sendKeys(vmail);
     }
     @FindBy(xpath="//header[@id='header']//select[@id='organizationSize']")
     WebElement dropdown1;
     public void click_dropdown1()
     {
    	 Select s = new Select(dropdown1);
	     s.selectByValue("501-1000");
	     }
     @FindBy(xpath="//header[@id='header']//select[@id='interestedIn']")
     WebElement dropdown2;
     public void click_dropdown2()
     {
    	 Select s = new Select(dropdown2);
	     s.selectByValue("Taking a demo");
	 }
     @FindBy(xpath="//header[@id='header']//button[@type='submit'][normalize-space()='Schedule a demo']")
     WebElement scheduleADemo_btn;
     public void verify_scheduleADemo_btn()
     {
    	if(scheduleADemo_btn.isEnabled())
    	{
    		System.out.println("Button Enabled");
    		scheduleADemo_btn.click();
    	}
    	else
    	{
    		System.out.println("Button is  Disabled");
    	}
     }
     @FindBy(xpath="//body/div[4]/div[1]/div[1]/div[1]/div[1]")
     WebElement thankyou;
     public void verify_thankyou()
     {
    	if(thankyou.getText().equals("THANK YOU"))
    	{
    		System.out.println("Thank you verified");
    	}
    	else
    	{
    		System.out.println("Thank you not-verified");
    	}
     }
}
