package com.mayukh.movie.dao;

import java.util.List;

import com.mayukh.movie.models.Movie;

public interface MovieDao {
	 public Movie addMovie(Movie movie);
	 public List<Movie> getMovies();

}
