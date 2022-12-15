package com.masai.services;

import java.util.List;

import com.masai.exceptions.PlayerNotFount;
import com.masai.model.Player_defence;
import com.masai.model.Player_stats;

public interface Player_defence_services {
	
	//All services
	
	public List<Player_defence> getallplayersdetails();
	
	public Player_defence getplayerbyplarerid(Integer playerid)throws PlayerNotFount;
	
	public List<Player_defence> getPlayersbyposition(String position) throws PlayerNotFount;
	
	public List<Player_defence> getPlayersbyteam(String team)throws PlayerNotFount;
	
	public List<Player_defence> getplayersByTackles(Integer tackles)throws PlayerNotFount;
	
	public List<Player_defence> getplayersByTackles_Won(Integer tackles_won) throws PlayerNotFount;
	
	public String getplayernamebyid(Integer playerid)throws PlayerNotFount;
	
}
