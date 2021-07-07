package parts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part6_FindElement_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//FIND ELEMENT- cases		
		
		//CASE-1: findElement- single web element
		driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("abc");
		
		//CASE-2: Displays only the first element out of all list
		WebElement ele= driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		
		//CASE-3: search for element not in page- Negative case
		// WebElement Search=driver.findElement(By.xpath("//*[@id='small-search-box-form']/search"));
		
		
//FIND ELEMENTS - cases- Returns multiple elements
		
	List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	System.out.println("No of elements captured:" + links.size());
		
	// now get all items in the list- i.e perform an action on these items
	for(WebElement eachElement:links)
	{
		System.out.println(eachElement.getText());
	}
		
		
	}

}
