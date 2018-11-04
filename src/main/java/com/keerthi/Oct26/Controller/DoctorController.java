package com.keerthi.Oct26.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.Oct26.Doctor;
import com.keerthi.Oct26.Service.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping
	public void saveDoctor(@RequestBody Doctor doctor){
		doctorService.saveDoctor(doctor);
	}
	
	@PostMapping("/all")
	public void saveAllDoctors(List<Doctor> doctors){
		doctorService.saveAllDoctors(doctors);
	}
}

