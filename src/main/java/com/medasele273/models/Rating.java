package com.medasele273.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

/*
 *  To solve infinite Recursion stackOverFlow error
 *  we use @JosnMananagedReference and JosnBackedReference
 *  
 */

@Entity
public class Rating {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
	private Integer id;
	
	private String email;
	
	@Column(name = "rating_star")
	private Double ratingStar;
	
	@ManyToOne //rating table is gone have restaurant_id
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

	public Rating() {
		super();
	}

	public Rating(Integer id, String email, Double rating) {
		
		this.id = id;
		this.email = email;
		this.ratingStar = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonBackReference
	public Double getRatingStar() {
		return ratingStar;
	}

	public void setRatingStar(Double rating) {
		this.ratingStar = rating;
	}

	
	
}
