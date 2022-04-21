package petStore;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiGet {
    @Test
    public void getPetById(){
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2/pet/1001")
                .header("accept","application/json")
        .when()
                .get()
        .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath json = response.jsonPath();

        Pet responsePet = json.getObject("$",Pet.class);
        Category cat = json.getObject("category",Category.class);

        Assert.assertEquals(responsePet.getName(),"XXXXXX");
        Assert.assertEquals(responsePet.getCategory().getName(),cat.getName());
        long id  = json.getLong("id");
        Assert.assertEquals(1001,id);




    }

}
