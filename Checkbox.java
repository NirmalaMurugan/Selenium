package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]/parent::div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String disabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::div[@id='j_idt87:j_idt102']")).getText();
		System.out.println(disabled);
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']/parent::div")).click();
		
		WebElement MultiOptions =driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']/li"));
		MultiOptions.click();
		String Display = MultiOptions.getText();
		System.out.println(Display);
		//driver.close();
	}

}
