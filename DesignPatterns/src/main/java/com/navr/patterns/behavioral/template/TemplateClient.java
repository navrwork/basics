package com.navr.patterns.behavioral.template;

/**
 * Template Method is a behavioral design pattern that defines
 * the skeleton of an algorithm in the superclass but lets
 * subclasses override specific steps of the algorithm without
 * changing its structure.
 * <br/><br/>
 * Reference: <a href="https://refactoring.guru/design-patterns/template-method">Template pattern</a>
 */
public class TemplateClient {

    public static void main(String[] args) {
        BaseDataMiner dataMiner = new PdfDataMiner();
        dataMiner.mine("dummy_file_path");

    }
}
