package com.navr.patterns.creational.builder.v2;

public class House {

    private int numOfRooms;
    private int numOfDoors;
    private int numOfWindows;
    private boolean hasSwimPool;
    private boolean hasGarage;
    private boolean hasGarden;

    public House() {

    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return String.format("HouseInfo: Rooms=%d, Doors=%d, Windows=%d, SwimPool=%s, Garage=%s, Garden=%s%n"
        , numOfRooms, numOfDoors, numOfWindows, hasSwimPool, hasGarage, hasGarden);
    }
}
