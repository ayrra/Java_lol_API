package api.MatchV3;

import api.Helpers;
import api.Entities.Match;
import api.Entities.MatchList;

public class MatchService {

	public static Match getMatchData (String url) {
		Match match = new Match();
		match = (Match) Helpers.parseJsonAndReturn(url, match);
		return match;
	}
	
	public static MatchList getMatchList (String url) {
		MatchList matchList = new MatchList();
		matchList = (MatchList) Helpers.parseJsonAndReturn(url, matchList);
		return matchList;
	}
	
}
