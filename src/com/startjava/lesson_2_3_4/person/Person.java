package com.startjava.lesson_2_3_4.person;

public class Person {
    String sex;
    String name;
    double height;
    double weight;
    int age;

    void go() {
        System.out.println(name + " идёт");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void speak() {
        System.out.println(name + " говорить");
    }

    void learnJava() {
        System.out.println(name + " изучает Java");
    }
}