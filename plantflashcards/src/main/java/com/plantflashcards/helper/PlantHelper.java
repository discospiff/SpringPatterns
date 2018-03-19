package com.plantflashcards.helper;

public class PlantHelper {

	private String genus;
	private String species;
	private String cultivar;
	private String common;
	private String nativeRegion;
	private EvergreenHelper evergreenHelper;
	
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
	public String getNativeRegion() {
		return nativeRegion;
	}
	public void setNativeRegion(String nativeRegion) {
		this.nativeRegion = nativeRegion;
	}
	public EvergreenHelper getEvergreenHelper() {
		return evergreenHelper;
	}
	public void setEvergreenHelper(EvergreenHelper evergreenHelper) {
		this.evergreenHelper = evergreenHelper;
	}
	
}
