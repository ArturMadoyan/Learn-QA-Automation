package Composition;

public class Sauna {
    private int temperature;
    private int squareMeter;
    private String material;

    public Sauna(int temperature, int squareMeter, String material) {
        this.temperature = temperature;
        this.squareMeter = squareMeter;
        this.material = material;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public String getMaterial() {
        return material;
    }
    @Override
    public String toString(){
        return String.format("Sauna temperature is %d, Square meter is %d, Material is %s",temperature,squareMeter,material);
    }
}

