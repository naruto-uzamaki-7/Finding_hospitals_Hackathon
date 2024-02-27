package testCases;


import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import PageObjects.HealthandWellness;

import testBase.setUp;
@Listeners(Utilities.extendreports.class)

public class TC_03_HealthandWellness extends setUp {

	@Test(groups= {"smoke","master"})
	public void verify_details() throws InterruptedException, IOException
	{
		logger.info("***********Starting TC_03_HealthandWellness**********");
		HealthandWellness hw = new HealthandWellness(driver);
		
		hw.click_forCorporates();
		logger.info("Clicked on forCorporates");
		hw.click_healthandWellnessPlans();
		logger.info("Clicked on health and wellness");
		logger.info("Entering the details");
		setUp.getProperties();
		String nme=p.getProperty("name");
		hw.set_name(nme);
		String orgnme=p.getProperty("org_name");
		hw.set_organizationName(orgnme);
		String cntnme=p.getProperty("cnt_num");
		hw.set_contactNumber(cntnme);
		String invmail=p.getProperty("invalid_mail");
		hw.set_invalid_officialEmailID(invmail);
		hw.click_dropdown1();
		hw.click_dropdown2();
		hw.verify_scheduleADemo_btn();
		String vmail=p.getProperty("valid_mail");
		hw.set_valid_officialEmailID(vmail);
		hw.verify_scheduleADemo_btn();
		Thread.sleep(3000);
		hw.verify_thankyou();
		logger.info("***********Finished with TC_03_HealthandWellness**********");
	}	
}
