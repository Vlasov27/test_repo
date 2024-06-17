package ru.inno.procedures;

public class Human {
    // fields, поля, определяет состояние объекта
    boolean isWorker;
    double height;

    // Methods, методы, функции и процедуры внутри класса
    // они определяют поведение объекта
    void grow(double value) {
        height += value;
    }

    void relax() {
        isWorker = false;
    }

    void work() {
        isWorker = true;
    }
}
