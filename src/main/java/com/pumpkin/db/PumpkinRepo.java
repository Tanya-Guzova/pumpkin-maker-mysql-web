package com.pumpkin.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pumpkin.business.Pumpkin;
//Pumpkin entity, with Integer  PK
public interface PumpkinRepo extends JpaRepository<Pumpkin, Integer> {

}
