package com.medasele273.mainControllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medasele273.models.Menu;
import com.medasele273.models.Restaurant;
import com.medasele273.services.MenuService;
import com.medasele273.services.RestaurantService;

@Controller
@RequestMapping("/menus")
public class MenuMainController {
	
	@Autowired
	private MenuService menuService;
	
	
	
	
	@RequestMapping("/")
	public String getMeuns(Model model) {
		List<Menu> menus = menuService.getMenus();
		
	
		model.addAttribute("menus",menus);
		
		return "menu";
	}
	
	@RequestMapping("/getOne/{id}")
	@ResponseBody
	public Optional<Menu> getOne(@PathVariable Integer id) {
		return menuService.find(id);
		
	}
	
	@RequestMapping(value = "/add", method= {RequestMethod.POST, RequestMethod.GET})
	public String addNew(Menu menu) {
		menuService.addNew(menu);
		return "redirect:/menus/";
	}
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		menuService.delete(id);
		return "redirect:/menus/";
	}

}
