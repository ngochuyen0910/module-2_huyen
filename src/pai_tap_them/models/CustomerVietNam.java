package pai_tap_them.models;

public class CustomerVietNam extends Customer {
    private String customerType;
    private double consumptionNorms;


    public CustomerVietNam() {
    }

    @Override
    public String getInfo() {
        return getIdCustomer() + "," + getName() + "," +
                getCustomerType() + "," + getConsumptionNorms();
    }

    public CustomerVietNam(String idCustomer, String name, String customerType, double consumptionNorms) {
        super(idCustomer, name);
        this.customerType = customerType;
        this.consumptionNorms = consumptionNorms;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getConsumptionNorms() {
        return consumptionNorms;
    }

    public void setConsumptionNorms(double consumptionNorms) {
        this.consumptionNorms = consumptionNorms;
    }

    @Override
    public String toString() {
        return "CustomerVietNam{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                ", consumptionNorms=" + consumptionNorms +
                '}';
    }
}
