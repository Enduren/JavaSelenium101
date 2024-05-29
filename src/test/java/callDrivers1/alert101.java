package callDrivers1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice101drivers.makeDrivers;

public class alert101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeDrivers callDriver = new makeDrivers();

		// Call the setupBrowser method to initialize the driver
		callDriver.setupBrowser("chrome", "https://www.automationtesting.co.uk/popups.html");

		// Define WebDriverWait with a timeout of 10 seconds
		WebDriverWait wait = new WebDriverWait(callDriver.getDriver(), Duration.ofSeconds(20));


		WebElement alertPopup = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Trigger Alert')]")));

		alertPopup.click();
		
		//WebElement getAlert = callDriver.getDriver().findElement(By.xpath("//button[contains(text(),'Trigger Alert')]"));
		callDriver.getDriver().switchTo().alert().accept();
		
		//callDriver.getDriver().close();
	}

}
