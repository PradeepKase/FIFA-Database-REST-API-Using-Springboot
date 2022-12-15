package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.exceptions.PlayerNotFount;
import com.masai.model.Player_defence;
import com.masai.repository.Player_defenceDao;




@Service
public class Player_defence_servicesImpl implements Player_defence_services{
	@Autowired      // dependency
	private Player_defenceDao playerdefencedao;

	
	
	
	@Override
	public List<Player_defence> getallplayersdetails() {
		// TODO Auto-generated method stub
		List<Player_defence> playerlist= playerdefencedao.findAll();
		return playerlist;
	}


	

	@Override
	public Player_defence getplayerbyplarerid(Integer playerid) throws PlayerNotFount {
		// TODO Auto-generated method stub
//		Optional<Player_defence> opt= playerdefencedao.findById(playerid);
//		Player_defence plarebyid=opt.get();
//		return plarebyid;
		
		return playerdefencedao.findById(playerid).orElseThrow(()->new PlayerNotFount("Player not found with this id\"+ bookid"));	
		
		}



	
	@Override
	public List<Player_defence> getPlayersbyposition(String position) throws PlayerNotFount {

		List <Player_defence>playersbyposition= playerdefencedao.findByPosition(position);
		if(playersbyposition.isEmpty()) { 
			throw new PlayerNotFount("players not fount with "+position);
		}
		return playersbyposition;
	}



	@Override
	public List<Player_defence> getPlayersbyteam(String team) throws PlayerNotFount {
		List <Player_defence>playersbyTeam= playerdefencedao.findByTeam(team);
		if(playersbyTeam.isEmpty()) { 
			throw new PlayerNotFount("players not fount with "+team);
		}
		return playersbyTeam;
	}



	
	@Override
	public List<Player_defence> getplayersByTackles(Integer tackles) throws PlayerNotFount {

		List<Player_defence> playerbyTackels =playerdefencedao.findByTackles(tackles);
		if(playerbyTackels.isEmpty()) {
			throw new PlayerNotFount("players not fount with "+tackles);
		}
		return playerbyTackels;
	}



	@Override
	public List<Player_defence> getplayersByTackles_Won(Integer tackles_won) throws PlayerNotFount {
		// TODO Auto-generated method stub
		List<Player_defence> playerbyTackels_won=playerdefencedao.findByTackles_won(tackles_won);
		
		if(playerbyTackels_won.isEmpty()) {
			throw new PlayerNotFount("players not fount with "+tackles_won);
		}
		return playerbyTackels_won;
	}


	
	

	@Override
	public String getplayernamebyid(Integer playerid) throws PlayerNotFount {
		// TODO Auto-generated method stub
		Optional<Player_defence> opt= playerdefencedao.findById(playerid);
		String  playername=opt.get().getPlayer();
		if(playername.isEmpty()) {
			throw new PlayerNotFount("player not found with "+playerid);
		}
		return playername;
	}
	
	
	

}


