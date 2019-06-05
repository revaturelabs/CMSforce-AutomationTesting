Feature: Searching for a content

	Scenario: Searching for all contents
		Given The user is on the search content page
		When The user clicks on the search button
		Then All contents from the database should be returned