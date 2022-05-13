package casestudy.facility;

import casestudy.facility.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberFloor;

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public House(String name, double area, double expense, int people, String rentalType, String roomStandard, int numberFloor) {
        super(name, area, expense, people, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;

    }
}
