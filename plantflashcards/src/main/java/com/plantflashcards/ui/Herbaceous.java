package com.plantflashcards.ui;

import java.util.Map;

public class Herbaceous implements PlantDecorator {

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Herbaceous Plant (Flower)";
	}

	@Override
	public String getTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processSubmission(Map<String, String> params) {
		// TODO Auto-generated method stub

	}

}
