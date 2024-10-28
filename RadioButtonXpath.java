package week2.day3;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/radio.xhtml");

		// 1. Select browser by clicking radio button.
		WebElement browser = driver
				.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]"));
		// span[contains(@class,'ui-radiobutton-icon')]/preceding-sibling::div [14th match] so absolute xpath.
		browser.click();
		boolean isEnabledButton = browser.isEnabled();
		assertEquals(isEnabledButton, true);
		System.out.println("Ensuring Browser is Enabled: " + isEnabledButton);

		// 3. Identify the radio button that is initially selected by default.
		boolean radio = driver.findElement(By.xpath("//input[@checked='checked']")).isSelected();
		System.out.println("Browser button is clicked" + radio);

		// 4. Check and select the age group (21-40 Years) if not already selected.
		WebElement Buttonchecked = driver.findElement(By.xpath(" (//input[@checked='checked'])[5]"));
		boolean BC = Buttonchecked.isSelected();
		System.out.println("Ensuring Agegroup Radio button 21-40 years is already Checked: " + BC);
		if (BC == false) {
			Buttonchecked.click();
		} else {
			System.out.println("Radio button is already checked");
		}

	}

}
