package com.keerthi.Oct26.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthi.Oct26.Disease;


@Repository
public interface DiseaseDao extends JpaRepository<Disease, Long>{

}

