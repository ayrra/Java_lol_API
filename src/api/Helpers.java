package api;

import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import api.Entities.ChampionMastery;
import api.Entities.LeaguePosition;

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

	public static Set<LeaguePosition> parseJsonSetAndReturn(String url, Set<LeaguePosition> leagueSet) {
		try {
			Reader reader = new InputStreamReader(new URL(url).openStream());
			Gson gson = new Gson();
			Type leagueSetType = new TypeToken<Set<LeaguePosition>>() {}.getType();
			leagueSet = gson.fromJson(reader, leagueSetType);		
		} catch(Exception e) {
			System.out.println("Error in " + leagueSet.getClass() + " API calls!");
		}
		return leagueSet;
		
	}
	
	public static List<ChampionMastery> parseJsonSetAndReturn(String url, List<ChampionMastery> leagueSet) {
		try {
			Reader reader = new InputStreamReader(new URL(url).openStream());
			Gson gson = new Gson();
			Type leagueSetType = new TypeToken<List<ChampionMastery>>() {}.getType();
			leagueSet = gson.fromJson(reader, leagueSetType);		
		} catch(Exception e) {
			System.out.println("Error in " + leagueSet.getClass() + " API calls!");
		}
		return leagueSet;
		
	}

}
