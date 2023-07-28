package week2.day2ass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sri");
		driver.findElement(By.name("lastname")).sendKeys("Vidhya");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9629614552");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");
		
		WebElement day = driver.findElement(By.id("day"));
		Select opd = new Select(day);
		opd.selectByVisibleText("11");
				
		WebElement mth = driver.findElement(By.id("month"));
		Select opm = new Select(mth);
		opm.selectByVisibleText("Apr");
		
		WebElement yr = driver.findElement(By.id("year"));
		Select opy = new Select(yr);
		opy.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		}
		
	}

