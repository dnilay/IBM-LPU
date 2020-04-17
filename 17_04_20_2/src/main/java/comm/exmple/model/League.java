package comm.exmple.model;

public class League {
	private String leagueID;
	private String season;
	private int year;
	private String title;
	public League(String leagueID, String season, int year, String title) {
		super();
		this.leagueID = leagueID;
		this.season = season;
		this.year = year;
		this.title = title;
	}
	public League() {
		super();
	}
	public String getLeagueID() {
		return leagueID;
	}
	public void setLeagueID(String leagueID) {
		this.leagueID = leagueID;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
