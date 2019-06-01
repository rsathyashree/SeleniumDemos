package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://realestate.upskills.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
	}

}
