package com.blz.cabinvoicegeneratortest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRespository {
	
	 Map<String,ArrayList<Ride>> userRides = null;

	public RideRespository() {
	
		this.userRides = new HashMap<>(); 
	}
	
	public void addRides(String userId, Ride[] rides) {
		ArrayList<Ride> rideList = this.userRides.get(userId);
		if(rideList == null) {
			this.userRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
			
		}
	}
	public Ride[] getRides(String userId) {
		return this.userRides.get(userId).toArray(new Ride[0]);
	}
	
}
