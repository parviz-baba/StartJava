package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Bracer Phoenix");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(70.7f);
        jaeger1.setWeight(2.1f);
        jaeger1.setStrength(8);
        jaeger1.setArmor(9);
        System.out.println("Jaeger 1:");
        System.out.println("Model Name: " + jaeger1.getModelName());
        System.out.println("Mark: " + jaeger1.getMark());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight());
        System.out.println("Weight: " + jaeger1.getWeight());
        System.out.println("Strength: " + jaeger1.getStrength());
        System.out.println("Armor: " + jaeger1.getArmor());
        jaeger1.move();
        System.out.println(jaeger1.scanKaiju());
        jaeger1.useVortexCannon();

        Jaeger jaeger2 = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 81.77f, 2.004f, 8, 6);
        System.out.println("\nJaeger 2:");
        System.out.println("Model Name: " + jaeger2.getModelName());
        System.out.println("Mark: " + jaeger2.getMark());
        System.out.println("Origin: " + jaeger2.getOrigin());
        System.out.println("Height: " + jaeger2.getHeight());
        System.out.println("Weight: " + jaeger2.getWeight());
        System.out.println("Strength: " + jaeger2.getStrength());
        System.out.println("Armor: " + jaeger2.getArmor());
        jaeger2.move();
        System.out.println(jaeger2.scanKaiju());
        jaeger2.useVortexCannon();
    }
}