package api.SpectatorV3;

import api.Helpers;
import api.Entities.CurrentGameInfo;

public class CurrentGameService {

	public static CurrentGameInfo getGameData(String url) {
		CurrentGameInfo gameInfo = new CurrentGameInfo();
		gameInfo = (CurrentGameInfo) Helpers.parseJsonAndReturn(url, gameInfo);
		return gameInfo;
	}

}
