package com.medasele273.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medasele273.models.Menu;
import com.medasele273.services.MenuService;

@RestController
@RequestMapping("/api")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/home")
	public String Homes() {
		return "menu";
	}
	
	@RequestMapping("/allMenus")
	public List<Menu> getRecommendedMenu(){
		return (List<Menu>) menuService.getMenus();
	}
	
	@RequestMapping("/restaurant/{id}")
	public List<Menu> getMenusByRestaurant(@PathVariable Integer id){
		return menuService.getMenuByRestaurantId(id);
	}
	
	@RequestMapping("/menu/{id}")
	public Optional<Menu> getMenuById(@PathVariable Integer id){
		return menuService.find(id);
	}
	
	@PostMapping("/addNewMenu")
	public void addNew(Menu menu) {
		menuService.addNew(menu);
	}
	
	@PutMapping("/updateMenu")
	public void update(Menu menu) {
		menuService.update(menu);
	}
	
	@DeleteMapping("/deleteMenu/{id}")
	public void delete(@PathVariable ("id") Integer id) {
		menuService.delete(id);
	}
	
	@GetMapping("/best/{limit}")
	public List<Menu> getMenusWithBestPrice(@PathVariable Double limit){
		return menuService.getMenusWithBestPrice(limit);
	}

}
