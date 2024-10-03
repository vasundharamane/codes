package org.practiceList.selenium;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

public class ConvertToListOfObj {
    public static void main(String[] args) {
       Response response =  RestAssured.given()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then().extract().response();

        System.out.println(response.prettyPrint());

        System.out.println("print all ids");

        List<String> ls = response.jsonPath().getList("id");
        System.out.println(ls);
    }
}
