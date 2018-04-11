package api.SummonerV3;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import api.Entities.Summoner;

public class SummonerService {

	public static Summoner getSummoner(String url) {
		Summoner summoner = new Summoner();
		
		return getSummoner(url, summoner);
	}
	
	private static Summoner getSummoner(String url, Summoner summoner) {
		try {
			Reader reader = new InputStreamReader(new URL(url).openStream());
			Gson gson = new GsonBuilder().create();
			summoner = gson.fromJson(reader, Summoner.class);
		} catch(Exception e) {
			System.out.println("Error in getSummonerByName!");
		}
		
		return summoner;
	}
	
}
