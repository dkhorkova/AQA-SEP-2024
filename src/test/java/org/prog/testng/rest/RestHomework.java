package org.prog.testng.rest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebElement;
import org.prog.dto.ResultsDto;

import java.util.List;

//TODO: Add location to rest params
//TODO: Add Location DTO with all sub objects
//TODO: For each user, print First Name + Last Name + Street Name + building id
public class RestHomework {


    public void randomUserTest() {
        RequestSpecification specification = RestAssured.given();
        specification.baseUri("https://randomuser.me/");
        specification.basePath("/api/");
        specification.queryParam("inc", " first name, last name, location");
        specification.queryParam("noinfo");
        specification.queryParam("results", 1);
        Response response = specification.get();
        ValidatableResponse validatableResponse = response.then();

        validatableResponse.contentType(ContentType.JSON);
        response.body().prettyPrint();

            String firstName  = response.jsonPath().get("results[1].firstName");
            System.out.println ( firstName);
            String lastName = response.jsonPath().get("results[1].lastName");
            System.out.println (lastName);
            String streetName = response.jsonPath().get("results[1]. StreetName" );
            System.out.println ( streetName);
            String buildingId = response.jsonPath().get (" results [1]. buildingId" );
            System.out.println (buildingId);







        }
}
