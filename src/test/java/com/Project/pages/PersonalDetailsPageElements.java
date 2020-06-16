

package com.Project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.testbase.BaseClass;

public class PersonalDetailsPageElements {
	
@FindBy(id="personal_cmbNation")
WebElement nationaltyDD;

@FindBy(name="personal[optGender]")
public List<WebElement> genderRadioGroup;

@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
public WebElement lblPersonalDetails;

@FindBy(id = "personal_txtEmployeeId")
public WebElement employeeId;

@FindBy(xpath="//div[@id='profile-pic']//h1")
public WebElement profilePic;

@FindBy(xpath="//ul[@id='sidenav']/li")
public List<WebElement > persDetailDD ;

@FindBy(xpath="//div[@id='sidebar']/ul/li[4]")
public WebElement dependent;

public PersonalDetailsPageElements() {//Constractor to initilize 
	PageFactory.initElements(BaseClass.driver, this);
}
}
