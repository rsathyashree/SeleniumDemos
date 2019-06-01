package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		String username = driver.findElement(By.name("userName")).getAttribute("value");
		System.out.println(username);
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println("size is" +data.size());
		for (int i=0; i<data.size(); i++)
		{
			System.out.println(data.get(i).getText());
		}
		sel.selectByVisibleText("2");
		WebElement dep = driver.findElement(By.name("fromPort"));
		Select sel1 = new Select(dep);
		sel1.selectByVisibleText("London");
		List<WebElement> city = sel1.getOptions();
		for(int j=0; j<city.size(); j++)
		{
			System.out.println(city.get(j).getText());
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Sathya");
		driver.findElement(By.name("passLast0")).sendKeys("R");
		driver.findElement(By.name("passFirst1")).sendKeys("Ramanathan");
		driver.findElement(By.name("passLast1")).sendKeys("A");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//*[@name='ticketLess' and @value='checkbox']")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Same as')]")).click();
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for (WebElement e: checkbox)
		{
			e.click();
		}
		driver.findElement(By.name("buyFlights")).click();
	}

}
