package com.masai.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.PlayerNotFount;
import com.masai.model.Player_stats;
import com.masai.repository.Player_statsDao;

@Service
public class Player_stats_servicesImpl implements Player_stats_services{

	
	@Autowired
	private Player_statsDao playerdao;
	
	
	@Override
	public List<Player_stats> getallplayersdetails() {
		// TODO Auto-generated method stub
		List<Player_stats> playerlist= playerdao.findAll();
		return playerlist;
	}

	@Override
	public Player_stats getplayerbyid(Integer playerid) {
		Optional<Player_stats> player= playerdao.findById(playerid);
		 Player_stats p= player.get();
		 return p;
	}


	@Override
	public List<Player_stats> findplayersByno_of_Games_played(Integer games) throws PlayerNotFount {
		// TODO Auto-generated method stub
	   List<Player_stats>list_of_players=playerdao.findByGames(games);
		
		if(list_of_players.isEmpty()) {
			throw new PlayerNotFount("Player not found with "+games);
		}
		else {
			return list_of_players;
		}
}

	@Override
	public List<Player_stats> findplayersByno_of_Minutes_played(Integer mis) throws PlayerNotFount {
		// TODO Auto-generated method stub
		   List<Player_stats>list_of_players=playerdao.findByMinutes(mis);
			
			if(list_of_players.isEmpty()) {
				throw new PlayerNotFount("Player not found with "+mis);
			}
			else {
				return list_of_players;
			}
	}

	@Override
	public List<Player_stats> findplayersByno_of_Goals(Integer goals) throws PlayerNotFount {
		// TODO Auto-generated method stub
		List<Player_stats>list_of_players_bygoal=playerdao.findByGoals(goals);
		
		if(list_of_players_bygoal.isEmpty()) {
			throw new PlayerNotFount("Player not found with "+goals);
		}
		else {
			return list_of_players_bygoal;
		}
	}

	@Override
	public List<Player_stats> findplayerBy_birth_year(Integer birth_year) throws PlayerNotFount {
		// TODO Auto-generated method stub
		
		List<Player_stats> list= playerdao.findByBirth_year(birth_year);
		if(list.isEmpty()) {
			throw new PlayerNotFount("Player not found with "+birth_year);
		}
		else {
			return list;
		}
	}

	
	
}
