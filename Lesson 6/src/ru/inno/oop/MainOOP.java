package ru.inno.oop;

public class MainOOP {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        h1.setHeight(180);
        h1.work();
        h2.setHeight(175);
        System.out.println(h1.isWorker);
        h1.grow(0.1);
        h2.grow(0.2);
        System.out.println(h1.getHeight());
        System.out.println(h2.getHeight());

        Human h3 = new Human(198);
        System.out.println(h3.getHeight());

    }
}
