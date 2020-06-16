package com.Project.pages;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.Project.utils.CommonMethods;
//
//public class AddemergencyContact extends CommonMethods{
//
//	@FindBy (linkText ="Emergency Contacts")
//	public WebElement emergencyContact;
//	
//	@FindBy (id=“btnAddContact”)
//	public WebElement btnAddContact;
//	
//	@FindBy (id=“emgcontacts_name”)
//	public WebElement addName;
//	
//	@FindBy (id=“emgcontacts_relationship”)
//	public WebElement relation;
//	
//	@FindBy (id=“emgcontacts_homePhone”)
//	public WebElement homePhone;
//	
//	@FindBy (id=“emgcontacts_mobilePhone”)
//	public WebElement mobile;
//	
//	@FindBy (id=“emgcontacts_workPhone”)
//	public WebElement workPhone;
//	
//	@FindBy (id=“btnSave”)
//	public WebElement btnSave;
//	
//	
//	public AddEmergencyContact () {
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void clickContactAndEdit() {
//		jsClick(emergencyContact);
//		jsClick(btnAddContact);
//	}
//	public void sendInfo(String name, String relationShip, String homePho, String mob, String workPho) {
//		sendText(addName,name);
//		wait(3);
//		sendText(relation,relationShip );
//		wait(3);
//		sendText(homePhone,homePho);
//		wait(3);
//		sendText(mobile,mob);
//		wait(3);
//		sendText(workPhone,workPho);
//		wait(3);
//		jsClick(btnSave);
//	}
//
//}
