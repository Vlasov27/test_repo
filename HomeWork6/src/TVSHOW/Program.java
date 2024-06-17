package TVSHOW;

public class Program {
    private Channel channel;
    private TV tv;
    private RemoteController remoteController;
    private String theNameProgram;

    public Program(String theNameProgram) {
        this.theNameProgram = theNameProgram;
    }

    public String getTheNameProgram() {
        return theNameProgram;
    }

    public void showTV(TV tv) {
        this.tv = tv;
        this.tv.turnProgram(this);
    }

    public void showChannel(Channel channel) {
        this.channel = channel;

    }
}
