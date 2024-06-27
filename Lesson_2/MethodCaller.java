public class MethodCaller {
    public static void main(String[] args) {
        MethodCaller methodCaller = new MethodCaller();
        methodCaller.callAllMethods();
    }

    public void callAllMethods() {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        nonBooleanMethods.findLongestWord();
        nonBooleanMethods.selectMenuItem();
        nonBooleanMethods.calculateAverageGrade();
        nonBooleanMethods.countUniqueWords();
        nonBooleanMethods.displayError();
        nonBooleanMethods.synchronizeData();
        nonBooleanMethods.restoreBackup();
        nonBooleanMethods.pauseDownload();
        nonBooleanMethods.resetToFactorySettings();
        nonBooleanMethods.writeFile();
        nonBooleanMethods.convertCelsiusToFahrenheit();
        nonBooleanMethods.enterMathExpression();
        nonBooleanMethods.determineRaceWinner();
        nonBooleanMethods.searchBook();
        nonBooleanMethods.saveToClipboard();

        BooleanMethods booleanMethods = new BooleanMethods();
        booleanMethods.isProgramRunning();
        booleanMethods.isFileDeleted();
        booleanMethods.isUniqueNumber();
        booleanMethods.isLetterEntered();
        booleanMethods.hasEqualDigits();
        booleanMethods.hasMarioLives();
        booleanMethods.isEmptyOrWhitespace();
        booleanMethods.isEvenNumber();
        booleanMethods.isValidPath();
        booleanMethods.isFileExists();
    }
}