package ru.inno.oop;

public class MainIncapculationDemo {
    public static void main(String[] args) {

        Human h1 = new Human(176, 36);
        Human h2 = new Human(154, 36);
        Human h3 = new Human(167, 43);
        Human h4 = new Human(177, 36);
        Human h5 = new Human(189, 44);
        Human h6 = new Human(168, 43);
        Human h7 = new Human(196, 44);
        int ages[] = new int [100];

        Human humans[] =  {h1, h2, h3, h4, h5, h6, h7};
        for (int i = 0; i < humans.length; i++) {
            ages[humans[i].getAge()]++;
        }
        int i = 0;
    }
}
