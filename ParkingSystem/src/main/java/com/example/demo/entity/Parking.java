package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Parking {
	@Id
	private long id;
	private String VehicleName;
	private String vehicleDescription;
	private String VehicleColour;
	private String VehicleType;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date inTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date outTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public String getVehicleDescription() {
		return vehicleDescription;
	}
	public void setVehicleDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}
	public String getVehicleColour() {
		return VehicleColour;
	}
	public void setVehicleColour(String vehicleColour) {
		VehicleColour = vehicleColour;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parking(long id, String vehicleName, String vehicleDescription, String vehicleColour, String vehicleType,
			Date inTime, Date outTime) {
		super();
		this.id = id;
		VehicleName = vehicleName;
		this.vehicleDescription = vehicleDescription;
		VehicleColour = vehicleColour;
		VehicleType = vehicleType;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	@Override
	public String toString() {
		return "Parking [id=" + id + ", VehicleName=" + VehicleName + ", vehicleDescription=" + vehicleDescription
				+ ", VehicleColour=" + VehicleColour + ", VehicleType=" + VehicleType + ", inTime=" + inTime
				+ ", outTime=" + outTime + "]";
	}
}

