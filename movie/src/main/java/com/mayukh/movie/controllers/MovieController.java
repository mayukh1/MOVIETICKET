package com.mayukh.movie.controllers;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mayukh.movie.models.Movie;
import com.mayukh.movie.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieService movieService;

	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(MovieController.class);

	/////////  GET LIST OF MOVIES  //////////////////////////////
	
	@RequestMapping(value = "/getMovie", method = RequestMethod.GET)
	public List<Movie> getMovies() throws JsonProcessingException {
		System.out.println("I AM INSIDE THE CONTROLLER");
		return movieService.getMovies();
	}
	
	/////////  ADD MOVIES  //////////////////////////////////////

	@RequestMapping(value = "/addMovie", method = RequestMethod.POST)
	public String addMovie(@RequestBody Movie movie, BindingResult result) throws JsonProcessingException {
		System.out.println("test");
		if (movie != null) {
			if (StringUtils.isBlank(movie.getName())) {
				return ("Movie name cant be empty");
			}
		}
		Movie movie1 = movieService.addMovie(movie);
		if(movie1!=null) {
			return "sucessfully added";

		}
		return null;
		
	}

}
