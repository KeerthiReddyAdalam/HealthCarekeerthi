package com.keerthi.Oct26.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Disease;
import com.keerthi.Oct26.Dao.DiseaseDao;

@Service
public class DiseaseService {

	@Autowired
	private DiseaseDao diseasedao;
	
	public void saveDisease(Disease disease){
		diseasedao.save(disease);
	}
	public void saveAllDiseases(List<Disease> diseases){
		diseasedao.saveAll(diseases);
	}
	
	
}

