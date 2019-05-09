package com.bracamod.geo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bracamod.geo.entity.Neighborhood;
import com.bracamod.geo.jpa.repository.NeighborhoodRepository;

@RestController
@RequestMapping(value = "/neighboors", produces=MediaType.APPLICATION_JSON_VALUE)
public class NeighborhoodController {
	
	@Autowired
	private NeighborhoodRepository neighborhoodRepository;

	@GetMapping
	public List<Neighborhood> getAll(){
		
		return neighborhoodRepository.findAll();
	}
	
	@GetMapping("/{neigborhoodId}")
	@ResponseBody
	public ResponseEntity<Neighborhood> findById(@PathVariable Long neigborhoodId){
		Optional<Neighborhood> optional = neighborhoodRepository.findById(neigborhoodId);
		
		Neighborhood neighborhood = optional.isPresent() ? optional.get() : null;
		HttpStatus httpStatus = optional.isPresent() ? HttpStatus.OK : HttpStatus.NO_CONTENT;
		
		return new ResponseEntity<Neighborhood>(neighborhood,httpStatus);		
	}
	
}
