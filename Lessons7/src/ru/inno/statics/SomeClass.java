package ru.inno.statics;

import java.util.Random;

public class SomeClass {

    public static final int MAX_AGE = 100;
    public int b;
    static int a;
    static int c;
    // статическое поле - глобальная переменная
    static {
        Random random = new Random();
        a = random.nextInt(100);
        c = random.nextInt(1000);
    }
    public void someMethod() {
        this.b = 777;
        a = 888;

    }

}
