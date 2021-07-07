package parts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDrpDwn {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		
	/*	
		WebElement EmpDrp=driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		Select EmpDrpDwns=new Select(EmpDrp);
		EmpDrpDwns.selectByValue("101 - 150");
		
		WebElement IndDrp=driver.findElement(By.id("Form_submitForm_Industry"));
		Select IndDrpDwns=new Select(IndDrp);
		IndDrpDwns.selectByValue("Electronics");
		
		WebElement ContDrp=driver.findElement(By.id("Form_submitForm_Country"));
		Select ContDrpDwns=new Select(ContDrp);
		ContDrpDwns.selectByValue("Andorra");                */
		
		
		
// use a generic method
		WebElement EmpDrp=driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		selectFromDrpDown(EmpDrp,"101 - 150");
		
		WebElement IndDrp=driver.findElement(By.id("Form_submitForm_Industry"));
		selectFromDrpDown(IndDrp,"Electronics");
		
		WebElement ContDrp=driver.findElement(By.id("Form_submitForm_Country"));
		selectFromDrpDown(ContDrp,"Andorra");
		
		
	}
	
	public static void selectFromDrpDown(WebElement ele,String value)
	{
		Select DrpDown=new Select(ele);
		
		List<WebElement>alloptions=DrpDown.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
		
		
		
	}

}
