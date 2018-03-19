package com.plantflashcards.helper;

import org.json.simple.JSONObject;

public class WoodyHelper extends PlantHelper {
	private int height;
	private String fallColor;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void typeSpecificJSON(JSONObject jsonObject) {
		jsonObject.put("height", height);
		jsonObject.put("fallColor", fallColor);
		
	}
	
}
