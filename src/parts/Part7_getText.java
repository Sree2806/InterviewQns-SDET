package parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part7_getText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		
		
	/*	WebElement mail=driver.findElement(By.id("Email"));
		mail.clear();
		mail.sendKeys("Sree@gmail.com");
		
		//capture text from input box
		System.out.println("Value present in textbox by default is:" + mail.getAttribute("value"));
		
		System.out.println("Result from getText is: " + mail.getText());
		
		*/
	
		WebElement login= driver.findElement(By.tagName("button"));
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getText());
		
		String title= driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
	System.out.println("Title of page is: "+ title);
	}

}
