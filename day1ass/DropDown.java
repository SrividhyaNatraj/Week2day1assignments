package week2.day1ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select option = new Select(tool);
		option.selectByVisibleText("Selenium");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='India']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()='Select City']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
                
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='application']//button")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
        driver.findElement(By.xpath("//li[text()='Playwright']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()='Select Language']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='English']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()='Select Values']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Two']")).click();
	}       
}
