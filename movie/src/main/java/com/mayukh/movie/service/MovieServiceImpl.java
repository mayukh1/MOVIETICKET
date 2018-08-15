package com.mayukh.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayukh.movie.dao.MovieDao;
import com.mayukh.movie.models.Movie;
@Service(value = "movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private  MovieDao dao;

	@Override
	public List<Movie> getMovies() {
		return dao.getMovies();
	}

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return dao.addMovie(movie);
	}

}
