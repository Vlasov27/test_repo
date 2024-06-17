package TVSHOW;

import java.util.Scanner;

public class TV {
    private Channel channel;
    private Program program;
    private RemoteController remoteController;
    private String theNameTV;
    private Channel[] cl;
    private Program[] pr;
    private int countChahnel;
    private int countProgram;

    public TV(String theNameTV) {
        this.theNameTV = theNameTV;
        this.cl = new Channel[10];
        this.pr = new Program[10];
    }

    public String getTheNameTV() {
        return theNameTV;
    }

    public void turnChannel(Channel channel) {
        this.cl[countChahnel] = channel;

        this.countChahnel++;


    }

    public void turnProgram(Program program) {
        this.pr[countProgram] = program;
        this.countProgram++;
    }

    public void switchChannel(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public void go() {

        System.out.println("Телевизор " + this.getTheNameTV() + " включился");

        for (int i = 0; i < countChahnel; i++) {
            for (int j = i; j < countProgram; j++) {

                System.out.println("Введите номер канала");
                Scanner scanner = new Scanner(System.in);
                i = scanner.nextInt();
                if (i == 1) {
                    System.out.println(pr[0].getTheNameProgram());
                } else if (i == 2) {
                    System.out.println(pr[1].getTheNameProgram());
                } else if (i == 3) {
                    System.out.println(pr[2].getTheNameProgram());

                } else if (i == 4) {
                    System.out.println(pr[3].getTheNameProgram());
                } else if (i == 5) {
                    System.out.println(pr[4].getTheNameProgram());

                } else if (i == 6) {
                    System.out.println(pr[5].getTheNameProgram());

                }//

                //  System.out.println(pr[j].getTheNameProgram());
            }

        }
    }
}


