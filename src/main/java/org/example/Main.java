package org.example;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;


public class Main {

    public static void getResponseBody(){
        Response res = get("https://cdn-api.co-vin.in/api/v2/admin/location/states");
        Response response = given().log().all().header("ContentType","application/json").when().get("https://cdn-api.co-vin.in/api/v2/admin/location/states");

        System.out.println(response.asString());


    }

    public static void main(String[] args) {
        getResponseBody();
        System.out.println("cic");
    }
}