package com.startjava.lesson_2_3.method.naming;

public class MethodDoTest {
    public static void main(String[] args) {
        MethodDoTest methodDoTest = new MethodDoTest();
        MethodDoTest.callNonBooleanMethods();
        MethodDoTest.callBooleanMethods();
    }

    public void callNonBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAvgGrade();
        nonBm.countWords();
        nonBm.displayError();
        nonBm.sync();
        nonBm.restoreBackup();
        nonBm.pauseDownload();
        nonBm.resetToFactorySettings();
        nonBm.writeFile();
        nonBm.convertTemperature();
        nonBm.enterMathExpression();
        nonBm.determineRaceWinner();
        nonBm.searchBook();
        nonBm.saveClipboardToFile();
    }

    public void callBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        bm.isProgramRunning();
        bm.isFileDeleted();
        bm.isUniqueNumber();
        bm.isLetter();
        bm.hasEqualDigits();
        bm.hasLives();
        bm.isBlank();
        bm.isEven();
        bm.isValidFilePath();
        bm.isFileExisting();
    }
}