package Composition;

public class Garage {
    private int height;
    private int width;
    private int length;

    public Garage(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.format("Garage sizes H, W, L is %d, %d, %d meters", height, width, length);
    }
}
