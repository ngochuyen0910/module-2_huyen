package casestudy.preson;

public class Employee extends Preson{
    private int number;
    private String level;
    private String location;

    public Employee(String name, int dateOfBirth, boolean gender, int identityCard, int phoneNumber, String mail, int number, String level, String location) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, mail);
        this.number = number;
        this.level = level;
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
