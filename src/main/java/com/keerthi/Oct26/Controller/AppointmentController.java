package com.keerthi.Oct26.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.Oct26.Appointment;
import com.keerthi.Oct26.Service.AppointmentService;


@RestController
@RequestMapping("appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	@PostMapping
	public void saveAppointment(@RequestBody Appointment appointment){
		appointmentService.saveAppointment(appointment);
	}
	
}

