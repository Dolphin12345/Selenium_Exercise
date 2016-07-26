@tag
Feature: Login Rediffmail Page

@tag1
	Scenario: Login with blank Username and Password
		Given Dolphin opens Login Rediffmail page
		When  She clicks on the Go button
		Then The confirmation box should have been displayed "Please enter a valid user name"
@tag2
	Scenario: Login with invalid account
		Given Dolphin opens Login Rediffmail page
		When  She inputs "abc" into the Username
			And She inputs "12345" into the Password
			And She clicks on the Go button
		Then The confirmation box should have been displayed "Wrong username and password combination."
