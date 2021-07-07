package parts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Part8_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
	//using SELECT class	
		WebElement Drp=driver.findElement(By.id("select-demo"));
		
		Select day=new Select(Drp);
	/*	
		day.selectByVisibleText("Tuesday");
		day.selectByValue("Thursday");
		day.selectByIndex(6);
		
	*/	
		
	//Without methods- 
		
		List<WebElement>alloptions=day.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Tuesday"))
			{
				option.click();
				break;
			}
		}
		
		
	}

}
