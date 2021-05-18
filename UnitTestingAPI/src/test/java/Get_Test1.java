import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Get_Test1 {

	@Test
	public void postTesting() {
		JSONObject postTesting = new JSONObject();

		postTesting.put("Name", "Clementine");
		postTesting.put("Job", "Golf Ball Diver");

		System.out.println(postTesting.toJSONString());

		given().
		body(postTesting.toJSONString()).
		when().
		post ("https://reqres.in/api/users").
		then().
		statusCode(201);
	}


	@Test
	public void patchTesting() {
		JSONObject postTesting = new JSONObject();

		postTesting.put("Name", "Clementine");
		postTesting.put("Job", "Golf Ball Diver");

		System.out.println(postTesting.toJSONString());

		given().
		body(postTesting.toJSONString()).
		when().
		patch ("https://reqres.in/api/users/2").
		then().
		statusCode(200);
	}

	@Test
	public void getTesting() {

		when().
		get ("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
	}

	@Test
	public void deleteTesting() {

		when().
		delete ("https://reqres.in/api/users/2").
		then().
		statusCode(204).log().all();
	}

}
