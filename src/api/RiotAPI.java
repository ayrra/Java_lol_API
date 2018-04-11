package api;

import SpectatorV3.CurrentGameService;
import api.Entities.CurrentGameInfo;
import api.Entities.Summoner;
import api.SummonerV3.SummonerService;

public class RiotAPI extends API {

	public RiotAPI(Config configuration, String region) {
		super(configuration, region);
	}

	public Summoner GetSummonerByName(String summonerName) {	
		String url = getBaseUrl() + "summoner/v3/summoners/by-name/" + summonerName + "?api_key=" + getAPIKey();
		Summoner summoner = SummonerService.getSummoner(url);
	
		return summoner;
	}
	
	public Summoner GetSummonerByAccountId(long accountId) {
		String url = getBaseUrl() + "summoner/v3/summoners/by-account/" + accountId + "?api_key=" + getAPIKey();
		Summoner summoner = SummonerService.getSummoner(url);
		
		return summoner;
	}
	
	public Summoner GetSummonerBySummonerId(long summonerId) {
		String url = getBaseUrl() + "summoner/v3/summoners/" + summonerId + "?api_key=" + getAPIKey();
		Summoner summoner = SummonerService.getSummoner(url);	
		
		return summoner;
	}

	public CurrentGameInfo GetActiveGame(long summonerId) {
		String url = getBaseUrl() + "spectator/v3/active-games/by-summoner/" + summonerId + "?api_key=" + getAPIKey();
		CurrentGameInfo gameInfo = CurrentGameService.getGameData(url);
		
		return gameInfo;
	}



}
