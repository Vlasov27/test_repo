package bulder;

public class Box {
    private int a;
    private int b;

    private Box(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static Box creat(int a, int b){
        return new Box(a,b);
    }
}
