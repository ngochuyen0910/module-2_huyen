package bai_tap.quan_li_sinh_vien_giao_vien.model;

public class Student extends Person {
    private int studentCode;
    private double point;

    public Student() {
    }

    public Student(String id, String name, String gender, String dateOfBirth, String address, int studentCode, double point) {
        super(id, name, gender, dateOfBirth, address);
        this.studentCode = studentCode;
        this.point = point;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getName()
                , super.getGender()
                , super.getDateOfBirth()
                , super.getAddress()
                , this.getStudentCode()
                , this.getPoint());
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "studentCode=" + studentCode +
                ", point=" + point +
                '}';
    }
}
