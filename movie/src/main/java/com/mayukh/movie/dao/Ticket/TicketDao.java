package com.mayukh.movie.dao.Ticket;

import java.sql.Timestamp;
import java.util.List;

public interface TicketDao {
	List<Long> findHoldingSeat(Timestamp expiredInstant);

}
