package com.navr.patterns.behavioral.template;

import java.io.File;

public class CsvDataMiner extends BaseDataMiner {
    @Override
    public File openFile(String filePath) {
        return new File(filePath);
    }

    @Override
    public Object extractData(File file) {
        return new Object();
    }

    @Override
    public MineData parseData(Object rawData) {
        return new MineData();
    }

    @Override
    public void closeFile(File file) {

    }
}
