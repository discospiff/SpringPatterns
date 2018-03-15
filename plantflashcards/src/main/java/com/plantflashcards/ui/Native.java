package com.plantflashcards.ui;

import java.util.Map;

public class Native implements PlantDecorator {

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Native";
	}

	@Override
	public String getTemplate() {
		// TODO Auto-generated method stub
		return "fragments/native";
	}

	@Override
	public void processSubmission(Map<String, String> params) {
		String region = params.get("region");
		int i = 1 + 1;
	}

}
