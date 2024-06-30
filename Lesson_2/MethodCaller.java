public class MethodCaller {
    public static void main(String[] args) {
        MethodCaller methodCaller = new MethodCaller();
        methodCaller.callNonBooleanMethods();
        methodCaller.callBooleanMethods();
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
        bm.isLetterEntered();
        bm.hasEqualDigits();
        bm.hasMarioLives();
        bm.isEmptyOrWhitespace();
        bm.isEven();
        bm.isValidFilePath();
        bm.doesFileExist();
    }
}