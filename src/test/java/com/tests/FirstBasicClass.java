package com.tests;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FirstBasicClass {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://simple-books-api.glitch.me";
		Response res = RestAssured.get("/books?type=non-fiction");
		System.out.println(res.asPrettyString());
		Assert.assertTrue(res.statusCode() == 200);
		Assert.assertEquals(200, res.statusCode());
		Assert.assertEquals("HTTP/1.1 200 OK", res.getStatusLine());
		
		
/*
 given() returns RequestSpecification object
all the methods in given section returns RequestSpecification object
Thats why all the given methods are used in chain.
 
when method can be used with RequestSpecification object
when method returns RequestSpecification object
 
all the HTTP methods return Response object.
 
then() method is applied with Response object.
then() method and all the methods in then section returns validatbleResponse object.
validatbleResponse object can be converted into Response object using extract().response() method.
 */

	}

}
