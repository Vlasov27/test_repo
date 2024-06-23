package ru.inno.statics;

public class Main1 {
    public static void main(String[] args) {
        SomeClass anObject1 = new SomeClass();
        anObject1.b = 5;
        anObject1.a = 16;
        SomeClass anObject2 = new SomeClass();
        anObject2.b = 10;
        anObject2.a = 17;
        SomeClass anObject3 = new SomeClass();
        anObject3.b = 15;
        anObject3.a = 20;

        System.out.println(anObject1.b + " " + anObject1.a);
        System.out.println(anObject2.b + " " + anObject2.a);
        System.out.println(anObject3.b+ " " + anObject3.a);

    }
}
