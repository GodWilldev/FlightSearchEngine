package com.site.flight_filters;

import java.util.ArrayList;
import java.util.List;

import com.site.beans.Flight;

import jakarta.servlet.http.HttpServletRequest;

public class FlightFilter {
	public List<Flight> listVolsFilter(HttpServletRequest request, List<Flight> listAllVols) {
		String vDep = request.getParameter("vDep");
		String vArr = request.getParameter("vArr");
		Flight volFilter = new Flight(vDep, vArr);
	
		List<Flight> flights = new ArrayList<>();
		for(Flight flight: listAllVols) {
			if(flight.correspondTo(volFilter)) {
				flights.add(flight);
			}
		}
		return flights;
	}
}
