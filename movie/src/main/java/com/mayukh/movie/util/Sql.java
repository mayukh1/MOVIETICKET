package com.mayukh.movie.util;

public interface Sql {
	
		final String ID = "id";
	
		public interface Movie { 
			final String GET_ALL_Movies = "SELECT * FROM movie " ;
			final String ADD_MOVIES = "INSERT into movie (name,details,releseDate,duration,year,country) VALUES (?,?,?,?,?,?)"; 
		}

}
