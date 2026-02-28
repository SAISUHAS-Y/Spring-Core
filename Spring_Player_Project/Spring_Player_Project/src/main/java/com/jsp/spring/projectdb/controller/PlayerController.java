package com.jsp.spring.projectdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.spring.projectdb.service.PlayerService;

@Controller
public class PlayerController {
	@Autowired
	private PlayerService playerService;

	public void addPlayer() {
		playerService.addPlayer();
	}

	public void findPlayerById() {
		playerService.findPlayerById();

	}

	public void findPlayerByName() {
		playerService.findPlayerByName();
	}

	public void findAllPlayerByNation() {
		playerService.findAllPlayerByNation();
	}

	public void findAllPlayerBetweenAge() {
		playerService.findAllPlayerBetweenAge();
	}

	public void findAllPlayerBySalaryGreaterThan() {
		playerService.findAllPlayerBySalaryGreaterThan();
	}

	public void updatePlayerSalaryByTeam() {
		playerService.updatePlayerSalaryByTeam();
	}

	public void updatePlayerTeamByName() {
		playerService.updatePlayerTeamByName();
	}

	public void deleteAllPlayerByTeam() {
		playerService.deleteAllPlayerByTeam();
	}
	public void deletePlayersBetweenSalary() {
		playerService.deletePlayersBetweenSalary();
	}
}
