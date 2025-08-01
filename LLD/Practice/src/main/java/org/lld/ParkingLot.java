package org.lld;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ParkingLot {

    private String id;
    private int numberOfFloors;
    private int numberOfSlotsPerFloor;


    private List<Floor> floors;
    public  ParkingLot(String id, int numberOfFloors, int numberOfSlotsPerFloor){
        this.id = id;
        this.numberOfFloors = numberOfFloors;
        this.numberOfSlotsPerFloor = numberOfSlotsPerFloor;
        this.floors = new ArrayList<>();

        for (int i=0; i < numberOfFloors; i++)
            floors.add(new Floor(numberOfSlotsPerFloor, i));

    }

}
