package com.niraj;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("src/main/resources/File/abc.json"));
			JSONObject jsonObject = (JSONObject) obj;

			String firstName = (String) jsonObject.get("First_Name");
			String lastName = (String) jsonObject.get("Last_Name");
			String dob = (String) jsonObject.get("Date_Of_Birth");

			JSONArray technologies = (JSONArray) jsonObject.get("Technologies");
			System.out.println("First_Name: " + firstName);
			System.out.println("Last_Name: " + lastName);
			System.out.println("Date_Of_Birth:" + dob);
			System.out.println("Technologies:");
			Iterator iterator = technologies.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			
			Map address = ((Map) jsonObject.get("address"));

			// iterating address Map
			System.out.println("Address:");

			Iterator<Map.Entry> itr1 = address.entrySet().iterator();
			while (itr1.hasNext()) {
				Map.Entry pair = itr1.next();
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
