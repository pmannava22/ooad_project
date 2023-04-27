package com.cab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cab.model.Cab;

@Repository
public interface CabRepo extends JpaRepository<Cab, Integer> {

//	public List<Cab> findByAvailbilityStatus(Boolean avalibilityStatus);

}
