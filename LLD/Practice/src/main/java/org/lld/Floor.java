package org.lld;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Floor {
    private int floorNumber;
    private int numberOfSlotsPerFloor;
    private List<Slot> slots;

    public Floor(int numberOfSlotsPerFloor, int floorNumber) {
        this.floorNumber = floorNumber;
        this.numberOfSlotsPerFloor = numberOfSlotsPerFloor;
        this.slots = new ArrayList<>();

        for (int i =0; i < numberOfSlotsPerFloor; i++){
            String type = "Car";
            if (i<1){
                type = "Truck";
            } else if (i < 3) {
                type = "Bike";
            }
            slots.add(new Slot(type, i, floorNumber));
        }
    }
}
