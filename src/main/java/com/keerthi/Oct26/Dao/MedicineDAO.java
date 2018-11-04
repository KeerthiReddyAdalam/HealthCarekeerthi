package com.keerthi.Oct26.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthi.Oct26.Medicine;

@Repository
public interface MedicineDAO extends JpaRepository<Medicine, Long>{

	
}
