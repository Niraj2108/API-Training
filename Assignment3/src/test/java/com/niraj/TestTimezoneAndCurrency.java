package com.niraj;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.HashMap;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestTimezoneAndCurrency {
	
	@Test
	public void extractTimezoneandCurrency() throws ParseException {

		Response rsp = RestAssured.given().when().get("https://restcountries.eu/rest/v2/name/Australia").then().using().extract()
				.response();

		JsonPath extractor = rsp.jsonPath();
		List<HashMap<String,String>> timezones = extractor.get("timezones");
		List<HashMap<String,String>> currencies = extractor.get("currencies");
		
		
		System.out.println("Timezones are : " + timezones);
		System.out.println("Currencies are : " + currencies);
		AssertJUnit.assertEquals(rsp.getStatusCode(), 200);
	}

}
