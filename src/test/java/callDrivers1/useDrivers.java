package callDrivers1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice101drivers.makeDrivers;

public class useDrivers extends makeDrivers {

	public static void main(String[] args) {
		// Create an instance of the makeDrivers class
		makeDrivers callDriver = new makeDrivers();

		// Call the setupBrowser method to initialize the driver
		callDriver.setupBrowser("chrome", "https://www.automationtesting.co.uk");

		// Define WebDriverWait with a timeout of 10 seconds
		WebDriverWait wait = new WebDriverWait(callDriver.getDriver(), Duration.ofSeconds(20));

//        // Wait for the contactUs element to be clickable make separate class
//        WebElement contactUs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Contact Us Form Test')]")));
//        
//        // Click on the contactUs element
//        contactUs.click();
//        
//        // Find the first name input field and type "Dexx"
//        WebElement firstNameField = callDriver.getDriver().findElement(By.xpath("//*[@id='contact_form']/input[1]"));
//        firstNameField.sendKeys("Dexx");
//        
//        WebElement lastName = callDriver.getDriver().findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
//        lastName.sendKeys("Testing");
//        
//        WebElement email = callDriver.getDriver().findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
//        email.sendKeys("tester@example.com");
//        
//        WebElement comments = callDriver.getDriver().findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
//        comments.sendKeys("tester comments 101");
//        
//        WebElement submitButton = callDriver.getDriver().findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
//        submitButton.click();
//        

		// Wait for the dropDownCheckbox element to be clickable make separate class
		WebElement dropDownCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/ul/li[9]/a")));
		dropDownCheckbox.click();

		WebElement redCheckBox = callDriver.getDriver().findElement(By.xpath("//input[@id='cb_red']"));

		System.out.println(redCheckBox.isSelected());

		WebElement greenCheckBox = callDriver.getDriver().findElement(By.xpath("//input[@id='cb_green']"));
		// WebElement greenCheckBox =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='cb_green']")));

		System.out.println("green check box result " + greenCheckBox.isSelected());

		// WebElement selectCar =
		// callDriver.getDriver().findElement(By.xpath("//*[@id=\"cars\"]"));

		Select selectCar = new Select(callDriver.getDriver().findElement(By.xpath("//select[@id='cars']")));

		selectCar.selectByVisibleText("BMW");

		// Close the browser
		//callDriver.getDriver().close();
	}
}
