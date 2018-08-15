package com.mayukh.movie.models.mapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mayukh.movie.models.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SqlDataMapper {
	
	public class MovieMapper implements RowMapper<Movie> {
		public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
			Movie movie= new Movie();
			movie.setId(rs.getLong("id"));
			movie.setName(rs.getString("name"));
			movie.setDetails(rs.getString("details"));
			movie.setDuration(rs.getLong("duration"));
			movie.setCountry(rs.getString("country"));
			return movie;
		}
	}

}
