package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player_defence {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // id autoincrement
	private Integer id;
	private String player;
	private String position;
	private String team;
	private String age;
	private Integer birth_year;
	private Double minutes_90s;
	private Integer tackles;
	private Integer tackles_won;
	private Integer tackles_def_3rd;
	private Integer tackles_mid_3rd;
	private Integer tackles_att_3rd;
	private Integer dribble_tackles;
	private Integer dribbles_vs;
	private Double dribble_tackles_pct;
	private Integer dribbled_past;
	private Integer blocks;
	private Integer blocked_shots;
	private Integer blocked_passes;
	private Integer interceptions;
	private Integer tackles_interceptions;
	private Integer clearances;
	private Integer errors;
	
	
	
	//Getter Setters
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
	public Integer getBirth_year() {
		return birth_year;
	}
	public void setBirth_year(Integer birth_year) {
		this.birth_year = birth_year;
	}
	public Double getMinutes_90s() {
		return minutes_90s;
	}
	public void setMinutes_90s(Double minutes_90s) {
		this.minutes_90s = minutes_90s;
	}
	public Integer getTackles() {
		return tackles;
	}
	public void setTackles(Integer tackles) {
		this.tackles = tackles;
	}
	public Integer getTackles_won() {
		return tackles_won;
	}
	public void setTackles_won(Integer tackles_won) {
		this.tackles_won = tackles_won;
	}
	public Integer getTackles_def_3rd() {
		return tackles_def_3rd;
	}
	public void setTackles_def_3rd(Integer tackles_def_3rd) {
		this.tackles_def_3rd = tackles_def_3rd;
	}
	public Integer getTackles_mid_3rd() {
		return tackles_mid_3rd;
	}
	public void setTackles_mid_3rd(Integer tackles_mid_3rd) {
		this.tackles_mid_3rd = tackles_mid_3rd;
	}
	public Integer getTackles_att_3rd() {
		return tackles_att_3rd;
	}
	public void setTackles_att_3rd(Integer tackles_att_3rd) {
		this.tackles_att_3rd = tackles_att_3rd;
	}
	public Integer getDribble_tackles() {
		return dribble_tackles;
	}
	public void setDribble_tackles(Integer dribble_tackles) {
		this.dribble_tackles = dribble_tackles;
	}
	public Integer getDribbles_vs() {
		return dribbles_vs;
	}
	public void setDribbles_vs(Integer dribbles_vs) {
		this.dribbles_vs = dribbles_vs;
	}
	public Double getDribble_tackles_pct() {
		return dribble_tackles_pct;
	}
	public void setDribble_tackles_pct(Double dribble_tackles_pct) {
		this.dribble_tackles_pct = dribble_tackles_pct;
	}
	public Integer getDribbled_past() {
		return dribbled_past;
	}
	public void setDribbled_past(Integer dribbled_past) {
		this.dribbled_past = dribbled_past;
	}
	public Integer getBlocks() {
		return blocks;
	}
	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}
	public Integer getBlocked_shots() {
		return blocked_shots;
	}
	public void setBlocked_shots(Integer blocked_shots) {
		this.blocked_shots = blocked_shots;
	}
	public Integer getBlocked_passes() {
		return blocked_passes;
	}
	public void setBlocked_passes(Integer blocked_passes) {
		this.blocked_passes = blocked_passes;
	}
	public Integer getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(Integer interceptions) {
		this.interceptions = interceptions;
	}
	public Integer getTackles_interceptions() {
		return tackles_interceptions;
	}
	public void setTackles_interceptions(Integer tackles_interceptions) {
		this.tackles_interceptions = tackles_interceptions;
	}
	public Integer getClearances() {
		return clearances;
	}
	public void setClearances(Integer clearances) {
		this.clearances = clearances;
	}
	public Integer getErrors() {
		return errors;
	}
	public void setErrors(Integer errors) {
		this.errors = errors;
	}
	
	
	// non parameterised constructor
	public Player_defence(){
		
	}
	
	
	
	//  parameterised constructor
	
	public Player_defence(Integer id, String player, String position, String team, String age, Integer birth_year,
			Double minutes_90s, Integer tackles, Integer tackles_won, Integer tackles_def_3rd, Integer tackles_mid_3rd,
			Integer tackles_att_3rd, Integer dribble_tackles, Integer dribbles_vs, Double dribble_tackles_pct,
			Integer dribbled_past, Integer blocks, Integer blocked_shots, Integer blocked_passes, Integer interceptions,
			Integer tackles_interceptions, Integer clearances, Integer errors) {
		super();
		this.id = id;
		this.player = player;
		this.position = position;
		this.team = team;
		this.age = age;
		this.birth_year = birth_year;
		this.minutes_90s = minutes_90s;
		this.tackles = tackles;
		this.tackles_won = tackles_won;
		this.tackles_def_3rd = tackles_def_3rd;
		this.tackles_mid_3rd = tackles_mid_3rd;
		this.tackles_att_3rd = tackles_att_3rd;
		this.dribble_tackles = dribble_tackles;
		this.dribbles_vs = dribbles_vs;
		this.dribble_tackles_pct = dribble_tackles_pct;
		this.dribbled_past = dribbled_past;
		this.blocks = blocks;
		this.blocked_shots = blocked_shots;
		this.blocked_passes = blocked_passes;
		this.interceptions = interceptions;
		this.tackles_interceptions = tackles_interceptions;
		this.clearances = clearances;
		this.errors = errors;
	}
	
	@Override
	public String toString() {
		return "Player_defence [id=" + id + ", player=" + player + ", position=" + position + ", team=" + team
				+ ", age=" + age + ", birth_year=" + birth_year + ", minutes_90s=" + minutes_90s + ", tackles="
				+ tackles + ", tackles_won=" + tackles_won + ", tackles_def_3rd=" + tackles_def_3rd
				+ ", tackles_mid_3rd=" + tackles_mid_3rd + ", tackles_att_3rd=" + tackles_att_3rd + ", dribble_tackles="
				+ dribble_tackles + ", dribbles_vs=" + dribbles_vs + ", dribble_tackles_pct=" + dribble_tackles_pct
				+ ", dribbled_past=" + dribbled_past + ", blocks=" + blocks + ", blocked_shots=" + blocked_shots
				+ ", blocked_passes=" + blocked_passes + ", interceptions=" + interceptions + ", tackles_interceptions="
				+ tackles_interceptions + ", clearances=" + clearances + ", errors=" + errors + "]";
	}
	
	
	
}
