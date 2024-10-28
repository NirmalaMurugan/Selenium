package week3.day1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {

		// initiating driver and loading webpage.
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");

		// Traversing through webelements.
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']/span")).click();
		WebElement Men = driver.findElement(By.xpath("(//input[@id='Men']/following-sibling::label)[1]"));
		Men.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//li[@class='rilrtl-list-item']/div/div[@class='facet-linkhead']/label[contains(text(),'Fashion Bags')]"))
				.click();
		String CountItems = driver.findElement(By.xpath("//div[@class='length']//strong[1]")).getText();
		System.out.println("count" + CountItems);

		List<WebElement> CountBrand = driver.findElements(By.className("brand"));
		int sizeBrandname = CountBrand.size();
		System.out.println("No of a brands in the webpage: " + sizeBrandname);

		for (int i = 0; i < CountBrand.size(); i++) {

			String text = CountBrand.get(i).getText();
			System.out.println(text);

		}
		List<WebElement> BagName = driver.findElements(By.className("nameCls"));
		int sizeBagname = BagName.size();
		System.out.println("No of a Bags selected in the webpage: " + sizeBagname);

		for (int i = 0; i < BagName.size(); i++) {

			String text = BagName.get(i).getText();
			System.out.println(text);

		}
		driver.close();
	}
}
