Feature: Wikipedia Languages

	Scenario: English Wikipedia
		Given The user is on the Wikipedia home page
		When The user clicks on English
		Then The user should be on the English home page
		
	Scenario: German Wikipedia
		Given The user is on the Wikipedia home page
		When The user clicks on German
		Then The user should be on the German home page