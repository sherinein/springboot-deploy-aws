package org.fns.microservice.resource;

import org.fns.microservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		Movie movie = new Movie(movieId, "ABC Movie", "ABC Movie Description");
		return movie;

	}
}
