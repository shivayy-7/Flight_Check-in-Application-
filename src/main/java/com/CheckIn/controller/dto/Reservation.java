package com.CheckIn.controller.dto;

import lombok.Data;

@Data
public class Reservation {

	private Long id;
	private boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
}
