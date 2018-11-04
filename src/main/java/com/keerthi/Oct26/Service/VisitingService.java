package com.keerthi.Oct26.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Oct26.Visiting;
import com.keerthi.Oct26.Dao.VisitingDAO;


@Service
public class VisitingService {

	@Autowired
	private VisitingDAO visitingDao;
	
	
	public void saveVisiting(Visiting visiting){
		visitingDao.save(visiting);
	}
	
}

