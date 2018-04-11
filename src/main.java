import java.util.List;

import api.Config;
import api.RiotAPI;
import api.Entities.BannedChampion;
import api.Entities.CurrentGameInfo;
import api.Entities.CurrentGameParticipant;
import api.Entities.Region;
import api.Entities.Summoner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Here we test our API calls!");
		
		//you can set your apikey in the Config constructor, you can later change by calling the setter
		Config APIConfig = new Config("RGAPI");
		
		//we should be able to set the region here!
		RiotAPI api = new RiotAPI(APIConfig, Region.NA);
		
		
		
		//for now we will only deal with the NA servers
		//lets get summoners first!
		Summoner summoner = api.GetSummonerByName("short_dog");
		
		System.out.println(summoner.getName());
		System.out.println(summoner.getId());
		System.out.println(summoner.getSummonerLevel());
		System.out.println(summoner.getAccountId());
		
		
		
		//lets test spectator **Check this for null to see if the game exists
		CurrentGameInfo currentGameInfo = api.GetActiveGame(summoner.getId());
	
		//we check currentGameInfo participants
		List<CurrentGameParticipant> participants = currentGameInfo.getParticipants();	
		for (CurrentGameParticipant cgp : participants) {
			System.out.println("Team: " + cgp.getTeamId() + " Name: " + cgp.getSummonerName() + " Champion: " + cgp.getChampionId());
		}
		//gameId
		System.out.println("GameID is: " + currentGameInfo.getGameId());
		
		//check banned champions
		List<BannedChampion> bannedChamps = currentGameInfo.getBannedChampions();
		for (BannedChampion bc : bannedChamps) {
			System.out.println("Team: " + bc.getTeamId() + " Banned Champion: " + bc.getChampionId());
		}
		
		
		//
		
	}

}
