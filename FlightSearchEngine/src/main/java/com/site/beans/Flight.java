package com.site.beans;

import java.util.Date;

public class Flight {
	private String villeDep;
	private String villeArr;
	private Date dateDep;
	private Date dateArr;
	private String company;
	private String type;
	private int price;
	private Date duration;
	private int stopover;
	
	public Flight(String vDep, String vArr) {
		villeDep = vDep;
		villeArr = vArr;
	}
	public Flight() {
		
	}
	
	public String getVilleDep() {
		return villeDep;
	}
	public void setVilleDep(String villeDep) {
		this.villeDep = villeDep;
	}
	public String getVilleArr() {
		return villeArr;
	}
	public void setVilleArr(String villeArr) {
		this.villeArr = villeArr;
	}
	public Date getDateDep() {
		return dateDep;
	}
	public void setDateDep(Date dateDep) {
		this.dateDep = dateDep;
	}
	public Date getDateArr() {
		return dateArr;
	}
	public void setDateArr(Date dateArr) {
		this.dateArr = dateArr;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public int getStopover() {
		return stopover;
	}
	public void setStopover(int stopover) {
		this.stopover = stopover;
	}
	
	public boolean correspondTo(Flight volFilter) {
		if((volFilter.getVilleDep().equals("All") || villeDep.equals(volFilter.getVilleDep()))
			&& (volFilter.getVilleArr().equals("All") || villeArr.equals(volFilter.getVilleArr()))) {
				return true;
		}
		else return false;
	}

}
