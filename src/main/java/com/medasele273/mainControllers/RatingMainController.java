package com.medasele273.mainControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medasele273.models.Rating;
import com.medasele273.services.RatingService;

@Controller
@RequestMapping("/ratings")
public class RatingMainController {
	
	@Autowired
	private RatingService ratingService;
	
	@RequestMapping("/")
	public String getRatings(Model model) {
		List<Rating> ratings = ratingService.getListOfRatings();
		model.addAttribute("ratings",ratings);
		return "rating";
	}
	
	@PostMapping("/add")
	public String addNew(Rating rating) {
		ratingService.add(rating);
		return "redirect:/ratings/";
	}
	
	@RequestMapping(value = "/delete/{id}", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(@PathVariable Integer id) {
		ratingService.deleteById(id);
		return "redirect:/ratings/";
	}

}
