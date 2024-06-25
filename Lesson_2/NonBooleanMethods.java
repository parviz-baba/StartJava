public class NonBooleanMethods {
    public void longestWord() {
        System.out.println(getCurrentMethodName() + 
                "() -> найти самое длинное слово в предложении из книги по Java");
    }

    public void selectMenuItem() {
        System.out.println(getCurrentMethodName() + 
                "() -> выбрать пункт меню в текстовом редакторе на macOS");
    }

    public void averageGrade() {
        System.out.println(getCurrentMethodName() + 
                "() -> вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueWords() {
        System.out.println(getCurrentMethodName() + 
                "() -> подсчитать количество уникальных слов в 'Война и Мир'");
    }

    public void showError() {
        System.out.println(getCurrentMethodName() + "() -> вывести сообщение об ошибке");
    }

    public void syncData() {
        System.out.println(getCurrentMethodName() + "() -> синхронизировать данные с облачным хранилищем");
    }

    public void restoreBackup() {
        System.out.println(getCurrentMethodName() + 
                "() -> восстановить данные из резервной копии от 11.03.2024");
    }

    public void pauseDownload() {
        System.out.println(getCurrentMethodName() + 
                "() -> приостановить загрузку mp3-файла группы 'Ария'");
    }

    public void resetToFactory() {
        System.out.println(getCurrentMethodName() + 
                "() -> сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeToFile() {
        System.out.println(getCurrentMethodName() + 
                "() -> записать содержимое в файл по указанному пути на флешку");
    }

    public void celsiusToFahrenheit() {
        System.out.println(getCurrentMethodName() + "() -> преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void enterMathExpression() {
        System.out.println(getCurrentMethodName() + 
                "() -> ввести математическое выражение с тремя аргументами");
    }

    public void findWinner() {
        System.out.println(getCurrentMethodName() + 
                "() -> выявить победителя среди гонщиков игры 'Need For Speed'");
    }

    public void findBook() {
        System.out.println(getCurrentMethodName() + "() -> найти книгу по имени писателя");
    }

    public void saveToClipboard() {
        System.out.println(getCurrentMethodName() + 
                "() -> сохранить содержимое из буфера обмена в файл Buffer.txt");
    }

    private String getCurrentMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}