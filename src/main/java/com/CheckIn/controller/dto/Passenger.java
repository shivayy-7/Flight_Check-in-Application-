package com.CheckIn.controller.dto;

import lombok.Data;

@Data
public class Passenger {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;

}
