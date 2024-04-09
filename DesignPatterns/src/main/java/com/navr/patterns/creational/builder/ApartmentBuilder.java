package com.navr.patterns.creational.builder;

public class ApartmentBuilder {

    private int numOfRooms = 0;
    private int sqm = 0;
    private int doorNum = -1;
    private String city = null;
    private String zipcode = null;

    public ApartmentBuilder numOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
        return this;
    }

    public ApartmentBuilder sqm(int sqm) {
        this.sqm = sqm;
        return this;
    }

    public ApartmentBuilder doorNum(int doorNum) {
        this.doorNum = doorNum;
        return this;
    }

    public ApartmentBuilder city(String city) {
        this.city = city;
        return this;
    }

    public ApartmentBuilder zipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public Apartment build() {
        Apartment ap = new Apartment(numOfRooms, sqm, doorNum, city, zipcode);
        // reset values back to default, so that next object is built from scratch
        numOfRooms = 0;
        sqm = 0;
        doorNum = -1;
        city = null;
        zipcode = null;

        return ap;
    }


}
