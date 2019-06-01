package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		/*driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword' and @id='txtPassword']")).sendKeys("admin123");*/
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		Actions button = new Actions(driver);
		button.sendKeys(Keys.ENTER).perform();
		button.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();	
	}

}
