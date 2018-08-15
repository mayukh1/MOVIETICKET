package com.mayukh.movie.service.Ticket;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.mayukh.movie.dao.Ticket.TicketDao;

@Service(value="ticketService")
public class TicketServiceImpl implements Ticket{

	@Autowired 
	TicketDao dao;
	@Value("${seat.hold}")
	private int expirationSeconds;

	/////////  GETTING NO OF AVAILABLE SEATS ///////////////////////////
	
	@Override
	public int numSeatsAvailable() {
		removeExpiredHoldSeats();
        final int availableSeats;
        return 1;
	}
	
	 private void removeExpiredHoldSeats() {
	        final List<Long> seatHold =dao.findHoldingSeat(Timestamp.from(getExpirationInstant()));
	        if (CollectionUtils.isEmpty(seatHold)) {
	            
	        } else {
	            //LOGGER.debug("No expired seat holds found");
	        }
	    }
	 
	 ///// 2 min of  booking seat locked ////////////////////
	 private Instant getExpirationInstant() {
	        LocalDateTime now = LocalDateTime.now();
	        LocalDateTime minusExpiredSeconds = now.minusSeconds(expirationSeconds);
	        return minusExpiredSeconds.atZone(ZoneId.systemDefault()).toInstant();
	    }

}
