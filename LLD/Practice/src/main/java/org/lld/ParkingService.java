package org.lld;


import java.util.Objects;

public class ParkingService {
    private ParkingLot parkingLot;

    public ParkingService(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public Slot parkVehicle(Vehicle vehicle){
        for (Floor floor: parkingLot.getFloors()){
            for (Slot slot: floor.getSlots()){
                if (Objects.equals(slot.getType(), vehicle.getType()) && !slot.isOccupied()){
                    slot.park(vehicle);
                    return slot;
                }
            }
        }
        return null;
    }
}
