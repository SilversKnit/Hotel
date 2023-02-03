@Hotel
Feature: Hotel Website Login Functionality
	
	@login
	Scenario Outline: login fuctionality
	Given user Enter "http://adactinhotelapp.com/index.php" To Launch Website  
	When user Enter <username> In The Username
	And user Enter <password> In The Password
	Then user Click Loginbutton For Validation
	
	Examples: 
	
	| username | password |
	| "johndee41" | "Nouse369IO" |
	| "RohnDee45" | "Iouse369IO" |
	| "johndee45" | "Mouse369IO" |
	| "ohndee45" | "Mouse39IO" |
	