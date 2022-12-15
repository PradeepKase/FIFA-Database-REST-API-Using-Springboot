package com.masai.services;

import java.util.List;

import com.masai.exceptions.PlayerNotFount;
import com.masai.model.Player_stats;

public interface Player_stats_services {
	public List<Player_stats> getallplayersdetails();
	
	public Player_stats getplayerbyid(Integer playerid);
	
	
	//public List<Player_stats>Getplayersbygamesandminutesandgoalsandbirthyear(Integer no_of_games, Integer no_of_minutes, Integer no_goals, Integer year_birth);

	public List<Player_stats> findplayersByno_of_Games_played(Integer games)throws PlayerNotFount;
	public List<Player_stats> findplayersByno_of_Minutes_played(Integer mis)throws PlayerNotFount;
	public List<Player_stats> findplayersByno_of_Goals(Integer goals)throws PlayerNotFount;
	public List<Player_stats> findplayerBy_birth_year(Integer birth_year)throws PlayerNotFount;
}
