package com.keerthi.Oct26.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthi.Oct26.Complaint;


@Repository
public interface ComplaintDao extends JpaRepository<Complaint, Long> {

	
	 
}

