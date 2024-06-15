public class Wolf {
    private String sex = "male";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String nickname = "Alfa";

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String color = "Black";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double weight = 17.5;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
    this.weight = weight;
    }

    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }
    
    public void go() {
        System.out.println("\n" + nickname + " идёт");
    }

    public void sit() {
        System.out.println("\n" + nickname + " сидит");
    }

    public void run() {
        System.out.println("\n" + nickname + " бежит");
    }

    public void howl() {
        System.out.println("\n" + nickname + " воет");
    }

    public void hunt() {
        System.out.println("\n" + nickname + " охотиться");
    }
}