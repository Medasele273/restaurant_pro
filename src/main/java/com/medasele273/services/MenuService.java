package com.medasele273.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medasele273.models.Menu;
import com.medasele273.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> getMenus(){
		return (List<Menu>) menuRepository.findAll();
	}
	
	
	public List<Menu> getMenuByRestaurantId(Integer id){
		List<Menu> menus = (List<Menu>) menuRepository.findAll();
		return menus.stream().filter(m-> m.getRestaurant().getId().equals(id)).collect(Collectors.toList());
	}
	
	public Optional<Menu> find(Integer id){
		return menuRepository.findById(id);
	}
	
	public void addNew(Menu menu) {
		menuRepository.save(menu);
	}
	
	public void update(Menu menu) {
		menuRepository.save(menu);
	}
	
	public void delete(Integer id) {
		menuRepository.deleteById(id);
	}
	
	public List<Menu> getMenusWithBestPrice(Double limit){
		List<Menu> menus =(List<Menu>) menuRepository.findAll();
		
		return menus.stream().filter(m->m.getPrice() < limit).collect(Collectors.toList());
	}

}
