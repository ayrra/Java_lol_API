package api;

import java.util.List;
import java.util.Set;

import api.ChampionV3.ChampionService;
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
import api.LeagueV3.LeagueService;
import api.LolstatusV3.StatusService;
import api.MatchV3.MatchService;
import api.SpectatorV3.CurrentGameService;
import api.StaticV3.StaticService;
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

	public Match getMatchFromId(long matchId) {
		String url = getBaseUrl() + "match/v3/matches/" + matchId + "?api_key=" + getAPIKey();
		Match match = MatchService.getMatchData(url);

		return match;
	}

	public MatchList getMatchListFromAccountId(long accountId) {
		String url = getBaseUrl() + "match/v3/matchlists/by-account/" + accountId + "?api_key=" + getAPIKey();
		MatchList matchList = MatchService.getMatchList(url);

		return matchList;
	}

	public MatchList getRecentMatchListFromAccountId(long accountId) {
		String url = getBaseUrl() + "match/v3/matchlists/by-account/" + accountId + "/recent/?api_key=" + getAPIKey();
		MatchList matchList = MatchService.getMatchList(url);

		return matchList;
	}

	public MatchTimeline getMatchTimeline(long matchId) {
		String url = getBaseUrl() + "match/v3/timelines/by-match/" + matchId + "?api_key=" + getAPIKey();
		MatchTimeline matchTimeline = MatchService.getMatchTimeline(url);

		return matchTimeline;
	}

	public ShardStatus getLOLStatus() {
		String url = getBaseUrl() + "status/v3/shard-data" + "?api_key=" + getAPIKey();
		ShardStatus shardStatus = StatusService.getStatus(url);

		return shardStatus;
	}

	public LeagueList getChallengerLeagueListByQueue(String queue) {
		String url = getBaseUrl() + "league/v3/challengerleagues/by-queue/" + queue + "?api_key=" + getAPIKey();
		LeagueList leagueList = LeagueService.getQueue(url);

		return leagueList;
	}

	public LeagueList getLeagueListByLeagueId(String leagueId) {
		String url = getBaseUrl() + "league/v3/leagues/" + leagueId + "?api_key=" + getAPIKey();
		LeagueList leagueList = LeagueService.getQueue(url);

		return leagueList;
	}

	public LeagueList getMasterLeagueListByQueue(String queue) {
		String url = getBaseUrl() + "league/v3/masterleagues/by-queue/" + queue + "?api_key=" + getAPIKey();
		LeagueList leagueList = LeagueService.getQueue(url);

		return leagueList;
	}

	public Set<LeaguePosition> getLeagueSetBySummonerId(long summonerId) {
		String url = getBaseUrl() + "league/v3/positions/by-summoner/" + summonerId + "?api_key=" + getAPIKey();
		Set<LeaguePosition> leagueSet = LeagueService.getLeagueSet(url);

		return leagueSet;
	}

	public ChampionList getChampionList() {
		String url = getBaseUrl() + "platform/v3/champions" + "?api_key=" + getAPIKey();
		ChampionList championList = ChampionService.getLeagueSet(url);

		return championList;
	}

	public ChampionList getChampionList(boolean freeToPlay) {
		String url = getBaseUrl() + "platform/v3/champions?freeToPlay=" + freeToPlay + "&api_key=" + getAPIKey();
		ChampionList championList = ChampionService.getLeagueSet(url);

		return championList;
	}

	public Champion getChampion(long championId) {
		String url = getBaseUrl() + "platform/v3/champions/" + championId + "?api_key=" + getAPIKey();
		Champion champion = ChampionService.getChampion(url);
		
		return champion;
	}

	public List<ChampionMastery> getChampionMasteryBySummonerId(long summonerId) {
		String url = getBaseUrl() + "champion-mastery/v3/champion-masteries/by-summoner/" + summonerId + "?api_key=" + getAPIKey();

		List<ChampionMastery> championMasteryList = ChampionService.getChampionMasteryList(url);

		return championMasteryList;
	}

	public ChampionMastery getChampionMasteryByChampion(long summonerId, long championId) {
		String url = getBaseUrl() + "champion-mastery/v3/champion-masteries/by-summoner/" + summonerId + "/by-champion/" + championId + "?api_key=" + getAPIKey();
		ChampionMastery championMastery = ChampionService.getChampionMastery(url);
		
		return championMastery;
	}

	public StaticChampionList getStaticChampionList() {
		String url = getBaseUrl() + "static-data/v3/champions?api_key=" + getAPIKey();	
		StaticChampionList champList = StaticService.getStaticChampionList(url);
		return champList;
	}

	public StaticChampion getStaticChampion(long id) {
		String url = getBaseUrl() + "static-data/v3/champions/" + id + "?api_key=" + getAPIKey();	
		StaticChampion champion = StaticService.getStaticChampion(url);
		return champion;
	}

}
