package com.medasele273.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medasele273.models.Menu;
import com.medasele273.models.Restaurant;
import com.medasele273.services.RestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping("/restaurant")
	public List<Restaurant> getAllRestaurants(){
		return restaurantService.getAllRestaurant();
	}
	
	@RequestMapping("/restaurant/id/{id}")
	public Optional<Restaurant> getRestaurantById(@PathVariable Integer id) {
		return restaurantService.getRestaurantById(id);
	}
	
	@RequestMapping("/restaurant/name/{name}")
	public Optional<Restaurant> getRestaurantByName(@PathVariable String name){
		return restaurantService.getRestaurantByName(name);
	}
	
	@RequestMapping("/restaurant/city/{city}")
	public Optional<Restaurant> getRestaurantByCity(@PathVariable String city){
		return restaurantService.getRestaurantByCity(city);
	}
	
	@PostMapping("/addNewRestaurant")
	public void addNew( Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
	}
	
	@PutMapping("/updateRestaurant")
	public void update(Restaurant restaurant) {
		restaurantService.update(restaurant);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable ("id") Integer id) {
		restaurantService.delete(id);
	}
	
	@RequestMapping("/menu1/{id}")
	public List<Menu> findMenusByRestaurantId(@PathVariable Integer id){
		return restaurantService.findMenusById(id);
	}

}
