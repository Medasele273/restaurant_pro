package com.medasele273.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medasele273.models.Menu;
import com.medasele273.models.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{
	
	Optional<Restaurant> getRestaurantByName(String name);
	
	Optional<Restaurant> getRestaurantByCity(String city);
	
	List<Menu> findMenusById(Integer id);
}
