package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;

import com.masai.model.Player_stats;
@Repository
public interface Player_statsDao extends JpaRepository<Player_stats, Integer>{
	public List<Player_stats> findByGames(Integer games);
	public List<Player_stats> findByMinutes(Integer mins);
	public List<Player_stats> findByGoals(Integer goals);
	
	@Query("select a from Player_stats a where a.birth_year=:birth_year")
	public List<Player_stats> findByBirth_year(@Param("birth_year") Integer birth_year);
	
}
