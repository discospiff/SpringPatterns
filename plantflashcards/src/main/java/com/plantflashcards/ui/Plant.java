package com.plantflashcards.ui;

import com.plantflashcards.helper.PlantHelper;

/**
 * The data that represents a plant.
 * @author ucint
 *
 */
public class Plant {
	private String genus;
	private String species;
	private String cultivar;
	private String common;
	
	public String accept(PlantHelper plantHelper) {
		return plantHelper.visit(this);
	}
	
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getCultivar() {
		return cultivar;
	}
	public void setCultivar(String cultivar) {
		this.cultivar = cultivar;
	}
	public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
}
