package com.mayukh.movie.dao.Ticket;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository(value="dao")
public class TicketDaoImpl implements TicketDao {

	@Override
	public List<Long> findHoldingSeat(Timestamp expiredInstant) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
