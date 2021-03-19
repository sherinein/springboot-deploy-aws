package org.fns.microservice.resource;

import java.util.Arrays;

import org.fns.microservice.model.Rating;
import org.fns.microservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	@RequestMapping("/movie/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId){
		
		return new Rating(movieId,4);
	}
	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId")String userId) {
		UserRating userRating =new UserRating();
		userRating.setUserId(userId);
		userRating.setRatings(Arrays.asList(
				new Rating("100",3),
				new Rating("101",4)
				
				));
		
		return userRating;
	}
}
