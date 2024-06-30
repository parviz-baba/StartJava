public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> выполняется ли далее программа или завершается? " + true);
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? " + false);
        return false;
    }

    public boolean isUniqueNumber() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> последовательность содержит уникальную цифру? " + true);
        return true;
    }

    public boolean isLetterEntered() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> пользователь ввел букву или что-то другое? " + false);
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? " + true);
        return true;
    }

    public boolean hasMarioLives() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> в игре 'Марио' остались попытки? " + false);
        return false;
    }

    public boolean isEmptyOrWhitespace() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> пользователь ввёл пустую строку или строку, где одни пробелы? " + true);
        return true;
    }

    public boolean isEven() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? " + false);
        return false;
    }

    public boolean isValidFilePath() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? " + true);
        return true;
    }

    public boolean doesFileExist() {
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> файл по указанному адресу существует? " + false);
        return false;
    }
}