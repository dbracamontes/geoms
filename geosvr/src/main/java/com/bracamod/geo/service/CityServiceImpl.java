package com.bracamod.geo.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bracamod.geo.entity.City;
import com.bracamod.geo.jpa.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	//@HystrixCommand
	public Optional<List<City>> findByName(String name) {
		randomlyRunLong();
		return cityRepository.findByName(name);
	}
	
	private void randomlyRunLong(){
		Random random = new Random();
		int randomNum = random.nextInt((3-1) + 1) + 1;
		
		if(randomNum== 3) {
			System.out.println("thread sleep");
			
			try {
				Thread.sleep(11000);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
