package com.Project.testbase;

import com.Project.pages.AddEmergencyElements;
import com.Project.pages.ContactDetailsElements;
import com.Project.pages.DashboardPageElements;
import com.Project.pages.EmployeeInfoPage;
import com.Project.pages.LoginPageElements;
import com.Project.pages.PersonalDetailsPageElements;
import com.Project.pages.viewDependentsPage;

//Initialize all pages classes and stores reference in static variables
//that will called /used in test classes

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static PersonalDetailsPageElements pdetails;
	public static DashboardPageElements dashboard;
	public static ContactDetailsElements cdetails;
	public static viewDependentsPage depdents;
	public static EmployeeInfoPage empinfo;
	public static AddEmergencyElements emergencyContact;

	public static void initialize() {

		login = new LoginPageElements();
		pdetails = new PersonalDetailsPageElements();
		dashboard = new DashboardPageElements();
		cdetails = new ContactDetailsElements();
		depdents = new viewDependentsPage();
		empinfo = new EmployeeInfoPage();
		emergencyContact = new AddEmergencyElements();
	}

}
