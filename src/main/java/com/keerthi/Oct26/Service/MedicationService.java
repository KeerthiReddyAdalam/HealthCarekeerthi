package com.keerthi.Oct26.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Doctor;
import com.keerthi.Oct26.Medication;
import com.keerthi.Oct26.Dao.DoctorDAO;
import com.keerthi.Oct26.Dao.MedicationDao;

@Service
public class MedicationService {
	
	@Autowired
	private MedicationDao medDao;
	
	public void saveDoctor(Medication medication){
		medDao.save(medication);
	}

}
