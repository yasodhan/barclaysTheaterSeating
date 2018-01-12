package com.barc.test.theater;

import java.util.ArrayList;
import java.util.List;

import com.barc.test.theater.data.Request;
import com.barc.test.theater.data.Row;
import com.barc.test.theater.data.Section;
import com.barc.test.theater.data.Theater;

public class RulesEngine {

	public List<String> processRequestsForTheater(Theater theater, List<Request> requests) {
		List<String> results = new ArrayList<String>();
		Integer seatsFilled = 0;
		for(Request request : requests) {
			theater.calculateMetaData();
			Integer remainingSeats = theater.getSeatingCapacity();
			Integer maxAvailableSectionSize = theater.getMaxSectionsize();
			if (remainingSeats == 0) {
				results.add(request.getName() + " Theater full");
				continue;
			}
			if (request.getNumberOfTickets() > remainingSeats) {
				results.add(request.getName() + " Sorry, we can't handle your party.");
				continue;
			} 
			if (request.getNumberOfTickets() > maxAvailableSectionSize) {
				results.add(request.getName() + " Call to split party");
				continue;
			} 
			Boolean requestProcessed = false;
			for (Row row : theater.getRows()) {
				if (requestProcessed) {
					break;
				}
				for (Section section : row.getSections()) {
					if (section.getRemainingSeats() >= request.getNumberOfTickets()) {
						results.add(request.getName() + " " + row.getRowNo() + " " + section.getSectionNumber());
						section.setFilledSeats(section.getFilledSeats() + request.getNumberOfTickets());
						requestProcessed = true;
						seatsFilled += request.getNumberOfTickets();
						break;
					}
				}
			}
		}
		return results;
	}
	
}
