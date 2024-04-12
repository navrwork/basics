package com.navr.patterns.structural.facade;

/**
 * Facade is a structural design pattern that provides a simplified interface to
 * a library, a framework, or any other complex set of classes.
 * <br/>
 * We create a facade class to hide the framework's complexity behind a simple
 * interface. It's a trade-off between functionality and simplicity.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/facade">Facade pattern</a>
 */
public class FacadeTest {

    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        videoConverter.convertVideo("funny-cat-video.ogg", "mp4");
    }
}
