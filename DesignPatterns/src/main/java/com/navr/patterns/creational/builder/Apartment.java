package com.navr.patterns.creational.builder;

public class Apartment {

    private int numOfRooms;
    private int sqm;
    private int doorNum;
    private String city;
    private String zipcode;

    public Apartment(int numOfRooms, int sqm, int doorNum,
                     String city, String zipcode) {
        this.numOfRooms = numOfRooms;
        this.sqm = sqm;
        this.doorNum = doorNum;
        this.city = city;
        this.zipcode = zipcode;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getSqm() {
        return sqm;
    }

    public void setSqm(int sqm) {
        this.sqm = sqm;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return city + " / " + zipcode + " / " + doorNum + " / " + numOfRooms + " / " + sqm;
    }
}
