package api.Entities;

import java.util.List;

public class MatchList {

	private List<MatchReference> matches;
	private int totalGames;
	private int startIndex;
	private int endIndex;
	
	
	public List<MatchReference> getMatches() {
		return matches;
	}
	public void setMatches(List<MatchReference> matches) {
		this.matches = matches;
	}
	public int getTotalGames() {
		return totalGames;
	}
	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
}
