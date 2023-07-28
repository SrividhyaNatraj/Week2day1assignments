package week2.day1ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Accountsri");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");		
	    driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Software Company");
	    driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("www.Software.com");
	    driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("20000000");    
	    WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select options=new Select(industry);
		options.selectByVisibleText("Computer Software");
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select op=new Select(source);
		op.selectByValue("LEAD_EMPLOYEE");
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select opt=new Select(campaign);
		opt.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select ops=new Select(state);
		ops.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click(); 
	
		
		
	}
	
		
}
