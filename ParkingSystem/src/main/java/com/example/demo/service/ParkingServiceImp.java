package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ParkingDao;
import com.example.demo.entity.Parking;
@Service
public class ParkingServiceImp implements ParkingService {
	@Autowired
	private ParkingDao parkingDao;

	@Override
	public List<Parking> getParkings() {
		// TODO Auto-generated method stub
		return parkingDao.findAll();
	}

	@Override
	public Parking getParking(long parkingId) {
		// TODO Auto-generated method stub
		return parkingDao.getOne(parkingId);
	}

	@Override
	public Parking addParking(Parking parking) {
		// TODO Auto-generated method stub
		 parkingDao.save(parking);
		 return parking;
	}

	@Override
	public Parking updateParking(Parking parking) {
		// TODO Auto-generated method stub
		parkingDao.save(parking);
		return parking;
	}

	@Override
	public void deleteParking(long parkingId) {
		// TODO Auto-generated method stub
	Parking en	=parkingDao.getOne(parkingId);
		parkingDao.delete(en);
	}
}