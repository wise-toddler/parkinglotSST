package org.example.models;

import java.util.Date;

import org.example.models.Gate.Gate;
import org.example.models.Parking.ParkingSpot;
import org.example.models.Vehicle.Vehicle;

public class Ticket extends BaseModel {
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Gate generatedAt;
    private Operator generatedBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getAssignedSpot() {
        return assignedSpot;
    }

    public void setAssignedSpot(ParkingSpot assignedSpot) {
        this.assignedSpot = assignedSpot;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }
}