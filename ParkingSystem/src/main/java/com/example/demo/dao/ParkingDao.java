package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Parking;

public interface ParkingDao extends JpaRepository<Parking, Long> {

}
