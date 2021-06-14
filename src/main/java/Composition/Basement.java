package Composition;

public class Basement {
    private String wallMaterial;
    private int smallWindow;

    public Basement(String wallMaterial, int smallWindow) {
        this.wallMaterial = wallMaterial;
        this.smallWindow = smallWindow;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public int getSmallWindow() {
        return smallWindow;
    }

    @Override
    public String toString() {
        return String.format("Basement wall material is: %s , Small window count is: %d", wallMaterial, smallWindow, "\n");

    }
}
