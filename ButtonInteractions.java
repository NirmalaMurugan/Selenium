package week2.day3;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class ButtonInteractions {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/button.xhtml");

		driver.findElement(By.xpath("//span[text()='Click']")).click();

		// get title and verify, navigate back to home page.
		String PageTitle = driver.getTitle();
		// assertTrue(driver.getTitle().contains("Dashboard"));
		if (driver.getTitle().contains("Dashboard")) {
			System.out.println(PageTitle + " PageTitle is Verified");
		} else {
			System.out.println(PageTitle + " PageTitle is not same as given text");
		}
		driver.navigate().back();// after click navigate to previous page.
		// --------------------

		// Check if element is disabled.
		WebElement element = driver.findElement(By.xpath("//span[text()='Disabled']"));
		boolean Check = element.isEnabled();
		System.out.println(Check);
		// ----------------

		// find position of button.
		WebElement SubmitButton = driver.findElement(By.xpath("//span[text()='Submit']"));
		Point Position = SubmitButton.getLocation();// point DT gives x y coordinates with location method.
		System.out.println("position of the submit button : " + Position);

		WebElement Buttoncolour1 = driver.findElement(By.xpath("//span[text()='Save']"));
		String S1 = Buttoncolour1.getCssValue("position");
		System.out.println(S1);
		// --------------------

		// to find button color
		WebElement Buttoncolour = driver.findElement(By.xpath("//span[text()='Save']"));
		String S = Buttoncolour.getCssValue("color");
		System.out.println(S);
		Color BUTCOL = Color
				.fromString(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
		System.err.println(BUTCOL);
		// --------------------

		// 
		WebElement HeightWidth = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension BtnHeightWidth = HeightWidth.getSize();
		System.out.println(BtnHeightWidth);
		
	}
	
}
