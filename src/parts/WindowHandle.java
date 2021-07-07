package parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	//getWindowHandle()
		
	String windowID=driver.getWindowHandle();
	System.out.println(windowID);
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	//getWindowHandles()
		Set<String> windowIDs=driver.getWindowHandles();
		Iterator<String> it=windowIDs.iterator();
		
		String ParentID=it.next();
		String ChildID=it.next();
		
		System.out.println("Parent window ID: "+ParentID);
		System.out.println("Child window ID: "+ChildID);
		
	//Switch to multiple windows
		List<String> windowIDList=new ArrayList(windowIDs);
		for(String winID:windowIDList)
		{
			String Title=driver.switchTo().window(winID).getTitle();
			System.out.println(Title);
			if(Title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
	/*	driver.close();
		driver.quit();				*/
		
		
		
	
	}

}
