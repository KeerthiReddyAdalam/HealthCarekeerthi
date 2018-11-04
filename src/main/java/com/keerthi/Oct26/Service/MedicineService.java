package com.keerthi.Oct26.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Medicine;
import com.keerthi.Oct26.Dao.MedicineDAO;


@Service
public class MedicineService {

	@Autowired
	private MedicineDAO medicineDao;
	
	public void saveMedicine(Medicine medicine){
		medicineDao.save(medicine);
	}
	
	public void saveMedicineList(List<Medicine> medicineList){
		medicineDao.saveAll(medicineList);
	}
	
}
