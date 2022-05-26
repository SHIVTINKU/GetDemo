package stepDefinations;

import cucumber.api.java.Before;

public class Hooks {
	
	
	@Before("@DeletePlace")
	public void preConditions()
	{
		StepDefination_AddPlace s= new StepDefination_AddPlace();
		
		if(s.placeId==null)
		{
			
			s.add_Place_PayLoad("eoo", "d", "jekfc");
			
			s.user_calls_with_Http_request("AddPlaceAPI", "post");
			
			s.verify_place_Id_created_maps_to_using("eoo", "getPlaceAPI");
		}
		
	}
	

}
