package pai_tap_lon.models;


public class NhanVienCongNhat extends Persons {
    private double numberOfWorkdays;

    public NhanVienCongNhat() {
    }

    public NhanVienCongNhat(String name, String dayOfBirthday, String address) {
        super(name, dayOfBirthday, address);
    }

    public NhanVienCongNhat(String name, String dayOfBirthday, String address, double numberOfWorkdays) {
        super(name, dayOfBirthday, address);
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public double getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(double numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    @Override
    public String toString() {
        return "NhanVienCongNhat : " +
                super.toString() +
                ", numberOfWorkdays=" + numberOfWorkdays;

    }

    @Override
    public double salarys() {
        return numberOfWorkdays * 12000;
    }

}
