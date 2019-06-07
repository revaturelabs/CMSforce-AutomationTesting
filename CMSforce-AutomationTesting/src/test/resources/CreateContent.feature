Feature: Create contents

	Background:
		Given The user is on the CMSforce home/create page
		
	Scenario: Creating a content with title, URL, subjects, description, format
		When The user enters a title
		When The user enters a URL
		When The user enters subjects
		When The user enters a description
		When The user selects a format
		When The user clicks on submit content
		Then The successful creation alert should display 
		
	Scenario: Creating a content with title, URL, subjects
		When The user enters a title
		When The user enters a URL
		When The user enters subjects
		When The user clicks on submit content
		Then The successful creation alert should display 

	Scenario: Creating a content with title, URL
		When The user enters a title
		When The user enters a URL
		When The user clicks on submit content
		Then The error creating alert should display
		
	Scenario: Creating a content with just title
		When The user enters a title
		When The user clicks on submit content
		Then The error creating alert should display
		
	Scenario: Creating a content with just URL
		When The user enters a URL
		When The user clicks on submit content
		Then The error creating alert should display 