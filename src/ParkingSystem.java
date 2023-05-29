/**
 1603. Design Parking System
 @author Brisa Castillo
 @version 23 April 2023 16:53 BOT
 */
public class ParkingSystem {
    private int[] slots = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;
    }

    public boolean addCar(int carType) {
        //Check if there's slots available
        if(slots[carType-1] > 0)
            slots[carType-1]--;
        else
            return false;
        return true;
    }

}
