
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
    public void testRestService(){
        given().when()
                .get("http://127.0.0.1:8082/greeting").then()
        .statusCode(200);
        given.when()
                .get("http://127.0.0.1:8082/greeting?name=zhzhyin").then()
                .statusCode(200);
    }
}