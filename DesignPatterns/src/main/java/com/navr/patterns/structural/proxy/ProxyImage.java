package com.navr.patterns.structural.proxy;

/**
 * Substitute/Placeholder class with additional functionality like caching/access control etc.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        System.out.printf("ProxyImage: Initializing file %s%n", fileName);
    }

    @Override
    public void display() {
        System.out.printf("ProxyImage: Displaying file %s%n", this.fileName);
        if (realImage==null) {
            realImage = new RealImage(this.fileName);
        }
        realImage.display();
        System.out.printf("ProxyImage: Display of file %s complete.%n", this.fileName);
    }
}
