package com.bracamod.geo.dto;

import java.util.List;

public class CityDto {
	private Long id;
	private String name;
	private List<Neighborhood> neigborhoods;
	
	/**
	 * 
	 */
	public CityDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Neighborhood> getNeigborhoods() {
		return neigborhoods;
	}

	public void setNeigborhoods(List<Neighborhood> neigborhoods) {
		this.neigborhoods = neigborhoods;
	}

	@Override
	public String toString() {
		return "CityDto [id=" + id + ", name=" + name + ", neigborhoods=" + neigborhoods + "]";
	}	
	
}
