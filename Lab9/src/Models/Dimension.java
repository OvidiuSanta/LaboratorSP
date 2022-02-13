package Models;

public class Dimension {
    private int height;
    private int width;

    //constructor
    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void print() {
        System.out.println("Models.Dimension:" + height + "," + width);
    }
}
