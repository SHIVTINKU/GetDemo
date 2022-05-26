Feature: Validating Place Api 

@AddPlace
Scenario Outline: Verify if Place is being Succesfully added using AddPlaceAPI 

	Given Add Place PayLoad "<name>" and "<address>" and "<language>" 
	
	When User calls "AddPlaceAPI" with "Post" Http request 
	
	Then the API Call is Success with status code "200" 
	
	And "status" is response body is "OK" 
	
	And "scope" is response body is "APP" 
	
	And verify place_Id created maps to "<name>" using "getPlaceAPI" 
	
Examples:
	
		|name  |address    |language|
		|shivam|shastrigali|hindi   |
		#  |azad  |hind       |bharat  |
		
