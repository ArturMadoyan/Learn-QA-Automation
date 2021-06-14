package Composition;

public class House {
    private String name;
    private Basement basement;
    private MainFloor mainFloor;
    private Roof roof;
    private Garage garage;
    private Communication communication;
    private Sauna sauna;

    public House(String name, Basement basement, MainFloor mainFloor, Roof roof, Garage garage, Communication communication, Sauna sauna) {
        this.name = name;
        this.basement = basement;
        this.mainFloor = mainFloor;
        this.roof = roof;
        this.garage = garage;
        this.communication = communication;
        this.sauna = sauna;
    }

    public Communication getCommunication(){
    return this.communication;
    }
    public void makeSauna(){
        System.out.println("making sauna");
    }


    @Override
    public String toString() {
        return String.format("House name is %s, %s, %s,%s,%s,%s,%s", name,"\n",basement,"\n",mainFloor,"\n",roof,"\n",garage,"\n",communication,"\n",sauna);
    }
}
