package com.navr.patterns.creational.builder.v2;

public class HouseBuilder {

    private int numOfRooms;
    private int numOfDoors;
    private int numOfWindows;
    private boolean hasSwimPool;
    private boolean hasGarage;
    private boolean hasGarden;

    public House build() {
        House house = new House();
        house.setNumOfRooms(numOfRooms);
        house.setNumOfDoors(numOfDoors);
        house.setNumOfWindows(numOfWindows);
        house.setHasSwimPool(hasSwimPool);
        house.setHasGarage(hasGarage);
        house.setHasGarden(hasGarden);

        // Make sure to reset values for new house
        numOfRooms = 0;
        numOfDoors = 0;
        numOfWindows = 0;
        hasSwimPool = false;
        hasGarage = false;
        hasGarden = false;

        return house;
    }

    public HouseBuilder buildRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
        return this;
    }

    public HouseBuilder buildDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
        return this;
    }

    public HouseBuilder buildWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
        return this;
    }

    public HouseBuilder buildSwimPool() {
        this.hasSwimPool = true;
        return this;
    }

    public HouseBuilder buildGarage() {
        this.hasGarage = true;
        return this;
    }

    public HouseBuilder buildGarden() {
        this.hasGarden = true;
        return this;
    }
}
