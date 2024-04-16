package com.navr.patterns.behavioral.template;

import java.io.File;

/**
 * Template method super class.
 *
 */
public abstract class BaseDataMiner {

    public void mine(String filePath) {
        System.out.println("Inside BaseDataMiner.mine() method.");
        File file = openFile(filePath);
        Object rawData = extractData(file);
        MineData mineData = parseData(rawData);
        AnalysisData analysisData = analyzeData(mineData); // default impl done in BaseDataMiner
        sendReport(analysisData); // default impl done in BaseDataMiner
        closeFile(file);
    }

    public abstract File openFile(String filePath);

    public abstract Object extractData(File file);

    public abstract MineData parseData(Object rawData);

    private AnalysisData analyzeData(MineData mineData) {
        return new AnalysisData();
    }

    private void sendReport(AnalysisData analysisData) {
    }

    public abstract void closeFile(File file);
}
