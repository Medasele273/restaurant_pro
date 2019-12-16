package com.medasele273.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;

/*
 *  To solve infinite Recursion stackOverFlow error
 *  we use @JosnMananagedReference and JosnBackedReference
 *  
 *  
 *  @JsonManagedReference is used on the OneToMany side 
 *  
 *  while the @JsonBackReference is used at the @ManyToOne side.
 *  
 */

@Entity
public class Menu {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
	private Integer id;
	
    private String name;
    
    private String type;
    
    private Double price;
    
  
    
    
    @ManyToOne  // menu table is gone have resturant_id
    @JoinColumn( name = "restaurant_id")
    private Restaurant restaurant;
    
    
    public Menu() {
    	
    }


	public Menu(Integer id, String name, String type, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	@JsonBackReference
	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	
}
