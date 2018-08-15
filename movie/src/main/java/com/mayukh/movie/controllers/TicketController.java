package com.mayukh.movie.controllers;

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
import com.mayukh.movie.service.Ticket.Ticket;

@RestController
@RequestMapping("/Ticket")
public class TicketController {
	@Autowired
	private Ticket ticketService;

	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(TicketController.class);

	@RequestMapping(value = "/seats", method = RequestMethod.GET)
	public int allAvailableSeats() {
		logger.debug("Finding number of seats available");
		final int numSeatsAvailable = ticketService.numSeatsAvailable();
		logger.debug("Number of seats available for all levels are {}", numSeatsAvailable);
		return numSeatsAvailable;
	}

	////////////// API FOR MOVIETICKET MAPPING ///////////////////////

	@RequestMapping(value = "/movieTicketMapping", method = RequestMethod.POST)
	public String createStoreUser(@RequestBody Movie movie)throws JsonProcessingException {
		return null;
	}

	///////// Book Ticket //////////////////////////////////////

	@RequestMapping(value = "/bookTicket", method = RequestMethod.POST)
	public String addMovie(@RequestBody Movie movi, BindingResult result) throws JsonProcessingException {
		System.out.println("test");
		return null;

	}

}
