package com.Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.testbase.BaseClass;
import com.Project.utils.CommonMethods;

public class ContactDetailsElements extends CommonMethods{

	@FindBy(id = "empsearch_id")
	public WebElement seachById;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement searchByName;

	@FindBy(xpath = "//ul[@id='sidenav']/li[2]")
	public WebElement contactDetails;
	
	@FindBy(id="btnSave")
	public WebElement editOrSaveBtn; //This element for editing and saving

	@FindBy(id = "contact_street1")
	public WebElement address1;

	@FindBy(id = "contact_street2")
	public WebElement address2;

	@FindBy(id = "contact_city")
	public WebElement city;

	@FindBy(id = "contact_state")
	public WebElement state;

	@FindBy(id = "contact_emp_zipcode")
	public WebElement zipCode;

	@FindBy(id = "contact_country") // dropdown has to be clicked
	public WebElement country;

	@FindBy(id = "contact_emp_hm_telephone")
	public WebElement homeTel;

	@FindBy(id = "contact_emp_mobile")
	public WebElement mobile;

	@FindBy(id = "contact_emp_work_telephone")
	public WebElement workTel;

	@FindBy(id = "contact_emp_work_email")
	public WebElement workEmail;

	@FindBy(id = "contact_emp_oth_email")
	public WebElement otherEmail;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement searchResult;
	
	public ContactDetailsElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
