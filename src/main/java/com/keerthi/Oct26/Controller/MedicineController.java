package com.keerthi.Oct26.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.Oct26.Medicine;
import com.keerthi.Oct26.Service.MedicineService;



@RestController
@RequestMapping("medicine")
public class MedicineController {
	@Autowired
	private MedicineService medicineService;

	@PostMapping
	public void saveMedicine(@RequestBody Medicine medicine){
		medicineService.saveMedicine(medicine);
	}
	
	@PostMapping("/all")
	public void saveMedicineList(@RequestBody List<Medicine> medicineList){
		medicineService.saveMedicineList(medicineList);
	}
	
}

