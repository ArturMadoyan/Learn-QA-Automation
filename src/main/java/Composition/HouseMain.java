package Composition;

public class HouseMain {
    public static void main(String[] args) {

        MainFloor mainFloor = new MainFloor(3,8,true,true);
        Roof roof = new Roof(2.30,"Latun");
        Basement basement = new Basement("monolit",4);
        Garage garage = new Garage(3,3,5);
        Sauna sauna = new Sauna(80,10,"wooden");
        Communication communication = new Communication("4G internet",true);
        communication.payInternet();
        House house = new House("Villa",basement,mainFloor,roof,garage,communication,sauna);
        house.makeSauna();
        System.out.println(house.toString());
        System.out.println(house.getCommunication());
        System.out.println(garage.toString());
        System.out.println(sauna.toString());
    }
}
