package callDrivers1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice101drivers.makeDrivers;

public class implicitWait101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeDrivers callDriver = new makeDrivers();

		// Call the setupBrowser method to initialize the driver
		//callDriver.setupBrowser("firefox", "https://teststore.automationtesting.co.uk/index.php");
		callDriver.setupBrowser("firefox", "https://www.automationtesting.co.uk");
		//
		
		// Define WebDriverWait with a timeout of 10 seconds
		WebDriverWait wait = new WebDriverWait(callDriver.getDriver(), Duration.ofSeconds(20));

		///html[1]/head[1]/title[1]
		WebElement toogleButton = callDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/a[2]/span"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(".mobile-hidden")));
		toogleButton.click();
		 callDriver.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[13]/a")).click();
		
	
		WebElement loadingButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loaderBtn\"]")));
		
		loadingButton.click();
		callDriver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement afterText = callDriver.getDriver().findElement(By.xpath("//*[@id=\"p_wording\"]"));
		
		
		System.out.println(afterText.getText());
		
		callDriver.getDriver().close();

	}

}
