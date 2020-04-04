package RestAssuredDemo.RestAssuredDemo;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Getclass {

	
	 @Test
	    void getUserDetailsTest() {
	        //The base URI to be used
	        RestAssured.baseURI = "https://reqres.in/api/users/";
	        RestAssured.baseURI="https://reqres.in/api/users/";
	 
	        //Define the specification of request. Server is specified by baseURI above.
	       // RequestSpecification httpRequest = RestAssured.given();
	        
	        RequestSpecification httpRequest= RestAssured.given();
	 
	        //Makes calls to the server using Method type.
	       // Response response = httpRequest.request(Method.GET, "2");
	        
	        Response responce=httpRequest.request(Method.GET,"2");
	 
	        //Checks the Status Code
	       // int statusCode = response.getStatusCode();
	        
	        		 int statusCode = responce.getStatusCode();
	        Assert.assertEquals(statusCode, 200);
	    }
	
	
	
	
}