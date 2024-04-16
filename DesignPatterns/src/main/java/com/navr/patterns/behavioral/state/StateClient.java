package com.navr.patterns.behavioral.state;

/**
 * State is a behavioral design pattern that lets an object alter its
 * behavior when its internal state changes. It appears as if the
 * object changed its class.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/state">State pattern</a>
 */
public class StateClient {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.publish();
        doc.publish();
        doc.publish();

        Document doc2 = new Document();
        Document doc3 = new Document();
        Document doc4 = new Document();
    }
}
