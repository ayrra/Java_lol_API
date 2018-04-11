package api.SummonerV3;

import api.Entities.Summoner;
import api.Helpers;

public class SummonerService {

	public static Summoner getSummoner(String url) {
		Summoner summoner = new Summoner();
		summoner = (Summoner) Helpers.parseJsonAndReturn(url, summoner);
		return summoner;
	}
	
}
