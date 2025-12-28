package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.FlightDetails;

public interface IFlightDetailsRepository extends CrudRepository<FlightDetails,Integer>{

}
