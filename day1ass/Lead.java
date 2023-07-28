package week2.day1ass;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	public class Lead {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NSV");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vidhya");
	    WebElement drop=driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select op=new Select(drop);
	    op.selectByVisibleText("Employee");
	    WebElement drops=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select ops=new Select(drops);
	    ops.selectByValue("9001");
	    WebElement ownershipDropdown =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select id=new Select(ownershipDropdown );
	    id.selectByIndex(5);
	    WebElement currencyDropdown =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select currencySelect=new Select(currencyDropdown );
	    
	    currencySelect.selectByVisibleText("India");
	    driver.findElement(By.name("submitButton")).click();
	    String pageTitle = driver.getTitle();
        System.out.println("Resulting Page Title: " + pageTitle);
			Thread.sleep(5000);
			driver.close();
			
			
		}
}
