package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Steps {

	static Response rsp;
	static String baseURI;
	static String basePath;

	@Given("^given a url$")
	public void given_a_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		baseURI = "https://restcountries.eu/";
		basePath = "rest/v2";

	}

	@When("^We hit url$")
	public void we_hit_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		rsp = RestAssured.given().baseUri(baseURI).basePath(basePath).pathParam("countryName", "Australia")
				.get("/name/{countryName}").then().using().extract().response();
	}

	@Then("^check the response$")
	public void check_the_response() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		System.out.println(rsp.asString());
		Assert.assertEquals(rsp.getStatusCode(), 200);

	}

}
