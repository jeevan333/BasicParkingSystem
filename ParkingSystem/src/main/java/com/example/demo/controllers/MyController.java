package com.example.demo.controllers;

import java.util.Date;
import java.util.List;
import com.example.demo.entity.Parking;
import com.example.demo.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private ParkingService parkingService;

	
	// get courses
	@GetMapping("/parkings")
	public List<Parking> getParkings(){
		return this.parkingService.getParkings();
	}
	
	//get single course
	@GetMapping("/parkings/{parkingId}")
	public ResponseEntity<HttpStatus> getParking(@PathVariable String parkingId){
		try {
		 this.parkingService.getParking(Long.parseLong(parkingId));
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(Exception e1)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	
	//add course
	@PostMapping("/parkings")
	public Parking addParking(@RequestBody Parking parking, 
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date inTime,
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date outTime)
	      {
	    
		return this.parkingService.addParking(parking);
	}
	
	//update course put request
	@PutMapping("/parkings")
	public Parking updateParking(@RequestBody Parking parking,
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date inTime,
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date outTime){
		return this.parkingService.updateParking(parking);
	}
	
	//Delete the course
	@DeleteMapping("/parkings/{parkingId}")
	public ResponseEntity<HttpStatus> deleteParking(@PathVariable String parkingId){
		try{
		this.parkingService.deleteParking(Long.parseLong(parkingId));
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e1)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
