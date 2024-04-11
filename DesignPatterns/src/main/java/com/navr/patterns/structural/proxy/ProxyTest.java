package com.navr.patterns.structural.proxy;

/**
 * <b>Proxy</b> is a structural design pattern that lets you provide a substitute or
 * placeholder for another object. A proxy controls access to the original object, allowing you
 * to perform something either before or after the request gets through to the original object.
 *
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/proxy">Proxy pattern</a>
 */
public class ProxyTest {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("hello.png");
        proxyImage.display();
        System.out.println("...");
        proxyImage.display();
    }
}
