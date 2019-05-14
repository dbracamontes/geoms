package com.bracamod.geo.dto;

public class Neighborhood {
	private Long id;
	private String name;
	private String zipCode;
	private String type;
	
	/**
	 * 
	 */
	public Neighborhood() {
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Neighborhood [id=" + id + ", name=" + name + ", zipCode=" + zipCode + ", type=" + type + "]";
	}

}
