package pai_tap_lon.models;

import pai_tap_lon.service.IPersonIService;

public class NhanVienSanXuat extends Persons implements IPersonIService {
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

    @Override
    public String keepingTime() {
        return " Đã chấm công ";
    }
}
