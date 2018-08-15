package com.mayukh.movie.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mayukh.movie.models.Movie;
import com.mayukh.movie.models.mapper.SqlDataMapper;
import com.mayukh.movie.util.Sql;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Repository(value="dao")
public class MovieDaoImpl implements MovieDao {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(MovieDaoImpl.class);
	 @Autowired
	 JdbcTemplate jdbcTemplate;
	 @Autowired
	 SqlDataMapper mapper;

	@Override
	public Movie addMovie(Movie movie) {
		int saveMovie = 0;
		try {
			saveMovie = jdbcTemplate.update(Sql.Movie.ADD_MOVIES,
					new Object[] {movie.getName(),movie.getDetails(), movie.getReleseDate(),movie.getYear(),movie.getCountry()});
		} catch (Exception ex) {
			LOGGER.error("Encountered an exception while saving the Movie Details : " + ex);
		}
		if (saveMovie > 0) {
			return movie;
		}
		return null;
	}


	@Override
	public List<Movie> getMovies() {
		List<Movie> movies = null;
        try {
        	movies = jdbcTemplate.query(Sql.Movie.GET_ALL_Movies, 
        			mapper.new MovieMapper()); 
        } catch (Exception e) {
        	LOGGER.error("Encountered an exception while fetching all roles" + e);
        }
		return movies;
	}

}
