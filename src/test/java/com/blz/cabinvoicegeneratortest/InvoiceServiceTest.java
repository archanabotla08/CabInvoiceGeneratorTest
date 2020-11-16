package com.blz.cabinvoicegeneratortest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class InvoiceServiceTest {

	private static InvoiceGenerator invoiceGenerator;
	
	@BeforeClass
	public static void createInvoiceGeneratorObject() {
		invoiceGenerator = new InvoiceGenerator();
	}
	@Test
	public void givenDistanceTime_SHouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(25, fare,0.0);
	}
	@Test
	public void givenDistanceTime_SHouldReturnMininumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5.0, fare,0.0);
	}
	
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		Ride[] rides = {
				new Ride(2.0,5),
				new Ride(0.1,1)
		};
		
		double fare = invoiceGenerator.calculateFare(rides);
		assertEquals(30.0, fare,0.0);
	}
	

}
