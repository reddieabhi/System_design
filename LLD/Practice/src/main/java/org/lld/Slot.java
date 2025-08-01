package org.lld;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Slot {
    private int slotNumber;
    private String type;
    private String color;
    private boolean occupied;
    private Vehicle vehicle;
    private int floorNumber;

    public Slot(String type, int slotNumber, int floorNumber) {
        this.slotNumber = slotNumber;
        this.type = type;
        this.occupied = false;
        this.floorNumber = floorNumber;
    }

    public void park(Vehicle vehicle){
        this.occupied = true;
        this.vehicle = vehicle;
    }

    public void unPark(Vehicle vehicle){
        this.occupied = false;
        this.vehicle = null;
    }
}
