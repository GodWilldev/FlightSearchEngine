package com.site.dao;

import java.util.List;
import java.util.Set;

import com.site.beans.Flight;

public interface FlightDao {
	List<Flight> lister() throws DaoException;
	Set<String> getVilles(List<Flight> flights);
}
