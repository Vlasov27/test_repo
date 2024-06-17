package ru.inno.procedures;


public class MainProceduresStile {
    public static void main(String[] args) {
        Human andrei = new Human();
        Human Pasha = new Human();
        work(andrei);
        work(Pasha);
        System.out.println(andrei.isWorker);
        System.out.println(Pasha.isWorker);
    }

    public static void work(Human human) {
        human.isWorker = true;
    }
}
