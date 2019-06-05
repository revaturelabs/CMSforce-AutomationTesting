Feature: Search for subject

	#This runs before every step
	Background:
		Given The user is on the CMSforce finder page

	Scenario: Searching All
		When The user clicks on the all radio button
		When The user clicks on search button
		Then All contents from the database should be returned

#
#	Scenario: Searching by title and format only
#		When The user types title into the search bar
#		When The user selects a format radio button
#		When The user clicks on search button
#		Then The result should be "<contentID>"
#		
##		Examples:
##		|title|format|contentID|
#	
#	Scenario: Searching by module only
#		When The user selects a list of modules
#		When The user clicks on search button
#		Then The result should be "<contentID>"
#		
#	Scenario: Searching with all fields
#		When The user types "<title>" into the search bar
#		When The user selects a "<format>" radio button
#		When The user selects a list of modules
#		When The user clicks on search button
#		Then The result should be "<contentID>"