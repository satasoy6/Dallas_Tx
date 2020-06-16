package com.Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.utils.CommonMethods;

public class AddEmergencyElements extends CommonMethods{

	@FindBy (xpath ="//div[@id='sidebar']/ul/li[3]/a")
	public WebElement emrgncyContact;
	
	@FindBy (xpath="//input[@id='btnAddContact']")
	public WebElement addButton;
	
	@FindBy(id="emgcontacts_name")
	public WebElement Addname;
	
	@FindBy(id="emgcontacts_relationship")
	public WebElement relationship;
	
	@FindBy(id="emgcontacts_homePhone")
	public WebElement homeTel;
	
	@FindBy(id="emgcontacts_mobilePhone")
	public WebElement mobile;
	
	@FindBy(id="emgcontacts_workPhone")
	public WebElement workTel;
	
	@FindBy(id="btnSaveEContact")
	public WebElement saveBtn;
	
	@FindBy (className="emgContactName")
	public WebElement confirm;
	
	
	public AddEmergencyElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void sendInfo(String name, String relationShip, String homePho, String mob, String workPho) {
		sendText(Addname,name);
		wait(2);
		sendText(relationship,relationShip );
		wait(2);
		sendText(homeTel,homePho);
		wait(2);
		sendText(mobile,mob);
		wait(2);
		sendText(workTel,workPho);
		wait(2);
		
	}
	
	
}
