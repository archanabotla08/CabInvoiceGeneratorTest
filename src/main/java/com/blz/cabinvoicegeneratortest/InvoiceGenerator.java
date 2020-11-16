package com.blz.cabinvoicegeneratortest;

public class InvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private static final double MININUM_COST_PER_KILOMETER = 10;
	private static final double MININUM_FARE = 5;

	public double calculateFare(double distance ,int time) {
		
		double cost = distance * MININUM_COST_PER_KILOMETER + time * COST_PER_TIME ;
		if(cost < MININUM_FARE) {
			return MININUM_FARE;
		}
		return cost;
	}
	public InvoiceSummary calculateFare(Ride[] rides) {
		 double	totalFare  = 0;
		for(Ride ride: rides) {
		 	totalFare += this.calculateFare(ride.distance,ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}
	
}
