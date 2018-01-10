package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;


public class GridHubWithWebDriverNode {

	@BeforeTest
	public void test() throws MalformedURLException
	{
		//Before this, run in cmd java -jar selenium-server-standalone-2.50.0.jar -role hub
		//By default port no is 4444 for hub
		//Also, run java -jar selenium-server-standalone-2.50.0.jar -role node -hub http://localhost:4444/grid/register
		//By default port no is 5555 for node
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		driver.get("https://www.google.com/");
	}
	
}
