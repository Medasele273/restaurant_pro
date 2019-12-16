package com.medasele273.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/*
 *  To solve infinite Recursion stackOverFlow error
 *  we use @JosnMananagedReference and JosnBackedReference
 *  
 *  @JsonManagedReference is used on the OneToMany side 
 *  
 *  while the @JsonBackReference is used at the @ManyToOne side.
 *  
 */

@Entity
public class Restaurant {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
	private Integer id;
	
	private String name;
	
	private String city;
	
	
	//we are telling this id handled by the Menu table by having restaurant_id to not crate other table by restaurant
	@OneToMany (mappedBy = "restaurant")  
	private List<Menu> recommendedMenus = new ArrayList<>();
	
	//we are telling this is handled by the Rating table by having restaurant_id to not create other table restaurant
	@OneToMany (mappedBy = "restaurant") 
	private List<Rating> ratingList= new ArrayList<>();
	
	public Restaurant() {
		
	}

	public Restaurant(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonManagedReference
	public List<Menu> getMenus() {
		return recommendedMenus;
	}

	public void setMenus(List<Menu> recommendedMenus) {
		this.recommendedMenus = recommendedMenus;
	}
   
	@JsonManagedReference
	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}
	
	

}
