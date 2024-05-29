package callDrivers1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import practice101drivers.makeDrivers;

public class assert101 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				makeDrivers callDriver = new makeDrivers();

				// Call the setupBrowser method to initialize the driver
				//callDriver.setupBrowser("firefox", "https://teststore.automationtesting.co.uk/index.php");
				callDriver.setupBrowser("firefox", "https://www.automationtesting.co.uk");
				//
				Thread.sleep(3000);
				// Define WebDriverWait with a timeout of 10 seconds
				WebDriverWait wait = new WebDriverWait(callDriver.getDriver(), Duration.ofSeconds(20));

				///html[1]/head[1]/title[1]
				WebElement toogleButton = callDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/a[2]/span"));
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(".mobile-hidden")));
				toogleButton.click();
				 callDriver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/nav/ul/li[20]/a")).click();
				
			
				WebElement clothing1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]")));

				clothing1.click();
				
				WebElement addToCart1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]")));
				
				addToCart1.click();

				//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[5]/span[2]
				
				WebElement shirtTotal1 = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[5]/span[2]")));

//						callDriver.getDriver().findElement(By.xpath("//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[5]/span[2]"));
				
				System.out.println(shirtTotal1.getText());
				
				Assert.assertEquals("$26.12", shirtTotal1.getText());
				
				
				callDriver.getDriver().close();

	}

}
