package week2.day1ass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLead {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("nsv");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vidhya");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("srv");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("vlsi");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("groupwork");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srividhyanatraj@gmail.com");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click(); 
		String pageTitle = driver.getTitle();
        System.out.println("Resulting Page Title: " + pageTitle);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement duplicateButton = driver.findElement(By.id("createLeadForm_companyName"));
		duplicateButton.clear();
	    duplicateButton.sendKeys("vsn");
	    WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	    firstName.clear();
        firstName.sendKeys("yadh");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click(); 
		String pageTitles = driver.getTitle();
        System.out.println("Resulting Page Title: " + pageTitles);
	}
	
}
