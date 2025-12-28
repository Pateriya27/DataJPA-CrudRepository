package com.service;

import java.util.List;
import java.util.Optional;

import com.entity.FlightDetails;

public interface IFlightMgmtService {
	
	String registerFlightDetails(FlightDetails details);
	
	String registerAllFlights(List<FlightDetails> list);
	
	Long showRecordCount();
	
	Iterable<FlightDetails> showAllFlightDetails();
	
	Iterable<FlightDetails> showAllFlightsByIds(List<Integer> id);
	
	Optional<FlightDetails> showFlightById(Integer id);
	
	FlightDetails showById(Integer id);

}
