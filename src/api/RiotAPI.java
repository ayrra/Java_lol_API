package api;

import api.Entities.Summoner;
import api.SummonerV3.SummonerService;

public class RiotAPI {

	private String baseUrl;
	private String apikey;
	
	public RiotAPI(Config configuration, String region) {
		this.baseUrl = "https://" + region + ".api.riotgames.com/lol/";
		this.apikey = configuration.getAPIKey();
	}

	public Summoner getSummonerByName(String summonerName) {	
		String url = baseUrl + "summoner/v3/summoners/by-name/" + summonerName + "?api_key=" + apikey;
		Summoner summoner = SummonerService.getSummoner(url);
	
		return summoner;
	}
	
	public Summoner GetSummonerByAccountId(String accountId) {
		String url = baseUrl + "summoner/v3/summoners/by-account/" + accountId + "?api_key=" + apikey;
		Summoner summoner = SummonerService.getSummoner(url);
		
		return summoner;
	}
	
	public Summoner GetSummonerBySummonerId(String summonerId) {
		String url = baseUrl + "summoner/v3/summoners/" + summonerId + "?api_key=" + apikey;
		Summoner summoner = SummonerService.getSummoner(url);
		
		return summoner;
	}



}
