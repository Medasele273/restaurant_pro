package com.medasele273.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medasele273.models.Menu;


@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer>{
	
	List<Menu> getMenuByPrice(Double limt);
	
	List<Menu> getMenusByRestaurantId(Integer id);
	

}
