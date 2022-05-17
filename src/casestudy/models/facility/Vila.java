package casestudy.models.facility;

public class Vila extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberFloor;

    public Vila(String name, double area, double expense, int people, String rentalType, String roomStandard, double poolArea, int numberFloor) {
        super(name, area, expense, people, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Vila{" +
                super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
