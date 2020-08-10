import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class Tests {

    // https://www.dataaccess.com/webservicesserver/NumberConversion.wso/NumberToWords/JSON/debug?ubiNum=59;
    private String url = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso/NumberToWords/JSON/debug";
    private String urlDolar = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso/NumberToDollars/JSON/debug";

    @Test
    public void postTeste(){
        given().
                param("ubiNum",59).
                when().
                post(url).
                then().
                body(containsString("fifty nine "));
    }

    @Test
    public void postTesteDollars(){
        given().
                param("dNum",10).
                when().
                post(urlDolar).
                then().
                body(containsString("ten dollars"));
    }


}