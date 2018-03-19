package com.plantflashcards.helper;

import org.json.simple.JSONObject;

public class HerbaceousHelper extends PlantHelper {
	private String flowerColor;
	private String flowerTime;
	
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	public String getFlowerTime() {
		return flowerTime;
	}
	public void setFlowerTime(String flowerTime) {
		this.flowerTime = flowerTime;
	}
	@Override
	public void typeSpecificJSON(JSONObject jsonObject) {
		jsonObject.put("flowerColor", flowerColor);
		jsonObject.put("flowerTime", flowerTime);
		
	}
}
