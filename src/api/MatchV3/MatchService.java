package api.MatchV3;

import api.Helpers;
import api.Entities.Match;
import api.Entities.MatchList;
import api.Entities.MatchTimeline;

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

	public static MatchTimeline getMatchTimeline(String url) {
		MatchTimeline matchTimeline = new MatchTimeline();
		matchTimeline = (MatchTimeline) Helpers.parseJsonAndReturn(url, matchTimeline);
		return matchTimeline;
	}
	
}
