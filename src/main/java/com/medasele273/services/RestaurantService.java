package com.medasele273.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medasele273.models.Menu;
import com.medasele273.models.Restaurant;
import com.medasele273.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public List<Restaurant> getAllRestaurant(){
		return (List<Restaurant>) restaurantRepository.findAll();
	}
	
	public Optional<Restaurant> getRestaurantById(Integer id) {
		return restaurantRepository.findById(id);
	}
	
	public Optional<Restaurant> getRestaurantByName(String name) {
		
		return restaurantRepository.getRestaurantByName(name);
	}
	
	public Optional<Restaurant> getRestaurantByCity(String city){
		return restaurantRepository.getRestaurantByCity(city);
	}
	
	public void addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
	
	public void update(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
	
	public void delete(Integer id) {
		restaurantRepository.deleteById(id);
	}
	
	public List<Menu> findMenusById(Integer id){
		return restaurantRepository.findMenusById(id);
	}

}
