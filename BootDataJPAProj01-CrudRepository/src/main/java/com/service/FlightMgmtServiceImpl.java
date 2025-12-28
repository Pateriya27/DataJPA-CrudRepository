package com.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.FlightDetails;
import com.repository.IFlightDetailsRepository;

@Service
public class FlightMgmtServiceImpl implements IFlightMgmtService {

	@Autowired
	private IFlightDetailsRepository repository;
	
	@Override
	public String registerFlightDetails(FlightDetails details) {
		System.err.println(repository.getClass()+"  ====  "+Arrays.toString(repository.getClass().getInterfaces()));
		System.err.println(Arrays.toString(repository.getClass().getDeclaredMethods()));
		FlightDetails save = repository.save(details);
		Integer fno = save.getFno();
		
		return "Flight Details Are Saved With Id :: "+fno;
	}

	@Override
	public String registerAllFlights(List<FlightDetails> list) {
		Iterable<FlightDetails> iterable = repository.saveAll(list);
		List<Integer> ids = StreamSupport.stream(iterable.spliterator(), false).map(f->f.getFno()).collect(Collectors.toList());
	
		return ids.size()+" No. of Flight Details are added with ids : "+ids;
	}

	@Override
	public Long showRecordCount() {
		return repository.count();
	}

	@Override
	public Iterable<FlightDetails> showAllFlightDetails() {
		return repository.findAll();
	}

	@Override
	public Iterable<FlightDetails> showAllFlightsByIds(List<Integer> id) {
		return repository.findAllById(id);
	}

	@Override
	public Optional<FlightDetails> showFlightById(Integer id) {
		Optional<FlightDetails> opt = repository.findById(id);
		if(opt.isPresent())
			return opt;
		else 
		return Optional.empty();
	}

	@Override
	public FlightDetails showById(Integer id) {
		Optional<FlightDetails> opt = repository.findById(id);
		return opt.orElseThrow(()->new IllegalArgumentException("Invalid id"));
	}

}
