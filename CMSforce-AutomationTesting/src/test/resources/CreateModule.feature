Feature: Create Module

	Background:
		Given The user is on the CMSforce module-creator page
		
	Scenario: Creating a module with a subject
		When The user enters a string for the module
		When The user clicks on submit module
		Then The success alert should display
		
	Scenario: Creating a module with no subject
		When The user clicks on submit module
		Then The error alert should display
		
	Scenario: Creating duplicate module
		When The user creates a monster hunter module
		When The user clicks on submit module		
		Then The duplicate subject error allert should display