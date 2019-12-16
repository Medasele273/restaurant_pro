package com.medasele273.mainControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medasele273.models.Menu;
import com.medasele273.models.Restaurant;
import com.medasele273.services.RestaurantService;

@Controller
@RequestMapping("/restaurants")
public class RestaurantMainController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	
	@RequestMapping("/")
	public String getRestaurants(Model model) {
		List<Restaurant> restaurants = restaurantService.getAllRestaurant();
		model.addAttribute("restaurants",restaurants);
		return "restaurant";
	}
	
	@RequestMapping(value = "/add" , method = {RequestMethod.POST , RequestMethod.GET})
	public String addRestaurant(Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
		return "redirect:/restaurants/";
	}
	
	@RequestMapping(value = "/delete" , method = {RequestMethod.DELETE , RequestMethod.GET})
	public String delete(Integer id) {
		restaurantService.delete(id);
		return "redirect:/restaurants/";
	}
	

}
