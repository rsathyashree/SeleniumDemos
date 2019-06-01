package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows");
		driver.manage().window().maximize();
		//to identify parent window
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window name   " +parentwindow);
		WebElement clickbutton = driver.findElement(By.id("button1"));
		//to click the button multiple times
		for (int i=0; i<3; i++)
		{
			clickbutton.click();
		}

	}

}
