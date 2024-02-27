package testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import PageObjects.Surgeries;
import testBase.setUp;
@Listeners(Utilities.extendreports.class)

public class TC_02_Surgeries extends setUp{
	@Test(groups= {"regression","master"})
	public void print_surgeries()
	{
		logger.info("***********Starting TC_02_Surgeries**********");
		Surgeries s = new Surgeries(driver);
		s.click_surgeries();
		logger.info("Clicked on surgeries");
		System.out.println("-------------->List of surgeries");
		s.get_list_of_surgeries();
		logger.info("Getting list of surgeries");
		logger.info("************Finished with TC_02_Surgeries**********");
	}
}
