package com.bracamod.geo.features;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.bracamod.geo.jpa.repository.StateRepository;
import com.bracamod.geo.test.CucumberStepDefinitions;
import com.bracamod.geo.entity.State;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StateFeature  extends CucumberStepDefinitions{
	
	@Autowired
	private StateRepository stateRepository;
	
	
	@When("^the client calls with id (\\d+)$")
	public void when_i_feed_my_snake() {
		try {
			Optional<State> state = stateRepository.findById(1L);

			System.out.println(state);
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
 
	@Then("^the client receives response status code of (\\d+)$")
	public void receive_snek_snek()  {
		System.out.println("then");
	}
 
}
