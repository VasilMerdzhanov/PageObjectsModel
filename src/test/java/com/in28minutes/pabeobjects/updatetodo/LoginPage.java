package com.in28minutes.pabeobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//email text box
	@FindBy(id="imapuser")
	WebElement email;
	
	//password text box
	@FindBy(id="pass")
	WebElement password;
	
	//submit button
	@FindBy(className="login_button")
	WebElement submitButton;
	
	//enterName
	public void enterName(String enterEmail) {
		email.sendKeys(enterEmail);
	}
	
	//enterPassword
	public void enterPassword(String enterPassword) {
		password.sendKeys(enterPassword);
	}
	
	//submit
	public void submit() {
		submitButton.submit();
	}
	
	public void login(String email, String password) {
		enterName(email);
		enterPassword(password);
		submit();
	}
}
