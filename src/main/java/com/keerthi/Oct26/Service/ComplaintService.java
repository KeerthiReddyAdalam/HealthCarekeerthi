package com.keerthi.Oct26.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Complaint;
import com.keerthi.Oct26.Medication;
import com.keerthi.Oct26.Dao.ComplaintDao;

@Service
public class ComplaintService {

	@Autowired
	private ComplaintDao complaintDao;

	public void saveComplaint(Complaint complaint) {
		/*List<Medication> medicationList = complaint.getMedicationList();

		if (medicationList != null) {
			for (Medication medication : medicationList) {
				medication.setComplaint(complaint);
			}
		}
*/
		complaintDao.save(complaint);
	}

}
