package Composition;

public class Roof {
    private double height;
    private String material;

    public Roof(double height, String material) {
        this.height = height;
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return String.format("Roof height is %2f, Material is %s",height,material);
    }
}
