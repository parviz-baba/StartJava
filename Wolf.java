public class Wolf {
    String sex = "male";
    String nickname = "Alfa";
    String color = "Black";
    double weight = 17.5;
    int age = 10;

    void go() {
        System.out.println("\n" + nickname + " идёт");
    }

    void sit() {
        System.out.println("\n" + nickname + " сидит");
    }

    void run() {
        System.out.println("\n" + nickname + " бежит");
    }

    void howl() {
        System.out.println("\n" + nickname + " воет");
    }

    void hunt() {
        System.out.println("\n" + nickname + " охотиться");
    }
}