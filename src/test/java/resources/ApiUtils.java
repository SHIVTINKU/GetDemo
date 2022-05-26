package resources;

import java.io.FileOutputStream;
import java.io.PrintStream;

import Config_EnvVariables.Config;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiUtils extends Config {
	
	static RequestSpecification req;
	
	
	public static RequestSpecification  commonRequestParam()
	{
		
		if(req==null)
		{
		try
		{
		PrintStream print= new PrintStream(new FileOutputStream("logging.txt"));
		
		req= new RequestSpecBuilder().setContentType(ContentType.JSON)
				.setBaseUri(Config.getProperty("BaseUri")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(print))
				.addFilter(ResponseLoggingFilter.logResponseTo(print))
				.build();
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
		return req;
		
	}

	
	public static String getAsJsonPath(Response response,String Key)
	{
		
		String ResponseAsString= response.asString();
		JsonPath js= new JsonPath(ResponseAsString);
		
		String value=js.get(Key);
		
		return value;
	}

	
	
}
