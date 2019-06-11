package com.bracamod.geo.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bracamod.geo.entity.City;

public class CityDto {
	private Long id;
	private String name;
	private List<NeighborhoodDto> neigborhoods;
	
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

	public List<NeighborhoodDto> getNeigborhoods() {
		return neigborhoods;
	}

	public void setNeigborhoods(List<NeighborhoodDto> neigborhoods) {
		this.neigborhoods = neigborhoods;
	}

	@Override
	public String toString() {
		return "CityDto [id=" + id + ", name=" + name + ", neigborhoods=" + neigborhoods + "]";
	}	
	
}
