package com.Project.steps;

import com.Project.utils.CommonMethods;
import com.Project.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContactDetailsSteps extends CommonMethods {

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_in_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@Given("navigate to employee list")
	public void navigate_to_employee_list() {
		dashboard.navigateToEmployeeList();
		wait(2);
	}

	@Then("admin search employee {string}")
	public void search_by_employee_name_and_click_on_search(String employee) {
		waitForClickability(cdetails.searchByName);
//		jsClick(cdetails.searchByName);
		sendText(cdetails.searchByName,employee);
		wait(2);
		click(cdetails.searchBtn);
		click(cdetails.searchResult);
	}


	@Then("click on contact details")
	public void click_on_contact_details() {
		click(cdetails.contactDetails);
	}

	@Then("click on edit and enter contact details")
	public void click_on_edit_and_enter_contact_details() {
		click(cdetails.editOrSaveBtn);
		sendText(cdetails.address1,"450 Pittman Rd");
		sendText(cdetails.address2,"Apt 536");
		sendText(cdetails.city,"Fairfield");

		selectDdValue(cdetails.state,"California");
		sendText(cdetails.zipCode,"94534");
		click(cdetails.country);
		selectDdValue(cdetails.country,"United States");

		sendText(cdetails.homeTel,"8008008080");
		sendText(cdetails.mobile,"2016737070");
		sendText(cdetails.workTel,"2126667788");
		sendText(cdetails.workEmail,"kingcasting@cast.com");
		sendText(cdetails.otherEmail,"bradley@gmail.com");
		
	}

	@Then("click on save")
	public void click_on_save() {
		click(cdetails.editOrSaveBtn);
	}

}
