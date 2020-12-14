package org.saritasmesut;

import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingTest {

	@Test
	public void testHelloEndpoint() {
		given().when().get("/greetings").then().statusCode(200).body(is("Hello world"));
	}

}