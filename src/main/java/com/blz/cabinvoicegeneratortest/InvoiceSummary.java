package com.blz.cabinvoicegeneratortest;

public class InvoiceSummary {
	public int numberOfRides;
	public double totalFare;
	public final double averageFare;
	
	public InvoiceSummary(int numberOfRides, double totalFare) {
		this.numberOfRides = numberOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.numberOfRides;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return numberOfRides == other.numberOfRides && Double.compare(other.totalFare, totalFare) == 0
				&& Double.compare(other.averageFare, averageFare) == 0;
	}
	

}
