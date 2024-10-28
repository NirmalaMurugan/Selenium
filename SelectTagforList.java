package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectTagforList {

		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");

			// Login/Sign-up
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa"); // crmsfa
			driver.findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(2000);

			// navigate through webpage
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			//createLeadForm_dataSourceId
			//WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//Select opt = new Select(source);
			//opt.selectByIndex(6);
			//opt.selectByValue("LEAD_EXISTCUST");
			//opt.deselectByVisibleText("Existing Customer");
			
			WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select opt1 = new Select(marketingCampaign);
			//opt1.selectByIndex(2);
			opt1.selectByValue("CATRQ_AUTOMOBILE");
			//opt1.deselectByVisibleText("Automobile");
			
			WebElement PreferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select opt2 = new Select(PreferredCurrency);
			//opt2.selectByIndex(2);
			opt2.selectByValue("KPW");
			//opt2.deselectByVisibleText("KPW - North Korean Won");
			Thread.sleep(2000);		
			driver.close();


		}
}


