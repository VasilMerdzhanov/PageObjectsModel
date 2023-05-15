package com.in28minutes.pabeobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpdateTodoBasicTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void loginPageObject() {
		driver.get("https://mail.bg/auth/lgn");
		
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		
		//driver.findElement(By.id("imapuser")).getAttribute("type"));
		System.out.println(page.email.getAttribute("type"));//email
		//driver.findElement(By.id("pass")).getAttribute("type"));
		System.out.println(page.password.getAttribute("type"));//password
	}
	@Test
	public void upadteTodo() {
		driver.get("https://mail.bg/auth/lgn");
		
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.login("*****@mail.bg", "*****");
			
		//page.email.sendKeys("*****@mail.bg");
		//page.password.sendKeys("*****");
		
		sleep(1);
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	private void sleep(int i) {
		
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
