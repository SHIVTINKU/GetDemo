package stepDefinations;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Test {
	
	@Given("Add Place PayLoad {string} and {string} and {string}")
	public void add_Place_PayLoad_and_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User calls {string} with {string} Http request")
	public void user_calls_with_Http_request(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the API Call is Success with status code {string}")
	public void the_API_Call_is_Success_with_status_code(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("{string} is response body is {string}")
	public void is_response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_Id_created_maps_to_using(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	@Given("Add Place PayLoad name and address and language")
	public void add_Place_PayLoad_name_and_address_and_language(DataTable dataTable) {
	        List<Map<String, String>>l=dataTable.asMaps();
	    throw new cucumber.api.PendingException();
	}


	@Given("DeletePlace Payload")
	public void deleteplace_Payload() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
