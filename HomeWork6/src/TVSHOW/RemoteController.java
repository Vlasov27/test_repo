package TVSHOW;

public class RemoteController {

    private TV tv;

    public void turnChannel(TV tv) {
        this.tv = tv;
        this.tv.switchChannel(this);
    }
    public void swith() {
    this.tv.go();
    }
}
