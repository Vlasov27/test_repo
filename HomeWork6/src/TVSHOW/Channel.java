package TVSHOW;

public class Channel {
private TV tv;
private Program program;
private RemoteController remoteController;
private int chanelName;

    public Channel(int chanelName) {
        this.chanelName = chanelName;
    }

    public int getChanelName() {
        return chanelName;
    }
    public void showTV(TV tv) {
        this.tv = tv;
        this.tv.turnChannel(this);

    }
    public void showProgram (Program program) {
        this.program = program;

    }
}
