package TVSHOW;

public class Main {
    public static void main(String[] args) {

        TV tv = new TV("Samsung");
        RemoteController remoteController = new RemoteController();

        Channel chl1 = new Channel(1);
        Channel chl2 = new Channel(2);
        Channel chl3 = new Channel(3);
        Channel chl4 = new Channel(4);
        Channel chl5 = new Channel(5);
        Channel chl6 = new Channel(6);

        chl1.showTV(tv);
        chl2.showTV(tv);
        chl3.showTV(tv);
        chl4.showTV(tv);
        chl5.showTV(tv);
        chl6.showTV(tv);

        Program pr1 = new Program("Lets get merried");
        Program pr2 = new Program("Hi Andrew");
        Program pr3 = new Program("Stars");
        Program pr4 = new Program("Footbal");
        Program pr5 = new Program("The Emperor's treasures");
        Program pr6 = new Program("Stars in Africa");

        pr1.showTV(tv);
        pr2.showTV(tv);
        pr3.showTV(tv);
        pr4.showTV(tv);
        pr5.showTV(tv);
        pr6.showTV(tv);

        chl1.showProgram(pr1);
        chl2.showProgram(pr2);
        chl3.showProgram(pr3);
        chl4.showProgram(pr4);
        chl5.showProgram(pr5);
        chl6.showProgram(pr6);

        pr1.showChannel(chl1);
        pr2.showChannel(chl2);
        pr3.showChannel(chl3);
        pr4.showChannel(chl4);
        pr5.showChannel(chl5);
        pr6.showChannel(chl6);
        tv.go();

    }

}
