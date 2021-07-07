package parts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part14_CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		
	//1. CASE 1: Select any specific checkbox
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		
	//2. CASE 2: Select all check boxes
		List<WebElement> AllElements=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(WebElement ele:AllElements)
		{
			ele.click();
		}
	
		
	// CASE 3: Select any 2 specific checkboxes
		List<WebElement> AllElements2=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(WebElement ele2:AllElements2)
		{
			if(ele2.getAttribute("id").equals("monday") ||ele2.getAttribute("id").equals("sunday") )
			{
				ele2.click();
			}
			
			
		
	//CASE 4: Select the last 2 elements
		List<WebElement> AllElements3=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int noOfEle= AllElements3.size();
		
		for(int i=noOfEle-2;i<noOfEle;i++)
		{
			AllElements3.get(i).click();
		}
		
		}
		
	
	//CASE 5: Select the first 3 elements
		List<WebElement> AllElements4=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int noOfEle= AllElements4.size();
		
		for(int i=0;i<noOfEle;i++)
		{
			if(i<3)
			{
				AllElements4.get(i).click();
			}
		}
				
		}
		
		
		
	

}
