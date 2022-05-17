package casestudy.models.facility;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double expense;
    private int people;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double area, double expense, int people, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.expense = expense;
        this.people = people;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setName(String name) {
        this.serviceName = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", expense=" + expense +
                ", people=" + people +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
