package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		WebElement enb = driver.findElement(By.name("userName"));
		if(enb.isEnabled())
		{
			enb.sendKeys("sun");
			Thread.sleep(5000);
			enb.clear();
			Thread.sleep(5000);
			enb.sendKeys("sunil");
		}
		if(enb.isDisplayed())
		{
			driver.findElement(By.name("password")).sendKeys("sunil");
			driver.findElement(By.name("login")).click();
		}
		if(driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		
		
	}

}
