package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders() {
        request =  RestAssured.given()
                .header("Content-type","application/json")
                .header("Accept","application/json")
                .header("Authorization","Bearer 276fffa632f72e79f84ddb103fa6531ad16d45e0c899ef11ca1fcac722071290");
    }

    public static Response getListUsers(String endpoint) {
        System.out.println("endpoint yang dilempar: " + endpoint);
        setupHeaders();
        return request.when().get(endpoint);
    }
}
