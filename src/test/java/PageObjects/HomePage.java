package PageObjects;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search location']")
	WebElement location_box;
	public void click_location_box()
	{
		location_box.click();
		location_box.clear();
		location_box.sendKeys("Chennai");
	}
	
	
	@FindBy(xpath="//div[@data-qa-id='omni-suggestion-city']//i[@class='icon-ic_search']")
	WebElement search_chennai;
	public void click_search_chennai()
	{
		search_chennai.click();
	}
	

	@FindBy(xpath="//div[contains(text(),'Search in entire Chennai')]")
	WebElement search_in_entire_chennai;
	public void click_search_in_entire_chennai()
	{
		search_in_entire_chennai.click();
	}
	
	
	@FindBy(xpath="//div[contains(text(),'Dentist')]")
	WebElement dentist;
	public void click_dentist()
	{
		dentist.click();
	}
	
	
	@FindBy(xpath="//span[@data-qa-id='doctor_gender_selected']//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown u-f-right']")
	WebElement gender_down_arrow;
	public void click_gender_down_arrow()
	{
		gender_down_arrow.click();
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Male Doctor']")
	WebElement gender_select;
	public void click_gender_select()
	{
		gender_select.click();
	}
	
	
	@FindBy(xpath="//span[@data-qa-id='doctor_review_count_selected']//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown u-f-right']")
	WebElement patient_stories_down_arrow;
	public void click_patient_stories_down_arrow()
	{
		patient_stories_down_arrow.click();
	}
	
	
	@FindBy(xpath="//li[@aria-label='20+ Patient Stories']")
	WebElement patient_stories_select;
	public void click_patient_stories_select()
	{
		patient_stories_select.click();
	}
	
	@FindBy(xpath="//span[@data-qa-id='years_of_experience_selected']//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown u-f-right']")
	WebElement experience_down_arrow;
	public void click_experience_down_arrow()
	{
		experience_down_arrow.click();
	}
	
	
	@FindBy(xpath="//span[normalize-space()='20+ Years of experience']")
	WebElement experience_select;
	public void click_experience_select()
	{
		experience_select.click();
	}
	
	
	@FindBy(xpath="//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown']")
	WebElement all_filters_down_arrow;
	public void click_all_filters_down_arrow()
	{
		all_filters_down_arrow.click();
	}
	
	
	@FindBy(xpath="//label[@for='Fees1']//div[@class='c-filter__select--radio u-d-inlineblock u-valign--middle u-pos-rel']")
	WebElement fee_select;
	public void click_fee_select()
	{
		fee_select.click();
	}
	

    @FindBy(xpath="//label[@for='Availability3']//div[@class='c-filter__select--radio u-d-inlineblock u-valign--middle u-pos-rel']") 
    WebElement availability_select;
    public void click_availability_select()
    {
    	availability_select.click();
    }
    
    
    @FindBy(xpath="//span[@class='c-sort-dropdown__selected c-dropdown__selected']//i[@class='u-transition--transform u-d-inlineblock icon-ic_dropdown u-f-right']")
    WebElement sort_by_down_arrow;
    public void click_sort_by_down_arrow()
    {
    	sort_by_down_arrow.click();
    }
    
    
    @FindBy(xpath="//li[@aria-label='Experience - High to Low']") 
    WebElement sort_by_select;
    public void click_sort_by_select()
    {
    	sort_by_select.click();
    }
    
    
    @FindBy(xpath="//*[@class=\"info-section\"]")
    List<WebElement> doctor_details;
    public void get_doctor_details()
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println(doctor_details.get(i).getText());
    		System.out.println("");
    	}
    }
}
