Feature: Search for subject

	#This runs before every step
	Background:
		Given The user is on the CMSforce finder page

	Scenario: Searching All
		When The user clicks on the all radio button
		When The user clicks on search button
		Then Contents from the database should be returned


	
	Scenario: Searching by module only
		When The user clicks on the all radio button
		When The user selects a list of modules
		When The user clicks on search button
		Then Contents from the database should be returned
		
	Scenario: Searching with all fields
		When The user types a title into the search bar
		When The user clicks on the all radio button
		When The user selects a list of modules
		When The user clicks on search button
		Then Contents from the database should be returned