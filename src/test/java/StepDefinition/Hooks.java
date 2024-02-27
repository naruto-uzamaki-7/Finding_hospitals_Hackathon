package StepDefinition;


import java.time.Duration;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
	public WebDriver driver;
	
	@Before
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.practo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		
	}
	@After
	public void quit()
	{
		driver.quit();
	}
}
