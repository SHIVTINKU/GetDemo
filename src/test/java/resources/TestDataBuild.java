package resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;

public class TestDataBuild {
	
	
	public static AddPlace addPlacePayLoad(String name,String address,String language)
	{
		
		
		
		 AddPlace ap = new AddPlace();

		ap.setAccuracy(45);

		ap.setAddress(address);

		ap.setLanguage(language);

		ap.setName(name);

		ap.setPhone_number("09890");

		Location l = new Location();

		l.setLat(98);

		l.setLng(97);

		ap.setLocation(l);

		List<String> list = new ArrayList<String>();

		list.add("luck");

		list.add("matters");

		ap.setTypes(list);
		
		return ap;

		
	}
	
	public static String deletePlacePayload(String placeID)
	{
		return "{\r\n"
				+ "    \"place_id\" :\""+placeID+"\"\r\n"
				+ "}";
	}

}
