package testCases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.setUp;
@Listeners(Utilities.extendreports.class)

public class TC_01_HomePage extends setUp 

{

  @Test(groups= {"regression","smoke","master",})
  public void homepage_input() throws InterruptedException
  { 
	  logger.info("*******Starting TC_01_HomePage************ ");
	  HomePage hp=new HomePage(driver);
	  hp.click_location_box();
	  try {
		  hp.click_search_chennai();
	  }
	  catch (Exception e ){
		  hp.click_search_in_entire_chennai();
	  }
	  logger.info("Clicked on location");
	  hp.click_dentist();
	  logger.info("Clicked on Specialist");
	  logger.info("Adding filters");
	  hp.click_patient_stories_down_arrow();
	  hp.click_patient_stories_select();
	  Thread.sleep(5000);
	  
	  hp.click_experience_down_arrow();
	  hp.click_experience_select();
	  Thread.sleep(5000);
	  
	  hp.click_all_filters_down_arrow();
	  hp.click_fee_select();
	  Thread.sleep(5000);
	  
	  hp.click_all_filters_down_arrow();
	  hp.click_availability_select();
	  Thread.sleep(5000);
	  
	  hp.click_sort_by_down_arrow();
	  hp.click_sort_by_select();
	  
	  System.out.println("-------------->List of Top 5 Doctors");
	  hp.get_doctor_details();
	  logger.info("***********Finished with TC_01_HomePage***********");
  }
}
