package com.keerthi.Oct26.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Appointment;
import com.keerthi.Oct26.Dao.AppointmentDAO;


@Service
public class AppointmentService {

	@Autowired
	private AppointmentDAO appointmentDao;
	
	public void saveAppointment(Appointment appointment){
		appointmentDao.save(appointment);
	}
	
}

