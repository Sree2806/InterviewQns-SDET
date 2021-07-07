package parts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		/*can use WEBDRIVER MANAGER- only in case of Maven- instead of downloading all drivers
		WebDriverManager.chromedriver().setup();
		*/		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sreelakshmisuresh@gmail.com");
        // driver.findElement(By.name(" "));
        //driver.findElement(By.className(" "));
       
        driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.close();// close current browser
		//driver.quit(); //closes all the browsers- use it while using child windows
		
	}

}
