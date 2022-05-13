package casestudy.facility;

import casestudy.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String name, double area, double expense, int people, String rentalType, String freeService) {
        super(name, area, expense, people, rentalType);
        this.freeService = freeService;

    }
}
