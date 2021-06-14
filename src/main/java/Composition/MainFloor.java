package Composition;

public class MainFloor {
    private int rooms;
    private int window_s;
    private boolean bathroom;
    private boolean toilet;

    public MainFloor(int rooms, int window_s, boolean bathroom, boolean toilet) {
        this.rooms = rooms;
        this.window_s = window_s;
        this.bathroom = bathroom;
        this.toilet = toilet;
    }

    public boolean isBathroom() {
        return bathroom;
    }

    public boolean isToilet() {
        return toilet;
    }

    public int getRooms() {
        return rooms;
    }

    public int getWindow_s() {
        return window_s;
    }

    @Override
    public String toString() {
        System.out.println("");
        return String.format("Main floor has %d rooms ,%d Windows, %b bathroom, %b toilet",rooms,window_s,bathroom,toilet);
    }
}
