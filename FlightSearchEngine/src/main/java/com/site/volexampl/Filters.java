package com.site.volexampl;

import java.util.ArrayList;
import java.util.List;

import com.site.beans.Flight;

import jakarta.servlet.http.HttpServletRequest;

public class Filters {
	
	
	public List<Flight> listVols(HttpServletRequest request) {
		String vDep = request.getParameter("vDep");
		String vArr = request.getParameter("vArr");
		Flight volFilter = new Flight(vDep, vArr);
		List<Flight> listAllVols = new VolsExmpl().listVols();
	
		List<Flight> flights = new ArrayList<>();
		for(Flight flight: listAllVols) {
			if(flight.correspondTo(volFilter)) {
				flights.add(flight);
			}
		}
		return flights;
	}
}
