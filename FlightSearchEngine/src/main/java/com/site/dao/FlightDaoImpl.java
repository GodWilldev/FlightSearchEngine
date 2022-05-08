package com.site.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Date;
//import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.site.beans.BeanException;
import com.site.beans.Flight;


public class FlightDaoImpl implements FlightDao{
	private DaoFactory daoFactory; //UNIQUE ATTRIBUTE OF THIS CLASS
	
	FlightDaoImpl(DaoFactory daoFactory) {//CONSTRUCTOR
        this.daoFactory = daoFactory;
    }
	
	 @Override
	public List<Flight> lister() throws DaoException{
		//METHOD THAT RETURN A LIST OF Flight OBJECTS
	    List<Flight> flights = new ArrayList<Flight>();
	    Connection connexion = null;
	    Statement statement = null;
	    ResultSet resultat = null;

	        try { //CONNECTION TO THE TABLE AND GETTING LINES
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT * FROM some_flights;");

	            while (resultat.next()) {//LOOP THROUGH ALL THE LINES AND TRANSFORM THEM INTO A LIST OF Flight OBJECTS
	            	//GETTING THE COLUMNS
	            	//int nom = resultat.getInt("id");
	            	String villeDep = resultat.getString("villeDep");
	            	String villeArr = resultat.getString("villeArr");
	            	Date dateDep = resultat.getTimestamp("dateDep");
	            	Date dateArr = resultat.getTimestamp("dateArr");
	            	String company = resultat.getString("company");
	            	String type = resultat.getString("type");
	            	int price = resultat.getInt("price");
	            	int stopover = resultat.getInt("stopover");
	            	//Date duration = ;
	            	//System.out.println(dateDep);
	            	//SETTING THE VALUES OF COLUMNS TO THE Flight OBJECT 
	                Flight flight = new Flight();
	                flight.setVilleDep(villeDep);
	                flight.setVilleArr(villeArr);
	                flight.setDateDep(dateDep);
	                flight.setDateArr(dateArr);
	                flight.setCompany(company);
	                flight.setType(type);
	                flight.setPrice(price);
	                flight.setStopover(stopover);
	                
	                //ADD THE flight TO THE LIST OF flights  
	                flights.add(flight);
	            }
	        } catch (SQLException e) {
	        	throw new DaoException("Impossible de communiquer avec la base de données");
	    	}
	        finally {
	            try {
	                if (connexion != null) {
	                    connexion.close();  
	                }
	            } catch (SQLException e) {
	                throw new DaoException("Impossible de communiquer avec la base de données");
	            }
	        }
	        return flights;
	    }
	 
	 public Set<String> getVilles(List<Flight> flights){
		 Set<String> villes = new HashSet<String>();
		 for(Flight flight: flights) {
			 villes.add(flight.getVilleDep());
			 villes.add(flight.getVilleArr());
		 }
		 return villes;
	 }
}
