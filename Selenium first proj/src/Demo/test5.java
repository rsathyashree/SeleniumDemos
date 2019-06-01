package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SathyashreeRamanatha\\Desktop\\Chome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		for(int i=0; i<=8; i++)
		{
			List<WebElement> lists = driver.findElements(By.xpath("//*[@class='mouseOut']"));
			String pagename = lists.get(i).getText();
			lists.get(i).click();
			String pagetitle = driver.getTitle();
			if(pagetitle.startsWith("Under"))
			{
				System.out.println(pagename+"\t" + "is working");
			}
				else
				{
					System.out.println(pagename+ "  is NOT working");
				}
			}
				
			
				
			
		}

	}


