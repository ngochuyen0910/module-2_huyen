package pai_tap_lon.models;

import pai_tap_lon.service.IPersonIService;
import pai_tap_lon.service.IService;

public class NhanVienQuanLy extends Persons implements IPersonIService {
    private double salary;
    private int coefficientsSalary;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(double salary, int coefficientsSalary) {
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public NhanVienQuanLy(String name, String dayOfBirthday, String address, double salary, int coefficientsSalary) {
        super(name, dayOfBirthday, address);
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(int coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy : " +
                super.toString() +
                ", coefficientsSalary=" + coefficientsSalary;

    }

    @Override
    public double salarys() {
        return this.salary * this.coefficientsSalary;
    }

    @Override
    public String keepingTime() {
        return " Đã chấm công ";
    }
}
