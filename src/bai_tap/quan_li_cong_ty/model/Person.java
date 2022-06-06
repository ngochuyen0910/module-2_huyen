package bai_tap.quan_li_cong_ty.model;

public abstract class Person {
    private String id;
    private String employeeCode;
    private String name;
    private String dateOfBirth;
    private String address;


    public Person() {
    }

    public Person(String id, String employeeCode, String name, String dateOfBirth, String address) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "PersonService{" +
                "id='" + id + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
