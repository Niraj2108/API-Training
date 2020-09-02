package com.niraj;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(ListenerClass.class)
public class Sample_Test {

	@Test
	public void TestGetMethod() {

		/*
		 * RestAssured.baseURI = "https://reqres.in"; RestAssured.basePath = "/api/";
		 * 
		 * // This is base url and base path
		 * 
		 * RequestSpecification req = RestAssured.given();
		 * 
		 * Response rsp = req.request(Method.GET, "/users/2");
		 * 
		 * //System.out.println(rsp.asString());
		 * 
		 * rsp.prettyPrint();
		 * 
		 * AssertJUnit.assertEquals(rsp.getStatusCode(), 200);
		 */

		Response rsp =  given().
	    when().
	        get("https://reqres.in/api/users/2").
	    then().using().extract().response();
		
		Assert.assertEquals(rsp.getStatusCode(), 200);
	       
		rsp.prettyPrint();
	}

}
