package pai_tap_lon.models;

public abstract class Persons {
    private String name;
    private String dayOfBirthday;
    private String address;

    public Persons() {
    }

    public Persons(String name, String dayOfBirthday, String address) {
        this.name = name;
        this.dayOfBirthday = dayOfBirthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dayOfBirthday='" + dayOfBirthday + '\'' +
                ", address='" + address + '\'' + ",salary: " + salarys();

    }

    // phải có abstract vì class con mới có thể ghi đè được,
    // và ghi đè tất các phương thức của lớp con
    public abstract double salarys();

}
