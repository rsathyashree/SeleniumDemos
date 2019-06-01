package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		String URL = js.executeScript("return document.URL").toString();
		System.out.println(URL);
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
	}

}
