package com.CheckIn.controller.dto;

import lombok.Data;

@Data
public class ReservationUpdateRequest {
	
  private long id;
  private long numberOfBags;
  private boolean checkedIn;

}
