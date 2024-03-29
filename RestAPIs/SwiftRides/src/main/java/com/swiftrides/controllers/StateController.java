package com.swiftrides.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiftrides.models.State;
import com.swiftrides.services.StateService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StateController 
{
	@Autowired
	StateService sservice;
	
	@GetMapping("/getStates")
	public List<State> getAllStates()
	{
		return sservice.getStates();
	}
	
	@GetMapping("/getstate")
	public State getOneState(@RequestParam("stateid") int stateid)
	{
		return sservice.getState(stateid);
	}
	
	@GetMapping("/getOneState/{sid}")
	public State getOne(@PathVariable("sid")int stateid)
	{
		return sservice.getState(stateid);
	}
}
