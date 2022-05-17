package casestudy.models.preson;

public class Customer extends Person {
    private int customerCode;
    private String customerType;
    private String address;

    public Customer(String name, int dateOfBirth, boolean gender, int identityCard, int phoneNumber, String mail, int customerCode, String customerType, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, mail);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "customerCode=" + customerCode +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

