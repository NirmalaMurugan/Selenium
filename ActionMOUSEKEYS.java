package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMOUSEKEYS {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		//scroll and click.
		WebElement AboutUS = driver.findElement(By.xpath("//a[text()='About Us']"));
		Actions obj = new Actions(driver);
		obj.scrollToElement(AboutUS);
		AboutUS.click();
		System.out.println("Scroll action performed and then about is clicked");
		System.out.println(driver.getTitle());

		driver.close();

		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://www.snapdeal.com/");
		
		//mouse hover and click its options.
		WebElement Electronics = driver1.findElement(By.xpath("//span[text()='Electronics']"));
		Actions obj1 = new Actions(driver1);
		obj1.moveToElement(Electronics).perform();
		System.out.println("Mouse Hover action performed and then about is clicked");
		WebElement speaker = driver1.findElement(By.xpath("//span[text()='2.0 Speakers']"));
		speaker.click();
		System.out.println(driver1.getTitle());
	}

}
