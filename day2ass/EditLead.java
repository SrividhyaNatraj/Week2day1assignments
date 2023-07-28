package week2.day2ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		WebElement findElement = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		findElement.sendKeys("Sri");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='10976']")).click();
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		if(title.equals("View Lead | opentaps CRM"))
			System.out.println("Title Verified");
		else
			System.out.println("Title not Verified");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Selenium Automation");
		driver.findElement(By.name("submitButton")).click();
		WebElement findElement3 = driver.findElement(By.id("viewLead_companyName_sp"));
		 String company = findElement3.getText();
		 System.out.println(company);
			if(company.contains("Selenium Automation"))
				System.out.println("Company Name Changed");
			else
				System.out.println("Company Name not changed");
			Thread.sleep(2000);
			driver.close();
		
	}

}
