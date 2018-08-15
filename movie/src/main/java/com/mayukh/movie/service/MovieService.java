package com.mayukh.movie.service;

import java.util.List;

import com.mayukh.movie.models.Movie;

public interface MovieService {
	List<Movie> getMovies();
	Movie addMovie(Movie movie);

}
