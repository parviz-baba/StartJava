public class WolfTest {
    public static void main(String[]args) {
        Wolf ruby = new Wolf();
        ruby.setSex("female");
        System.out.println("\nПол волка: " + ruby.getSex());
        ruby.setNickname("Ruby");
        System.out.println("\nКличка волка: " + ruby.getNickname());
        ruby.setColor("White");
        System.out.println("\nОкрас волка: " + ruby.getColor());
        ruby.setWeight(19.7);
        System.out.println("\nВес волка: " + ruby.getWeight());
        ruby.setAge(5);
        System.out.println("\nВозраст волка: " + ruby.getAge());
        ruby.go();
        ruby.sit();
        ruby.run();
        ruby.howl();
        ruby.hunt();
    }
}