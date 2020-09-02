package com.niraj;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
@Listeners(ListenerClass.class)
public class POSTMethod {
	
	@Test
	public void TestPostMethod()
	{
		
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api/";
		
		// This is base url and base path
		
		 String requestBody = "{\n" +
		            "  \"name\": \"morpheus\",\n" +
		            "  \"job\": \"leader\"\n" +
		          "}";
		
		Response res = given().contentType("application/json").body(requestBody).when().post("/users")
				.then().using().extract().response();
		
		//ContentType tells which data is passed via HTTP method.
		
		// Add the string data  to the body of the request
		//Post the request and check the response
		
		String body = res.getBody().asString();
		int status = res.getStatusCode();
		//System.out.println(res.getBody().asString());
		res.prettyPrint();
		

		AssertJUnit.assertEquals(status, 201);
	}

}
