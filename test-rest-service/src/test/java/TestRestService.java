import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/**
 * 〈测试类〉
 *
 * @author zhzh.yin
 * @create 2020/12/29
 */
public class TestRestService {
    @Test
     void testRestService1(){
        given().when()
                .get("http://127.0.0.1:8082/greeting").then()
        .statusCode(200);
    }
    @Test
     void testRestService2(){
        given().when()
                .get("http://127.0.0.1:8082/greeting2?test=zhzhyin").then()
                .statusCode(200);
    }

}