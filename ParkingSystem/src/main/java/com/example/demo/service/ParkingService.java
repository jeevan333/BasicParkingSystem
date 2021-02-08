package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Parking;

public interface ParkingService {
		public List<Parking> getParkings();
			
		public Parking getParking(long parkingId);
		
		public Parking addParking(Parking parking);
		
		public Parking updateParking(Parking parking);
		
		public void deleteParking(long parkingId); //paresLong
		
}
