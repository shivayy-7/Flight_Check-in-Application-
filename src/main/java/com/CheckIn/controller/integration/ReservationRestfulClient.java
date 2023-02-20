package com.CheckIn.controller.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.CheckIn.controller.dto.Reservation;
import com.CheckIn.controller.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
