package com.techoutsvishnu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class ReservationControllerCB {
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		// create a reservation object
		ReservationCB res = new ReservationCB();
		// provide reservation object to the model
		model.addAttribute("reservation", res);
		return "reservation-pagecb";
	}

	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") ReservationCB res) {
		return "confirmation-formcb";
	}
}