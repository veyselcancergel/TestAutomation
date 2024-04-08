import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.GenerateTokenResponse;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateToken {
    public static void main(String[] args) {
        String url = "https://demoqa.com/Account/v1/GenerateToken";

        Map<String, Object> header = new HashMap<>();
        header.put("authorization","Basic aXBlazppcGVr");
        header.put("accept","application/json");

        String requestBody = "{\"userName\": \"veysel\",\"password\": \"can\"}";

        String contentType = ContentType.JSON.toString();

        Response response = RestAssured.given()
                .contentType(contentType)
                .headers(header)
                .body(requestBody)
                .when().log().all()
                .post(url);

        response.then().log().all();

        assertThat(response.statusCode()).isEqualTo(200);

        GenerateTokenResponse getResponse = response.body().as(GenerateTokenResponse.class);
        System.out.println(getResponse.result);
    }
}
