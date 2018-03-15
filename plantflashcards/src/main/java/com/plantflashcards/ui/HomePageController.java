package com.plantflashcards.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
	
	// all attributes that are available for selection.
	private Map<String, PlantDecorator>  allPlantDecorators;
	
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
	public String addPlant(@RequestParam Map<String,String> requestParams, Model model) {
		// get all keys of the selected attributes.
		Set<String> selectedKeys = requestParams.keySet();
		
		// a collection of templates that correspond to the user's selection
		List<String> templates = new ArrayList<String>();
		
		// iterate over the selected keys, and get the template identifier.
		for (String key : selectedKeys) {
			PlantDecorator plantDecorator = allPlantDecorators.get(key);

			if (plantDecorator != null) {
				// a collection containing ONLY the selected decorators.
				plantDecorators.add(plantDecorator);
				String template = plantDecorator.getTemplate();
				templates.add(template);
			}
		}
		
		model.addAttribute("components", templates);
		model.addAttribute("plant", new Plant());
		return "addplant";
	}
	
	@RequestMapping("/saveplant")
	public String savePlant(Plant plant, @RequestParam Map<String,String> requestParams) {
		// implement the command pattern to process our decorators.
		// iterate over our Decorators, and invoke the command method
		for (PlantDecorator plantDecorator : plantDecorators) {
			plantDecorator.processSubmission(requestParams);
		}
		return "saveplant";
	}
	
}
