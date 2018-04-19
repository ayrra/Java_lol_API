package api.ChampionV3;

import java.util.List;

import api.Helpers;
import api.Entities.Champion;
import api.Entities.ChampionList;
import api.Entities.ChampionMastery;

public class ChampionService {

	public static ChampionList getLeagueSet(String url) {
		ChampionList championList = new ChampionList();
		championList = (ChampionList) Helpers.parseJsonAndReturn(url, championList);
		return championList;
	}

	public static Champion getChampion(String url) {
		Champion champion = new Champion();
		champion = (Champion) Helpers.parseJsonAndReturn(url, champion);
		return champion;
	}

	public static ChampionMastery getChampionMastery(String url) {
		ChampionMastery championMastery = new ChampionMastery();
		championMastery = (ChampionMastery) Helpers.parseJsonAndReturn(url, championMastery);
		return championMastery;
	}

	public static List<ChampionMastery> getChampionMasteryList(String url) {
		List<ChampionMastery> championMasteryList = null;
		championMasteryList = (List<ChampionMastery>) Helpers.parseJsonSetAndReturn(url, championMasteryList);
		return championMasteryList;
	}

}
