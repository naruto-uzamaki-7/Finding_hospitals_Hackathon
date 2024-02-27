package StepDefinition;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HealthandWellness;
import PageObjects.HomePage;
import PageObjects.Surgeries;
import io.cucumber.java.en.*;


public class FindingHospitals {
	

	WebDriver driver;
	@Given("the user open the website")
	public void the_user_open_the_website() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.practo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	@When("select location")
	public void select_location() {
		HomePage hp = new HomePage(driver);
		hp.click_location_box();
		try {
			hp.click_search_in_entire_chennai();
		}
		catch(Exception e)
		{
			hp.click_search_chennai();
		}

	}

	@When("select specialist")
	public void select_specialist() {
		HomePage hp = new HomePage(driver);
		hp.click_dentist();
	}

	@When("user apply filters")
	public void user_apply_filters() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		  hp.click_patient_stories_down_arrow();
		  hp.click_patient_stories_select();
		  Thread.sleep(3000);
		  
		  hp.click_experience_down_arrow();
		  hp.click_experience_select();
		  Thread.sleep(3000);
		  
		  hp.click_all_filters_down_arrow();
		  hp.click_fee_select();
		  Thread.sleep(3000);
		  
		  hp.click_all_filters_down_arrow();
		  hp.click_availability_select();
		  Thread.sleep(3000);
		  
		  hp.click_sort_by_down_arrow();
		  hp.click_sort_by_select();
	}

	@When("print top five doctors")
	public void print_top_five_doctors() {
		HomePage hp = new HomePage(driver);
		  System.out.println("-------------->List of Top 5 Doctors");
		  hp.get_doctor_details();
	}

	@When("user click on surgeries")
	public void user_click_on_surgeries() {
		Surgeries s = new Surgeries(driver);
		s.click_surgeries();
	}

	@When("print all surgeries")
	public void print_all_surgeries() {
		Surgeries s = new Surgeries(driver);
		System.out.println("-------------->List of surgeries");
		
		s.get_list_of_surgeries();
	}

	@When("user click on for corporates")
	public void user_click_on_for_corporates() {
		HealthandWellness hw= new HealthandWellness(driver);
		hw.click_forCorporates();
	}

	@When("user click on health and wellness")
	public void user_click_on_health_and_wellness() {
		HealthandWellness hw= new HealthandWellness(driver);
		hw.click_healthandWellnessPlans();
	}

	@When("user fill invalid details")
	public void user_fill_invalid_details() {
		HealthandWellness hw= new HealthandWellness(driver);
		hw.set_name();
		hw.set_organizationName();
		hw.set_contactNumber();
		hw.set_invalid_officialEmailID();
		hw.click_dropdown1();
		hw.click_dropdown2();
		
	}
	@Then("check schedule button is enabled or not")
	public void check_schedule_button_is_enabled_or_not() {
		HealthandWellness hw= new HealthandWellness(driver);
		hw.verify_scheduleADemo_btn();
	}

	@When("user fill valid details")
	public void user_fill_valid_details() throws InterruptedException {
		HealthandWellness hw= new HealthandWellness(driver);
		hw.set_valid_officialEmailID();
		hw.verify_scheduleADemo_btn();
		Thread.sleep(5000);
	    
	}


	@Then("verify thank you message")
	public void verify_thank_you_message() {
		HealthandWellness hw= new HealthandWellness(driver);
		hw.verify_thankyou();
	}


}
