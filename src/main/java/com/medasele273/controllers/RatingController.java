package com.medasele273.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medasele273.models.Rating;
import com.medasele273.services.RatingService;

@RestController
@RequestMapping("/api")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@RequestMapping("/allRatings")
	public List<Rating> getRatingList(){
		return ratingService.getListOfRatings();
	}	

}
