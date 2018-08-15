package com.mayukh.movie.util;

public interface API {
	public interface Authentication { 
		final String USER_AUTHENTICATION = "/login" ;
		final String TOKEN_VALIDATOR="/token/validate";
		final String GET_ALL_SEATS="/allSeats";
		final String BOOK_SEATS="/seats";
		final String MOVIE="/addMovie";
		final String GETALL_MOVIES="/getMovie";
		final String MOVIE_TICKET_MPPING="/mappingMovieTicket";	
		final String USER_MOVIE="/mappingUserMovie";
	}

}
