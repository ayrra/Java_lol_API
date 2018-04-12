package api;

import api.Entities.CurrentGameInfo;
import api.Entities.Match;
import api.Entities.MatchList;
import api.Entities.Summoner;

//using this abstract class for organization
abstract class API {
	
	private String baseUrl;
	private String apikey;
	
	public API(Config configuration, String region) {
		this.baseUrl = "https://" + region + ".api.riotgames.com/lol/";
		this.apikey = configuration.getAPIKey();
	}
	
	String getBaseUrl() {
		return baseUrl;
	}
	
	String getAPIKey() {
		return apikey;
	}
	
	//summoner-v3
	abstract Summoner GetSummonerByName(String summonerName);
	abstract Summoner GetSummonerByAccountId(long accountId);
	abstract Summoner GetSummonerBySummonerId(long summonerId);
	
	//spectator-v3 **not implementing featured games
	abstract CurrentGameInfo GetActiveGame(long summonerId);
	
	//match-v3
	abstract Match getMatchFromId(long matchId);
	//we can later add start and end index to getMatchlistFromAccountId
	abstract MatchList getMatchListFromAccountId(long accountId);
	
}
