package com.in28minutes.pabeobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TodoBasicTest2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void loginPageObject() {
		driver.get("https://bulma.io/documentation/form/input/");
		
		ToDoPage page = PageFactory.initElements(driver, ToDoPage.class);
		
		//driver.findElement(By.className("is-link").getAttribute("type"));
		System.out.println(page.link.getAttribute("type"));//text
		//driver.findElement(By.className("is-info").getAttribute("type"));
		System.out.println(page.info.getAttribute("type"));//text
	}
	@Test
	public void upadteTodo() {
		driver.get("https://bulma.io/documentation/form/input/");
		
		ToDoPage page = PageFactory.initElements(driver, ToDoPage.class);
		page.enterText("sartarus@mail.bg", "hugoboss", "random text");
		
		sleep(5);
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
