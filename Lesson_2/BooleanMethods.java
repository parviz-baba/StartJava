public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.println(MethodNameUtil.get() + 
                "() -> выполняется ли далее программа или завершается? " + true);
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(MethodNameUtil.get() + 
                "() -> удалился ли файл на жестком диске или флешке? " + false);
        return false;
    }

    public boolean isUniqueNumber() {
        System.out.println(MethodNameUtil.get() + 
                "() -> последовательность содержит уникальную цифру? " + true);
        return true;
    }

    public boolean isLetter() {
        System.out.println(MethodNameUtil.get() + 
                "() -> пользователь ввел букву или что-то другое? " + false);
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.println(MethodNameUtil.get() + 
                "() -> в проверяемых числах, есть равные цифры? " + true);
        return true;
    }

    public boolean hasLives() {
        System.out.println(MethodNameUtil.get() + 
                "() -> в игре 'Марио' остались попытки? " + false);
        return false;
    }

    public boolean isBlank() {
        System.out.println(MethodNameUtil.get() + 
                "() -> пользователь ввёл пустую строку или строку, где одни пробелы? " + true);
        return true;
    }

    public boolean isEven() {
        System.out.println(MethodNameUtil.get() + 
                "() -> на кубике, который бросил компьютер, выпало четное число? " + false);
        return false;
    }

    public boolean isValidFilePath() {
        System.out.println(MethodNameUtil.get() + 
                "() -> путь до файла, который вы ищите на ssd, действительный? " + true);
        return true;
    }

    public boolean isFileExisting() {
        System.out.println(MethodNameUtil.get() + 
                "() -> файл по указанному адресу существует? " + false);
        return false;
    }
}