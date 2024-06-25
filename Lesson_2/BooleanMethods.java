public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.println(getCurrentMethodName() + "() -> выполняется ли далее программа или завершается?");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(getCurrentMethodName() + "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean isUniqueNumber() {
        System.out.println(getCurrentMethodName() + "() -> последовательность содержит уникальную цифру?");
        return true;
    }

    public boolean isLetterEntered() {
        System.out.println(getCurrentMethodName() + "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println(getCurrentMethodName() + "() -> в проверяемых числах, есть равные цифры?");
        return true;
    }

    public boolean hasMarioLives() {
        System.out.println(getCurrentMethodName() + "() -> в игре 'Марио' остались попытки?");
        return false;
    }

    public boolean isEmptyOrWhitespace() {
        System.out.println(getCurrentMethodName() + 
                "() -> пользователь ввёл пустую строку или строку, где одни пробелы?");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.println(getCurrentMethodName() + 
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isValidPath() {
        System.out.println(getCurrentMethodName() + 
                    "() -> путь до файла, который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExists() {
        System.out.println(getCurrentMethodName() + "() -> файл по указанному адресу существует?");
        return false;
    }

    private String getCurrentMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}