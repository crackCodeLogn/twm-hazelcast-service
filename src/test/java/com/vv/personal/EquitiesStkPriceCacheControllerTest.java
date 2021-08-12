package com.vv.personal;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.hazelcast.HazelcastServerTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@QuarkusTestResource(HazelcastServerTestResource.class)
public class EquitiesStkPriceCacheControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cache/eq/greeting")
          .then()
             .statusCode(200)
             .body(is("Hello Spring"));
    }

}