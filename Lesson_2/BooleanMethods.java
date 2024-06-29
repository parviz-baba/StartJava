public class BooleanMethods {
    public boolean isProgramRunning() {
        boolean result = true;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> выполняется ли далее программа или завершается? " + bold(result));
        return result;
    }

    public boolean isFileDeleted() {
        boolean result = false;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> удалился ли файл на жестком диске или флешке? " + bold(result));
        return result;
    }

    public boolean isUniqueNumber() {
        boolean result = true;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> последовательность содержит уникальную цифру? " + bold(result));
        return result;
    }

    public boolean isLetterEntered() {
        boolean result = false;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> пользователь ввел букву или что-то другое? " + bold(result));
        return result;
    }

    public boolean hasEqualDigits() {
        boolean result = true;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> в проверяемых числах, есть равные цифры? " + bold(result));
        return result;
    }

    public boolean hasMarioLives() {
        boolean result = false;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> в игре 'Марио' остались попытки? " + bold(result));
        return result;
    }

    public boolean isEmptyOrWhitespace() {
        boolean result = true;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> пользователь ввёл пустую строку или строку, где одни пробелы? " + bold(result));
        return result;
    }

    public boolean isEvenNumber() {
        boolean result = false;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? " + bold(result));
        return result;
    }

    public boolean isValidPath() {
        boolean result = true;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? " + bold(result));
        return result;
    }

    public boolean isFileExists() {
        boolean result = false;
        System.out.println(MethodNameHelper.getMethodName() + 
                "() -> файл по указанному адресу существует? " + bold(result));
        return result;
    }

    private String bold(boolean value) {
        return "\033[1m" + value + "\033[0m";
    }
}