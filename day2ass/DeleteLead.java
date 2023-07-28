package week2.day2ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		String path = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]";
		WebElement findElement = driver.findElement(By.xpath(path));
		String text = findElement.getText();
		System.out.println("Captured Lead ID: "+text);
		driver.findElement(By.xpath(path)).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Delete")).click();
		//driver.findElement(By.xpath("//a[@text()='subMenuButtonDangerous']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.className("x-paging-info")).getText();
		if (text2.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		}
		
	
		}

