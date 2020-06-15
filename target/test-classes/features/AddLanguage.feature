#Author:adilek.26@gmail.com

Feature: Adding Language Qualification


@inProgress
Scenario:  user should be able to add different languages in qualifications
Given user is logged with valid admin credentials
And As an Admin  navigates to Qualifications and Languages 
And user  click to add button
And create a name and save
Then language name succesfuly added




