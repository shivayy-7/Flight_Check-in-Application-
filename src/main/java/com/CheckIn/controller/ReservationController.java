package com.CheckIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CheckIn.controller.dto.Reservation;
import com.CheckIn.controller.dto.ReservationUpdateRequest;
import com.CheckIn.controller.integration.ReservationRestfulClient;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClient restClient;

	@RequestMapping("/showCheckIn")
	public String showCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("/proceedCheckIn")
	public String proceedCheckIn(@RequestParam("id") Long id, Model model) {
		Reservation reservation = restClient.findReservation(id);
		model.addAttribute("reservation", reservation);
		return "displayReservation";
	}
	
	@RequestMapping("/proceedToCheckIn")
	public String proceedToCheckIn(@RequestParam("id") Long id, @RequestParam("numberOfBags") int numberOfBags) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedIn(true);
		
		restClient.updateReservation(request);
		return "confirmReservation";
	}
}
