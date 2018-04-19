package api.Entities;

import java.util.List;

public class StaticChampion {

	private Info info;
	private List<String> enemytips;
	private Stats stats;
	private String name;
	private String title;
	private Image image;
	private List<String> tags;
	private String partype;
	private List<Skin> skins;
	private Passive passive;
	private List<Recommended> recommended;
	private List<String> allytips;
	private String key;
	private String lore;
	private int id;
	private String blurb;
	private List<ChampionSpell> spells;
	
	
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public List<String> getEnemytips() {
		return enemytips;
	}
	public void setEnemytips(List<String> enemytips) {
		this.enemytips = enemytips;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getPartype() {
		return partype;
	}
	public void setPartype(String partype) {
		this.partype = partype;
	}
	public List<Skin> getSkins() {
		return skins;
	}
	public void setSkins(List<Skin> skins) {
		this.skins = skins;
	}
	public Passive getPassive() {
		return passive;
	}
	public void setPassive(Passive passive) {
		this.passive = passive;
	}
	public List<Recommended> getRecommended() {
		return recommended;
	}
	public void setRecommended(List<Recommended> recommended) {
		this.recommended = recommended;
	}
	public List<String> getAllytips() {
		return allytips;
	}
	public void setAllytips(List<String> allytips) {
		this.allytips = allytips;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public List<ChampionSpell> getSpells() {
		return spells;
	}
	public void setSpells(List<ChampionSpell> spells) {
		this.spells = spells;
	}
	
	
}
