package com.site.dao;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import com.site.beans.Flight;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightDao flightDao;
		List<Flight> flights;
		DaoFactory daoFactory = DaoFactory.getInstance();
		flightDao = daoFactory.getFlightDao();
		try {
			flights = flightDao.lister();
			for(Flight f: flights) {
				System.out.println( new SimpleDateFormat("HH:mm").format(f.getDateDep()));
			}
		} catch (DaoException e) {
			e.printStackTrace();
		}
		System.out.println(flightDao);
	}
}
