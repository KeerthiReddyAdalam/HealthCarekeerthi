package com.keerthi.Oct26.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.Oct26.Doctor;
import com.keerthi.Oct26.Medication;
import com.keerthi.Oct26.Service.DoctorService;
import com.keerthi.Oct26.Service.MedicationService;
@RestController
@RequestMapping("medication")
public class MedicationController {
	

		@Autowired
		private MedicationService medService;
		
		@PostMapping
		public void saveDoctor(@RequestBody Medication medication){
			medService.saveDoctor(medication);
		}

}
