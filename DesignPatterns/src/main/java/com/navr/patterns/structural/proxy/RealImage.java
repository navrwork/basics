package com.navr.patterns.structural.proxy;

/**
 * Actual/real object.
 */
public class RealImage implements Image {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.printf("RealImage: Initializing file %s%n", fileName);
    }

    @Override
    public void display() {
        System.out.printf("RealImage: Displaying file %s%n", fileName);
    }
}
