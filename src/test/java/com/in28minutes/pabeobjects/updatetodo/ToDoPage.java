package com.in28minutes.pabeobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToDoPage {
	
	WebDriver driver;

	public ToDoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(className="is-link")
	WebElement link;
	
	@FindBy(className="is-info")
	WebElement info;

	@FindBy(className="is-success")
	WebElement success;
	
	public void enterLink(String isLink) {
		link.sendKeys(isLink);
	}
	
	public void enterInfo(String isInfo) {
		info.sendKeys(isInfo);
	}
	
	public void enterSuccess(String isSuccess) {
		success.sendKeys(isSuccess);
	}
	
	public void enterText(String link, String info, String success) {
		enterLink(link);
		enterInfo(info);
		enterSuccess(success);
	}
}
