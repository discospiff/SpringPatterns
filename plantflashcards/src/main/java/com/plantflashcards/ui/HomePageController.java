package com.plantflashcards.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
	
	// all attributes that are available for selection.
	Map<String, PlantDecorator>  allPlantDecorators;
	
	// The decorators that apply for our plants.
	private List<PlantDecorator> plantDecorators;
	
	public HomePageController() {
		plantDecorators = new ArrayList<PlantDecorator>();
		allPlantDecorators = new HashMap<String, PlantDecorator>();
		
		// instantiate each of our decorators and add them.
		// TODO: move this to a Spring configuration file.
		Woody woody = new Woody();
		Herbaceous herbaceous = new Herbaceous();
		Native nativeGeo = new Native();
		
		allPlantDecorators.put(woody.getLabel(), woody);
		allPlantDecorators.put(herbaceous.getLabel(), herbaceous);
		allPlantDecorators.put(nativeGeo.getLabel(), nativeGeo);
		
		
	}

	@RequestMapping("/home")
	public String home(@RequestParam(value="name", required=false, defaultValue="Friend") String name, Model model) {
		model.addAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("/selectattributes")
	public String selectAttributes(Model model) {
		// pass all possible decorators to our form.
		model.addAttribute("components", allPlantDecorators.keySet());
		return "selectattributes";
	}
	
	@RequestMapping("/addplant")
	public String addPlant(@RequestParam Map<String,String> requestParams) {
		
		return "addplant";
	}
	
}
