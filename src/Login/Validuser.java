package Login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validuser {
	public static WebDriver driver;

	@Test
	public void case1() throws InterruptedException {
		System.out.println(" Executing SAF urls first time..");
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://teammigrate:18080/#/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("hprasad");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-login")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void case2() throws InterruptedException {
		System.out.println(" Executing SAF urls second time with negative input.");
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://teammigrate:18080/#/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("hprasad");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector(".btn.btn-login")).click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Title";
		assertEquals(actualTitle, expectedTitle);
		driver.close();
	}

}
