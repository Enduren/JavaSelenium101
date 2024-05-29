package callDrivers1;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import practice101drivers.makeDrivers;

public class assertion101 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeDrivers callDriver = new makeDrivers();

		// Call the setupBrowser method to initialize the driver
		callDriver.setupBrowser("chrome", "https://www.automationtesting.co.uk");

		// Define WebDriverWait with a timeout of 10 seconds
		WebDriverWait wait = new WebDriverWait(callDriver.getDriver(), Duration.ofSeconds(20));

		///html[1]/head[1]/title[1]
		
		String pageTitle = callDriver.getDriver().getTitle();
		
		String expectedTitle = "Homepage";
		
		Assert.assertEquals(expectedTitle, pageTitle);
		
		
		
		callDriver.getDriver().close();
		
		

	}

}
