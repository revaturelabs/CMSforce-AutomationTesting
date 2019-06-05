Feature: Search for subject

	#This runs before every step
	Background:
		Given The user is on the CMSforce finder page

#	Scenario Outline: Searching
#		#Given The user is on the Wikipedia page
#		When The user types "<query>" into the search bar
#		When The user clicks on search button
#		Then The title should be "<title>"
#		
#		Examples:
#		|query|title|
#		|macaroni|Macaroni - Wikipedia|

	Scenario: Searching by title and format only
		When The user types "<title>" into the search bar
		When The user selects a "<format>" radio button
		When The user clicks on search button
		Then The result should be "<contentID>"
		
#		Examples:
#		|title|format|contentID|
	
	Scenario: Searching by module only
		When The user selects a list of modules
		When The user clicks on search button
		Then The result should be "<contentID>"
		
	Scenario: Searching with all fields
		When The user types "<title>" into the search bar
		When The user selects a "<format>" radio button
		When The user selects a list of modules
		When The user clicks on search button
		Then The result should be "<contentID>"