package com.site.volexampl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.site.beans.Flight;

public class VolsExmpl {
	private String[] villes = {"Rabat", "Paris", "Accra", "NewYork", "Rabat", "Rome", "NewYork", "Johanesboug"};
	private String[] companies = {"Air France", "Ethiopian Airlines", "ASKY", "Royal Air Maroc", "Royal Air Maroc", "Air France", "ASKY"};
	private int[] prices = {500, 700, 400, 800, 1000, 900, 800};
	private Date date = new Date();
	
	public List<Flight> listVols(){
		List<Flight> flights = new ArrayList<>();
		for(int i=0; i<7; i++) {
			Flight f = new Flight();
			f.setVilleDep(villes[i]);
			f.setVilleArr(villes[i+1]);
			f.setDateDep(date);
			f.setCompany(companies[i]);
			f.setPrice(prices[i]);
			flights.add(f);
		}
		return flights;
	}

	public String[] getVilles() {
		return villes;
	}
	
	
	
}
