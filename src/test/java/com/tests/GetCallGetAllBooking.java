package com.tests;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetCallGetAllBooking {

	public static void main(String[] args) {
		getAllBookingReturnType();
		getAllBookingBDD();

	}
	
	static void getAllBookingReturnType() {
		RequestSpecification requestSpec = given().baseUri("https://restful-booker.herokuapp.com/")
		.header("Content-Type","application/json");
		
		RequestSpecification request =requestSpec.when();
		
		Response Resp = request.get("/booking");
		
		ValidatableResponse valResp = Resp.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK"); 
		Response response= valResp.extract().response();
		System.out.println(response.asPrettyString());
	}

	static void getAllBookingBDD()  {
		given().baseUri("https://restful-booker.herokuapp.com/")
		.header("Content-Type","application/json")
		.when()
		.get("/booking")
		.then()
		.assertThat()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().body();              
	}
}
