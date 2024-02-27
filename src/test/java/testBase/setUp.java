package testBase;


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class setUp {
	public WebDriver driver;
	public Logger logger;
	static public Properties p;
	
	
	@BeforeClass(groups= {"regression","smoke","master"})
	@Parameters({"os","browser"})
	public void launch(String os,String br) throws IOException
	{  
		getProperties();
		
		//LOADING LOGGERS
		logger=LogManager.getLogger(this.getClass());
		//os and browser
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WINDOWS);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			switch(br.toLowerCase())
			{
			case "chrome":
				driver=new ChromeDriver(); 
				break;
			case "edge" :
				driver=new EdgeDriver();
				break;
			}
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}
		else if (p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			switch(br.toLowerCase())
			{
			case "chrome":
			driver=new ChromeDriver(); 
			break;
			case "edge" :
			driver=new EdgeDriver();
			break;
			}
		}
		
		
		driver.manage().window().maximize();
		driver.get(p.getProperty("appURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
		
	
	@AfterClass(groups= {"regression","smoke","master"})
	public void quit()
	{
		driver.quit();
	}
	public static Properties getProperties() throws IOException
	{
		//LOADING PROPERTIES FILE
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		return p;
	}
}
