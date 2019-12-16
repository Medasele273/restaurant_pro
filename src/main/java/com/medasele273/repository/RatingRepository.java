package com.medasele273.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medasele273.models.Rating;


@Repository
public interface RatingRepository  extends CrudRepository<Rating, Integer>{
	
	

}
