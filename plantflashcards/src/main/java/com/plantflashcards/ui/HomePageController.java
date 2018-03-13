package com.plantflashcards.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
	
	// The decorators that apply for our plants.
	private List<PlantDecorator> plantDecorators;
	
	public HomePageController() {
		plantDecorators = new ArrayList<PlantDecorator>();
	}

	@RequestMapping("/home")
	public String home(@RequestParam(value="name", required=false, defaultValue="Friend") String name, Model model) {
		model.addAttribute("name", name);
		return "home";
	}
	
}
