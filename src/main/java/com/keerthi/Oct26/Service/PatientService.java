package com.keerthi.Oct26.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Patient;
import com.keerthi.Oct26.Dao.PatientDAO;


@Service
public class PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	public void savePatient(Patient patient){
		patientDAO.save(patient);
	}
	
	public void savePatients(List<Patient> patients){
		patientDAO.saveAll(patients);
	}
	
	public List<Object[]>  getPatientByMedicine(String medicineName ){
		return patientDAO.getPatientByMedicine(medicineName);
	}
	
	
}