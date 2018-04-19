package api;

import java.util.List;
import java.util.Set;

import api.Entities.Champion;
import api.Entities.ChampionList;
import api.Entities.ChampionMastery;
import api.Entities.CurrentGameInfo;
import api.Entities.LeagueList;
import api.Entities.LeaguePosition;
import api.Entities.Match;
import api.Entities.MatchList;
import api.Entities.MatchTimeline;
import api.Entities.ShardStatus;
import api.Entities.StaticChampion;
import api.Entities.StaticChampionList;
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
	abstract MatchList getRecentMatchListFromAccountId(long accountId);
	abstract MatchTimeline getMatchTimeline(long matchId);
	
	//status-v3
	abstract ShardStatus getLOLStatus();
	
	//lol-static-data-v3 ** these don't count toward the api limit
	//add optional fields to this later**TO KEEP SIMPLE ONLY DO EMPTY QUERY
	abstract StaticChampionList getStaticChampionList();
	//add optional fields to this later**TO KEEP SIMPLE ONLY DO EMPTY QUERY
	abstract StaticChampion getStaticChampion(long id);
	//abstract StaticItemList getItemList();
	//abstract StaticItem getItem();
	
	//league-v3 **queue have predefined parameter, add these soon
	abstract LeagueList getChallengerLeagueListByQueue(String queue);
	abstract LeagueList getLeagueListByLeagueId(String leagueId);
	abstract LeagueList getMasterLeagueListByQueue(String queue);
	abstract Set<LeaguePosition> getLeagueSetBySummonerId(long summonerId);
	
	//champion-v3 **Optional freeToPlay
	abstract ChampionList getChampionList();
	abstract ChampionList getChampionList(boolean freeToPlay);
	abstract Champion getChampion(long championId);
	
	//champion-mastery-v3
	abstract List<ChampionMastery> getChampionMasteryBySummonerId(long summonerId);
	abstract ChampionMastery getChampionMasteryByChampion(long summonerId, long championId);
	
}
