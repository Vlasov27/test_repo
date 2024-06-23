package ru.inno.statics;

public class Main2 {
    public static void main(String[] args) {
        SomeClass anObject1 = new SomeClass();
        anObject1.b = 5;

        SomeClass anObject2 = new SomeClass();
        anObject2.b = 10;

        SomeClass anObject3 = new SomeClass();
        anObject3.b = 15;
       // SomeClass.a = 35;
        anObject2.someMethod();
        System.out.println(anObject1.b + " " + SomeClass.a + " " + SomeClass.c);
        System.out.println(anObject2.b + " " + SomeClass.a);
        System.out.println(anObject3.b+ " " + SomeClass.a);
        System.out.println(SomeClass.MAX_AGE);
    }
}
