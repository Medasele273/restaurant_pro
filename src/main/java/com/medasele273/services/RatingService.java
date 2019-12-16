package com.medasele273.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medasele273.models.Rating;
import com.medasele273.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;
	
	
	public List<Rating> getListOfRatings(){
		return (List<Rating>) ratingRepository.findAll();
	}
	
	public void add(Rating rating) {
		ratingRepository.save(rating);
	}
	
     public void delete(Rating rating) {
	   ratingRepository.delete(rating);
	}
     
     public void deleteById(Integer id) {
    	 ratingRepository.deleteById(id);
     }

}
