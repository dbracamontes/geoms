package com.bracamod.geo.index.converter;

import com.bracamod.geo.entity.City;
import com.bracamod.geo.entity.State;

import java.util.List;

import com.bracamod.geo.dto.StateDto;
public class StateConverterImpl implements GenericConverter<State, StateDto> {

	@Override
	public StateDto apply(State state) {
		
		StateDto stateDto = new StateDto();
		stateDto.setId(state.getId());
		stateDto.setName(state.getName());

		List<City> cities = state.getCities();
		
		return stateDto;
	}

}
