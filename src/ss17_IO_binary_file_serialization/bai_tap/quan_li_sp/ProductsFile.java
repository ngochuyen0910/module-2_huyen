package ss17_IO_binary_file_serialization.bai_tap.quan_li_sp;

import java.io.Serializable;

public class ProductsFile implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String production;
    private double price;

    public ProductsFile() {
    }

    public ProductsFile(int idProduct, String nameProduct, String production, double price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.production = production;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductsFile{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", production='" + production + '\'' +
                ", price=" + price +
                '}';
    }
}

