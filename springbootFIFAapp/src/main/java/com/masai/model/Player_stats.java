package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player_stats {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String player;
	private String position;
	private String team;
	private String age;
	private String club;
	private Integer birth_year;
	private Integer games;
	private Integer games_starts;
	private Integer minutes;
	private Double minutes_90s;
	private Integer goals;
	private Integer assists;
	private Integer goals_pens;
	private Integer pens_made;
	private Integer pens_att;
	private Integer cards_yellow;
	private Integer cards_red;
	private Double goals_per90;
	private Double assists_per90;
	private Double goals_assists_per90;
	private Double goals_pens_per90;
	private Double goals_assists_pens_per90;
	private Double xg;
	private Double npxg;
	private Double xg_assist;
	private Double npxg_xg_assist;
	private Double xg_per90;
	private Double xg_assist_per90;
	private Double xg_xg_assist_per90;
	private Double npxg_per90;
	private Double npxg_xg_assist_per90;
	
	
	
	// getter setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public Integer getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(Integer birth_year) {
		this.birth_year = birth_year;
	}
	public Integer getGames() {
		return games;
	}
	public void setGames(Integer games) {
		this.games = games;
	}
	public Integer getGames_starts() {
		return games_starts;
	}
	public void setGames_starts(Integer games_starts) {
		this.games_starts = games_starts;
	}
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public Double getMinutes_90s() {
		return minutes_90s;
	}
	public void setMinutes_90s(Double minutes_90s) {
		this.minutes_90s = minutes_90s;
	}
	public Integer getGoals() {
		return goals;
	}
	public void setGoals(Integer goals) {
		this.goals = goals;
	}
	public Integer getAssists() {
		return assists;
	}
	public void setAssists(Integer assists) {
		this.assists = assists;
	}
	public Integer getGoals_pens() {
		return goals_pens;
	}
	public void setGoals_pens(Integer goals_pens) {
		this.goals_pens = goals_pens;
	}
	public Integer getPens_made() {
		return pens_made;
	}
	public void setPens_made(Integer pens_made) {
		this.pens_made = pens_made;
	}
	public Integer getPens_att() {
		return pens_att;
	}
	public void setPens_att(Integer pens_att) {
		this.pens_att = pens_att;
	}
	public Integer getCards_yellow() {
		return cards_yellow;
	}
	public void setCards_yellow(Integer cards_yellow) {
		this.cards_yellow = cards_yellow;
	}
	public Integer getCards_red() {
		return cards_red;
	}
	public void setCards_red(Integer cards_red) {
		this.cards_red = cards_red;
	}
	public Double getGoals_per90() {
		return goals_per90;
	}
	public void setGoals_per90(Double goals_per90) {
		this.goals_per90 = goals_per90;
	}
	public Double getAssists_per90() {
		return assists_per90;
	}
	public void setAssists_per90(Double assists_per90) {
		this.assists_per90 = assists_per90;
	}
	public Double getGoals_assists_per90() {
		return goals_assists_per90;
	}
	public void setGoals_assists_per90(Double goals_assists_per90) {
		this.goals_assists_per90 = goals_assists_per90;
	}
	public Double getGoals_pens_per90() {
		return goals_pens_per90;
	}
	public void setGoals_pens_per90(Double goals_pens_per90) {
		this.goals_pens_per90 = goals_pens_per90;
	}
	public Double getGoals_assists_pens_per90() {
		return goals_assists_pens_per90;
	}
	public void setGoals_assists_pens_per90(Double goals_assists_pens_per90) {
		this.goals_assists_pens_per90 = goals_assists_pens_per90;
	}
	public Double getXg() {
		return xg;
	}
	public void setXg(Double xg) {
		this.xg = xg;
	}
	public Double getNpxg() {
		return npxg;
	}
	public void setNpxg(Double npxg) {
		this.npxg = npxg;
	}
	public Double getXg_assist() {
		return xg_assist;
	}
	public void setXg_assist(Double xg_assist) {
		this.xg_assist = xg_assist;
	}
	public Double getNpxg_xg_assist() {
		return npxg_xg_assist;
	}
	public void setNpxg_xg_assist(Double npxg_xg_assist) {
		this.npxg_xg_assist = npxg_xg_assist;
	}
	public Double getXg_per90() {
		return xg_per90;
	}
	public void setXg_per90(Double xg_per90) {
		this.xg_per90 = xg_per90;
	}
	public Double getXg_assist_per90() {
		return xg_assist_per90;
	}
	public void setXg_assist_per90(Double xg_assist_per90) {
		this.xg_assist_per90 = xg_assist_per90;
	}
	public Double getXg_xg_assist_per90() {
		return xg_xg_assist_per90;
	}
	public void setXg_xg_assist_per90(Double xg_xg_assist_per90) {
		this.xg_xg_assist_per90 = xg_xg_assist_per90;
	}
	public Double getNpxg_per90() {
		return npxg_per90;
	}
	public void setNpxg_per90(Double npxg_per90) {
		this.npxg_per90 = npxg_per90;
	}
	public Double getNpxg_xg_assist_per90() {
		return npxg_xg_assist_per90;
	}
	public void setNpxg_xg_assist_per90(Double npxg_xg_assist_per90) {
		this.npxg_xg_assist_per90 = npxg_xg_assist_per90;
	}
	
	
	
	// non-parameterised constructor
	public Player_stats() {
		
	}
	
	
	// parameterised constructor
	public Player_stats(Integer id, String player, String position, String team, String age, String club,
			Integer birth_year, Integer games, Integer games_starts, Integer minutes, Double minutes_90s, Integer goals,
			Integer assists, Integer goals_pens, Integer pens_made, Integer pens_att, Integer cards_yellow,
			Integer cards_red, Double goals_per90, Double assists_per90, Double goals_assists_per90,
			Double goals_pens_per90, Double goals_assists_pens_per90, Double xg, Double npxg, Double xg_assist,
			Double npxg_xg_assist, Double xg_per90, Double xg_assist_per90, Double xg_xg_assist_per90,
			Double npxg_per90, Double npxg_xg_assist_per90) {
		super();
		this.id = id;
		this.player = player;
		this.position = position;
		this.team = team;
		this.age = age;
		this.club = club;
		this.birth_year = birth_year;
		this.games = games;
		this.games_starts = games_starts;
		this.minutes = minutes;
		this.minutes_90s = minutes_90s;
		this.goals = goals;
		this.assists = assists;
		this.goals_pens = goals_pens;
		this.pens_made = pens_made;
		this.pens_att = pens_att;
		this.cards_yellow = cards_yellow;
		this.cards_red = cards_red;
		this.goals_per90 = goals_per90;
		this.assists_per90 = assists_per90;
		this.goals_assists_per90 = goals_assists_per90;
		this.goals_pens_per90 = goals_pens_per90;
		this.goals_assists_pens_per90 = goals_assists_pens_per90;
		this.xg = xg;
		this.npxg = npxg;
		this.xg_assist = xg_assist;
		this.npxg_xg_assist = npxg_xg_assist;
		this.xg_per90 = xg_per90;
		this.xg_assist_per90 = xg_assist_per90;
		this.xg_xg_assist_per90 = xg_xg_assist_per90;
		this.npxg_per90 = npxg_per90;
		this.npxg_xg_assist_per90 = npxg_xg_assist_per90;
	}
	@Override
	public String toString() {
		return "Player_stats [id=" + id + ", player=" + player + ", position=" + position + ", team=" + team + ", age="
				+ age + ", club=" + club + ", birth_year=" + birth_year + ", games=" + games + ", games_starts="
				+ games_starts + ", minutes=" + minutes + ", minutes_90s=" + minutes_90s + ", goals=" + goals
				+ ", assists=" + assists + ", goals_pens=" + goals_pens + ", pens_made=" + pens_made + ", pens_att="
				+ pens_att + ", cards_yellow=" + cards_yellow + ", cards_red=" + cards_red + ", goals_per90="
				+ goals_per90 + ", assists_per90=" + assists_per90 + ", goals_assists_per90=" + goals_assists_per90
				+ ", goals_pens_per90=" + goals_pens_per90 + ", goals_assists_pens_per90=" + goals_assists_pens_per90
				+ ", xg=" + xg + ", npxg=" + npxg + ", xg_assist=" + xg_assist + ", npxg_xg_assist=" + npxg_xg_assist
				+ ", xg_per90=" + xg_per90 + ", xg_assist_per90=" + xg_assist_per90 + ", xg_xg_assist_per90="
				+ xg_xg_assist_per90 + ", npxg_per90=" + npxg_per90 + ", npxg_xg_assist_per90=" + npxg_xg_assist_per90
				+ "]";
	}
	
	
	
	
	
}
