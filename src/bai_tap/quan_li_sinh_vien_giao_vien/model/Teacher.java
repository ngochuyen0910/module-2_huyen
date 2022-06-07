package bai_tap.quan_li_sinh_vien_giao_vien.model;

public class Teacher extends Person {
    private String teachingClass;
    private double wage;
    private double teachingHours;

    public Teacher() {
    }

    public Teacher(String id, String name, String gender, String dateOfBirth, String address, String teachingClass, double wage, double teachingHours) {
        super(id, name, gender, dateOfBirth, address);
        this.teachingClass = teachingClass;
        this.wage = wage;
        this.teachingHours = teachingHours;
    }

    public String getTeachingClass() {
        return teachingClass;
    }

    public void setTeachingClass(String teachingClass) {
        this.teachingClass = teachingClass;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getName()
                , super.getGender()
                , super.getDateOfBirth()
                , super.getAddress()
                ,this.getTeachingClass()
                ,this.getWage()
                ,this.getTeachingHours());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "teachingClass='" + teachingClass + '\'' +
                ", wage=" + wage +
                ", teachingHours=" + teachingHours +
                '}';
    }
}
