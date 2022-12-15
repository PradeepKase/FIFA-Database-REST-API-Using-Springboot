package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.PlayerNotFount;
import com.masai.model.Player_defence;
import com.masai.model.Player_stats;
import com.masai.services.Player_defence_services;
@RequestMapping("fifa/api/v1/defense")
@RestController    //combination of controller and responce , we don’t need to use @ResponseBody on every handler method.
public class Player_defence_controller {

	@Autowired  //dependency
	private Player_defence_services playerdefenceservices;
	
	
	// to get All players list 
	//API Route: localhost:8081/fifa/api/v1/defense/getallPlayers
	
	@GetMapping("/getallPlayers")
	public ResponseEntity<List<Player_defence>> getallpayerslist(){
		List<Player_defence> listofplayers=playerdefenceservices.getallplayersdetails();
		return new ResponseEntity<List<Player_defence>>(listofplayers, HttpStatus.OK);
	}
	
	
	
	
	
	// to get player by his id  
	//API Route: localhost:8081/fifa/api/v1/defense/getplayerbyid/1
	
	@GetMapping("/getplayerbyid/{get-by-id}")
	public ResponseEntity<Player_defence> getPlayerbyplayerid(@PathVariable("get-by-id") Integer id) throws PlayerNotFount{
		Player_defence playerbyid =playerdefenceservices.getplayerbyplarerid(id);
		return new ResponseEntity<Player_defence>(playerbyid, HttpStatus.OK);
	}

	
	
	
	
	
	// to get players by there position 
	//API Route: localhost:8081/fifa/api/v1/defense/getbyposition/MF

	@GetMapping("/getbyposition/{position}")
	public ResponseEntity<List<Player_defence>>getPlayerbypositionhandler(@PathVariable("position") String position) throws PlayerNotFount{
	List<Player_defence>	list_of_players_by_position =playerdefenceservices.getPlayersbyposition(position);
	
		return new ResponseEntity<List<Player_defence>>(list_of_players_by_position, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	// to get players by Team name
	//API Route: localhost:8081/fifa/api/v1/defense/getbyTeam/Australia
	
	@GetMapping("/getbyTeam/{team}")
	public ResponseEntity<List<Player_defence>>getPlayerbyteamhandler(@PathVariable("team") String team) throws PlayerNotFount{
	List<Player_defence>	list_of_players_by_Team =playerdefenceservices.getPlayersbyteam(team);
	
		return new ResponseEntity<List<Player_defence>>(list_of_players_by_Team, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	// to get players by tackles
	//API Route: localhost:8081/fifa/api/v1/defense/getbytackles/4
	
	@GetMapping("/getbytackles/{tackle}")
	public ResponseEntity<List<Player_defence>> getplayersbytackleHandler(@PathVariable("tackle") Integer Tackles) throws PlayerNotFount{
	List<Player_defence> playersbyTacles=playerdefenceservices.getplayersByTackles(Tackles);
	
	return new ResponseEntity<List<Player_defence>>(playersbyTacles, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	// to get players by tackles won
	//API Route: localhost:8081/fifa/api/v1/defense/getbytackles_won/2
	
	@GetMapping("/getbytackleswon/{tackles_won}")
	public ResponseEntity<List<Player_defence>> getplayersbytackleswonHandler(@PathVariable("tackles_won") Integer Tackles_won) throws PlayerNotFount{
	List<Player_defence> playersbyTacles_won=playerdefenceservices.getplayersByTackles_Won(Tackles_won);
	
	return new ResponseEntity<List<Player_defence>>(playersbyTacles_won, HttpStatus.OK);
	}
	
	
	
	
	
	
	// to get Player name by playerid
	//API Route: localhost:8081/fifa/api/v1/defense/getpersonsnamebypersonid/1
	
	@GetMapping("/getpersonsnamebypersonid/{person_id}")
	public ResponseEntity<String> getpersonsnamebyid(@PathVariable("person_id") Integer person_id) throws PlayerNotFount{
	String s=playerdefenceservices.getplayernamebyid(person_id);
		return new  ResponseEntity<String>(s, HttpStatus.OK);
	}
}	
