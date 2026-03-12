package com.tests;

import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.*;
import java.util.HashMap;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
public class PostWithSimpleJsonObject {

	public static void main(String[] args) {
		//To send request body
		 // JSONObject - java class dependency google.json.simple
		HashMap<Object,Object>mainJson = new JSONObject();
		HashMap<Object,Object>subJson = new JSONObject();
		mainJson.put("firstname", "Ashish");
		mainJson.put("lastname", "Amrute");
		mainJson.put("totalprice", 500);
		mainJson.put("depositpaid", true);
		mainJson.put("additionalneeds", "Breakfast");
		mainJson.put("bookingdates", subJson);
		
		subJson.put("checkin", "2025-02-25");
		subJson.put("checkout", "2026-02-25");
		
		baseURI= "https://restful-booker.herokuapp.com";
		Response res = given().contentType(ContentType.JSON)
		.body(mainJson.toString())
		.when()
		.post("/booking")
		.then()
		.assertThat()
		.statusCode(200)
		.body("booking.firstname",Matchers.equalTo("Ashish"))
		.body("booking.totalprice", Matchers.equalTo(500))
		.body("booking.bookingdates.checkin", Matchers.equalTo("2025-02-25"))
		.log().all()
		.extract().response();
		
		int value=res.path("booking.totalprice");
		
		Assert.assertTrue(value==500);
		System.out.println(value);
		

	}

}
