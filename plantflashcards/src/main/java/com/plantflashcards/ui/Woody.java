package com.plantflashcards.ui;

import java.util.Map;

public class Woody implements PlantDecorator {

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Woody Plant";
	}

	@Override
	public String getTemplate() {
		// TODO Auto-generated method stub
		return "fragments/woody";
	}

	@Override
	public void processSubmission(Map<String, String> params) {
		String height = params.get("height");
		String fallColor = params.get("fallColor");
		int i = 1 + 1;

	}

}
