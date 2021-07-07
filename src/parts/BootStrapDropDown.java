package parts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	//i.e. Drop down elements not inside a select tag, but inside  <a> tag
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
	//first DDL	
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		List<WebElement>ProductType=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("No of elements in drp Down: "+ProductType.size());
		
		for(WebElement options:ProductType)
		{
			if(options.getText().equals("Accounts"))
			{
				options.click();
				break;
			}
			
		}
		
		
	//Second DDL
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		
		List<WebElement>Product=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		for(WebElement Poptions:Product)
		{
			if(Poptions.getText().equals("Savings Accounts"))
			{
				Poptions.click();
			}
		}
		
	}

}
