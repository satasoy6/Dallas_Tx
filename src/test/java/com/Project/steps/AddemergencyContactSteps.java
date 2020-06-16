package com.Project.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Project.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddemergencyContactSteps extends CommonMethods{

	@Given("user search Employee {string}")
	public void user_search_Employee(String Id) {
		waitForClickability(cdetails.seachById);
		sendText(cdetails.seachById,Id);
		wait(2);
		click(cdetails.searchBtn);
		click(cdetails.searchResult);
	}
	
	@Then("click on Emergency Contacts")
	public void click_on_Emergency_Contacts() {
	   emergencyContact.emrgncyContact.click();
	}
	@Then("click on Add button")
	public void click_on_Add_button() {
	   jsClick(emergencyContact.addButton);
	}
	@When("user add information {string},{string},{string},{string},{string}")
	public void user_add_information(String Name, String Relationship, String HomeTelephone, String Mobile, String WorkTelephone) {
		emergencyContact.sendInfo(Name, Relationship, HomeTelephone, Mobile, WorkTelephone);
	}
	@Then("click on save button")
	public void click_on_save_button() {
		click(emergencyContact.saveBtn);
	}
	
//	@Then(“user add information {string},{string},{string},{string},{string}“)
//	public void user_add_information(String name, String relationShip, String homePho, String mob, String workPho) {
//		emergencyContact.sendInfo(name, relationShip, homePho, mob, workPho);
//		WebElement display = driver.findElement(By.xpath(“div[@id=‘listEmegrencyContact’]//h1”));
//		Assert.assertTrue(display.isDisplayed());
//	}
//	@Then(“user search Employee by name {string}“)
//	public void user_search_Employee_by_name(String string) {
//	  
//	}
//	@Then(“user click to Employee name in the table”)
//	public void user_click_to_Employee_name_in_the_table() {
//	  
//	}
}
