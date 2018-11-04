package com.keerthi.Oct26.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthi.Oct26.Medication;

@Repository
public interface MedicationDao extends JpaRepository<Medication, Long> {

}
