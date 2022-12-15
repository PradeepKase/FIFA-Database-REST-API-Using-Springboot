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
import com.masai.model.Player_stats;
import com.masai.services.Player_stats_services;



@RestController
@RequestMapping("fifa/api/v1/statistics")
public class Player_stats_controller {

	
	
	@Autowired
	private Player_stats_services playerservices;
	
	
	
	@GetMapping("/get-all-details")
	public ResponseEntity<List<Player_stats>> getallplayersDetails(){
		List<Player_stats> list=playerservices.getallplayersdetails();
		return new ResponseEntity<List<Player_stats>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/get-all-details/{get-by-id}")
	public ResponseEntity<Player_stats> getPlayerbyplayerid(@PathVariable("get-by-id") Integer id){
		Player_stats playerbyid = playerservices.getplayerbyid(id);
		return new ResponseEntity<Player_stats>(playerbyid, HttpStatus.OK);
	}
	
	
	@GetMapping("/getplayerbygames/{no_of_games}")
	public ResponseEntity<List<Player_stats>>getPlayerbyGeameshandler(@PathVariable("no_of_games") Integer games) throws PlayerNotFount{
	List<Player_stats>	list_of_players_by_no_of_games_played=playerservices.findplayersByno_of_Games_played(games);
	
		return new ResponseEntity<List<Player_stats>>(list_of_players_by_no_of_games_played, HttpStatus.OK);
	}
	
	
	@GetMapping("/getplayerbyminutes/{no_of_minutesPlayed}")
	public ResponseEntity<List<Player_stats>>getPlayerbyMinuteshandler(@PathVariable("no_of_minutesPlayed") Integer no_of_minutesPlayed) throws PlayerNotFount{
	List<Player_stats>	list_of_players_by_no_of_Minutes_played=playerservices.findplayersByno_of_Minutes_played(no_of_minutesPlayed);
	
		return new ResponseEntity<List<Player_stats>>(list_of_players_by_no_of_Minutes_played, HttpStatus.OK);
	}
	
	@GetMapping("/getplayerbygoals/{no_of_goals}")
	public ResponseEntity<List<Player_stats>>getPlayerbyGoalshandler(@PathVariable("no_of_goals") Integer no_of_goals) throws PlayerNotFount{
	List<Player_stats>	list_of_players_by_no_of_goal=playerservices.findplayersByno_of_Goals(no_of_goals);
	
		return new ResponseEntity<List<Player_stats>>(list_of_players_by_no_of_goal, HttpStatus.OK);
	}
	

	
	@GetMapping("/getbybirth_year/{birth_year}")
	public ResponseEntity<List<Player_stats>> getplayersby_Birthyear(@PathVariable("birth_year") Integer birth_year) throws PlayerNotFount{
		List<Player_stats> list=playerservices.findplayerBy_birth_year(birth_year);
		return new ResponseEntity<List<Player_stats>>(list, HttpStatus.OK);
	}
}
