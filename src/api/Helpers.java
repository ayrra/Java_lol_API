package api;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Helpers {

	public static Object parseJsonAndReturn(String url, Object ourClass) {
		try {
			Reader reader = new InputStreamReader(new URL(url).openStream());
			Gson gson = new GsonBuilder().create();
			ourClass = gson.fromJson(reader, ourClass.getClass());
		} catch(Exception e) {
			System.out.println("Error in " + ourClass.getClass() + " API calls!");
		}
		return ourClass;
		
	}
	
}
