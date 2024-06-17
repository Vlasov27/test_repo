package testing;

public class Main2 {
    public static void main(String[] args) {

        Human Mixa = new Human(167, true, 34);
        Human Lexa = new Human(170, true, 36);
        Human Sasha = new Human(180, true, 25);
        Human Roma = new Human(165, true, 65);
        Human Nail = new Human(167, true, 12);
        Human Paha = new Human(166, true, 54);

        int ages[] = new int[100];
        Human humans[] = {Mixa, Lexa, Sasha, Roma, Nail, Paha};

        for (int i = 0; i < humans.length; i++) {
            int currentAge = humans[i].getAge();
            ages[currentAge]++;

            System.out.println(humans[i].getAge());
        }
        int i = 0;

        System.out.println();

    }

}
