package com.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.FlightDetails;
import com.service.FlightMgmtServiceImpl;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner{
    @Autowired
	private FlightMgmtServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
//	   String msg = service.registerFlightDetails(new FlightDetails("01959BY", "Enfield", "AirBus", 230));
//	   System.out.println(msg);
		
//		FlightDetails f1=new FlightDetails("VJH45S", "DEMO1", "AirBus", 941);
//		FlightDetails f2=new FlightDetails("UWYG56", "DEMO2", "AirBus", 502);
//		List<FlightDetails> list = List.of(f1,f2);
//		String msg = service.registerAllFlights(list);
//		System.out.println(msg);
		
//		Long count = service.showRecordCount();
//		System.out.println(count);
		
	//	service.showAllFlightDetails().forEach(System.out::println);
		
	//service.showAllFlightsByIds(List.of(1000,1002,1003,1005,1011)).forEach(System.out::println);	
//		Optional<FlightDetails> id = service.showFlightById(1011);
//		System.out.println(id);
//		
		FlightDetails obj = service.showById(101);
		System.out.println(obj);
		
	}

}
