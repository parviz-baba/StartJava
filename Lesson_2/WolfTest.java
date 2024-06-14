public class WolfTest {
    public static void main(String[]args) {
        Wolf ruby = new Wolf();
        ruby.sex = "female";
        System.out.println("\nПол волка: " + ruby.sex);
        ruby.nickname = "Ruby";
        System.out.println("\nКличка волка: " + ruby.nickname);
        ruby.color = "White";
        System.out.println("\nОкрас волка: " + ruby.color);
        ruby.weight = 19.7;
        System.out.println("\nВес волка: " + ruby.weight);
        ruby.age = 5;
        System.out.println("\nВозраст волка: " + ruby.age);
        ruby.go();
        ruby.sit();
        ruby.run();
        ruby.howl();
        ruby.hunt();
    }
}