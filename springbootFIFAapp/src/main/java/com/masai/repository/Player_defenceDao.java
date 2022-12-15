package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Player_defence;
import com.masai.model.Player_stats;
@Repository
public interface Player_defenceDao extends JpaRepository<Player_defence, Integer>{

	public List<Player_defence> findByPosition(String position);
	
	public List<Player_defence> findByTeam(String team);
	
	public List<Player_defence> findByTackles(Integer tackles);
	
	
	@Query("select s from Player_defence s where s.tackles_won=:tackles_won")   //named placeed positioning
  public List<Player_defence> findByTackles_won(@Param("tackles_won") Integer tackles_won);
//	
//	public List<Player_defence> findByTackles_Won(Integer tackles_won);
}
