import api.Config;
import api.RiotAPI;
import api.Entities.Region;
import api.Entities.Summoner;

public class main {

	public static void main(String[] args) {
		System.out.println("Here we test our API calls!");
		
		//you can set your apikey in the Config constructor, you can later change by calling the setter
		Config APIConfig = new Config("RIOT API KEY");
		
		//we should be able to set the region here!
		RiotAPI api = new RiotAPI(APIConfig, Region.NA);
		
		//for now we will only deal with the NA servers
		//lets get summoners first!
		Summoner summoner = api.GetSummonerByAccountId("212691335");
		System.out.println(summoner.getName());
		System.out.println(summoner.getId());
		System.out.println(summoner.getSummonerLevel());
		System.out.println(summoner.getAccountId());
		
	}

}
