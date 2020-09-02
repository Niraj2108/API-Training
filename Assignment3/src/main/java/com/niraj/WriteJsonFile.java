package com.niraj;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		// Inserting key-value pairs into the json object
		jsonObject.put("ID", "1");
		jsonObject.put("First_Name", "Niraj");
		jsonObject.put("Last_Name", "Bhoyar");
		jsonObject.put("Date_Of_Birth", "1997-08-21");
	
		JSONArray list = new JSONArray();

		list.add("Java");
		list.add("Spring");
		list.add("RestAssured");

		jsonObject.put("Technologies", list);

		Map map = new LinkedHashMap(4);
		map.put("streetAddress", "60 2nd Street");
		map.put("city", "Nagpur");
		map.put("state", "MH");
		map.put("postalCode", "440009");

		// putting address to JSONObject
		jsonObject.put("address", map);

		try {
			FileWriter file = new FileWriter("src/main/resources/File/abc.json");
			file.write(jsonObject.toJSONString());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("JSON file created: " + jsonObject);
	}

}
