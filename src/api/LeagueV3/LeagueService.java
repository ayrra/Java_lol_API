package api.LeagueV3;

import java.util.Set;

import api.Helpers;
import api.Entities.LeagueList;
import api.Entities.LeaguePosition;

public class LeagueService {

	public static LeagueList getQueue (String url) {
		LeagueList leagueList = new LeagueList();
		leagueList = (LeagueList) Helpers.parseJsonAndReturn(url, leagueList);
		return leagueList;
	}

	public static Set<LeaguePosition> getLeagueSet(String url) {
		Set<LeaguePosition> leagueSet = null;
		leagueSet = (Set<LeaguePosition>) Helpers.parseJsonSetAndReturn(url, leagueSet);
		return leagueSet;
	}
	
}
