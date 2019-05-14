package com.bracamod.geo.dto;

import java.util.List;

public class StateDto {

	private Long id;
	private String name;
	private List<CityDto> cities;
	
	/**
	 * 
	 */
	public StateDto() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cities
	 */
	public List<CityDto> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<CityDto> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "StateDto [id=" + id + ", name=" + name + ", cities=" + cities + "]";
	}
	
}
