package com.keerthi.Oct26.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Doctor;
import com.keerthi.Oct26.Dao.DoctorDAO;


@Service
public class DoctorService {

	@Autowired
	private DoctorDAO doctorDao;
	
	public void saveDoctor(Doctor doctor){
		doctorDao.save(doctor);
	}
	
	public void saveAllDoctors(List<Doctor> doctors){
		doctorDao.saveAll(doctors);
	}
	
	
	
	
	
}

