Feature: Search for subject

	#This runs before every step
	Background:
		Given The user is on the Wikipedia home page

	Scenario Outline: Searching
		#Given The user is on the Wikipedia page
		When The user types "<query>" into the search bar
		When The user clicks on search button
		Then The title should be "<title>"
		
		Examples:
		|query|title|
		|macaroni|Macaroni - Wikipedia|