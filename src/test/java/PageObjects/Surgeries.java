package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Surgeries extends BaseClass{
	public Surgeries(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[@class='product-tab__title'][normalize-space()='Surgeries']")
	WebElement surgeries;
	public void click_surgeries()
	{
		surgeries.click();
	}
	
	
	@FindBy(xpath="//div[@class='flex flex-wrap gap-y-44px pb-40px SurgicalSolutions-module_surgeriesList__1gl-I']")
	List<WebElement> list_of_surgeries;
	public void get_list_of_surgeries()
	{
		for(int j=0;j<list_of_surgeries.size();j++)
		{
			System.out.println(list_of_surgeries.get(j).getText());
			System.out.println("");
		}
	}
}
