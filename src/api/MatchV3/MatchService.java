package api.MatchV3;

import api.Helpers;
import api.Entities.Match;

public class MatchService {

	public static Match getMatchData (String url) {
		Match match = new Match();
		match = (Match) Helpers.parseJsonAndReturn(url, match);
		return match;
	}
	
}
