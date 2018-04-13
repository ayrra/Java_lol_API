import java.util.List;
import java.util.Map;

import api.Config;
import api.RiotAPI;
import api.Entities.BannedChampion;
import api.Entities.CurrentGameInfo;
import api.Entities.CurrentGameParticipant;
import api.Entities.Match;
import api.Entities.MatchEvent;
import api.Entities.MatchFrame;
import api.Entities.MatchList;
import api.Entities.MatchParticipantFrame;
import api.Entities.MatchReference;
import api.Entities.MatchTimeline;
import api.Entities.Participant;
import api.Entities.ParticipantIdentity;
import api.Entities.ParticipantStats;
import api.Entities.Region;
import api.Entities.ShardStatus;
import api.Entities.Summoner;
import api.Entities.TeamBans;
import api.Entities.TeamStats;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Here we test our API calls!");
		
		//you can set your apikey in the Config constructor, you can later change by calling the setter
		Config APIConfig = new Config("RGAPI");
		
		//we should be able to set the region here!
		RiotAPI api = new RiotAPI(APIConfig, Region.NA);
		
		
		//for now we will only deal with the NA servers
		//lets get summoners first!
		Summoner summoner = api.GetSummonerByName("notascientist");
		
		System.out.println(summoner.getAccountId());
		
		ShardStatus ss = api.getLOLStatus();
		
		System.out.println(ss.getName());
		
	}

}
