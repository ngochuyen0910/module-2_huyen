package bai_tap.quan_li_cong_ty.model;

public class ManagementStaff extends Person {
    private double wage;
    private double coefficientsSalary;

    public ManagementStaff() {
    }

    public ManagementStaff(String id, String employeeCode, String name, String dateOfBirth, String address, double wage, double coefficientsSalary) {
        super(id, employeeCode, name, dateOfBirth, address);
        this.wage = wage;
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getEmployeeCode()
                , super.getName()
                , super.getDateOfBirth()
                , super.getAddress()
                , this.getWage()
                , this.getCoefficientsSalary()
                ,"2");
    }

    @Override
    public String toString() {
        return "ManagementStaff{" +
                super.toString() +
                "wage=" + wage +
                ", coefficientsSalary=" + coefficientsSalary +
                '}';
    }
}
