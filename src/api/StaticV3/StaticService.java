package api.StaticV3;

import api.Helpers;
import api.Entities.StaticChampion;
import api.Entities.StaticChampionList;

public class StaticService {

	public static StaticChampionList getStaticChampionList(String url) {
		StaticChampionList championList = new StaticChampionList();
		championList = (StaticChampionList) Helpers.parseJsonAndReturn(url, championList);
		return championList;
	}

	public static StaticChampion getStaticChampion(String url) {
		StaticChampion champion = new StaticChampion();
		champion = (StaticChampion) Helpers.parseJsonAndReturn(url, champion);
		return champion;
	}

}
