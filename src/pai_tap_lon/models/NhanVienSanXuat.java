package pai_tap_lon.models;

public class NhanVienSanXuat extends Persons {
    private int productNumber;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(String name, String dayOfBirthday, String address, int productNumber) {
        super(name, dayOfBirthday, address);
        this.productNumber = productNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat : " +
                super.toString() +
                ", productNumber=" + productNumber;

    }

    @Override
    public double salarys() {
        return productNumber * 50000;
    }

}
