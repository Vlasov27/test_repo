package ru.inno.oop;

public class Human {
    // fields, поля, определяет состояние объекта
    boolean isWorker;
    private double height;
    private int age;

    // Methods, методы, функции и процедуры внутри класса
    // они определяют поведение объекта
    Human() {
        this.isWorker = false;
        this.height = 170;
        this.age = 0;
        System.out.println("Объект инициализирован");
    }

    Human(double height) {
        this.height = height;
        this.age = 0;
        System.out.println("Объект инициализирован");
    }

    Human(double height, int age) {
        this.height = height;
        this.age = age;
        System.out.println("Объект инициализирован");
    }

    void grow(double value) {
        height += value;
    }

    void relax() {
        isWorker = false;
    }

    void work() {
        isWorker = true;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Недопустимое значение возраста, по умолчанию - 0");
        }

        }
    public double getHeight() {
        return this.height;
    }

    public void setHeight ( double height) {
        this.height = height;
    }

}
