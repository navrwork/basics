package com.navr.patterns.behavioral.chainofresp;

/**
 * Chain of Responsibility is a behavioral design pattern that lets
 * you pass requests along a chain of handlers. Upon receiving a
 * request, each handler decides either to process the request or
 * to pass it to the next handler in the chain.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">Chain of Responsibility pattern</a>
 */
public class ChainOfRespTest {

    public static void main(String[] args) {
        Handler h1 = new HandlerA();
        Handler h2 = new HandlerB();
        Handler h3 = new HandlerC();
        h1.setNext(h2);
        h2.setNext(h3);
        // ...
        h1.handle(new Object());
    }
}
