package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestCaseDemo extends BaseTest {
	@Test
	public void login() throws InterruptedException {

		driver.findElement(By.id(loc.getProperty("username"))).sendKeys("standard_user");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("secret_sauce");
		driver.findElement(By.id(loc.getProperty("loginButton"))).click();

	}

	@Test
	public static void CountItems() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		 List<WebElement> list = driver.findElements(By.cssSelector("[class=\"inventory_item_name\"]"));
		int itemsCount = list.size();
		System.out.println(itemsCount);
	}
	@Test
	public static void GetTitle() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}