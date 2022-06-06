package bai_tap.quan_li_cong_ty.model;

public class ProductionStaff extends Person {
    private int productNumber;
    private double price;

    public ProductionStaff() {
    }

    public ProductionStaff(String id, String employeeCode, String name, String dateOfBirth, String address, int productNumber, double price) {
        super(id, employeeCode, name, dateOfBirth, address);
        this.productNumber = productNumber;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getEmployeeCode()
                , super.getName()
                , super.getDateOfBirth()
                , super.getAddress()
                , this.getProductNumber()
                , this.getPrice()
                , "1");
    }

    @Override
    public String toString() {
        return "ProductionStaff{" +
                super.toString() +
                "productNumber=" + productNumber +
                ", price=" + price +
                '}';
    }
}
