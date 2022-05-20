package ss12_java_collection_framework.pai_tap.product.model;

public class Products {
    private int id;
    private String nameProduct;
    private double price;

    public Products() {
    }

    public Products(int id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

//     @Override
//    public int compareTo(Products o) {
//         if (this.getId() > o.getId()) {
//             return 1;
//         } else if(this.getId() < o.getId()){
//             return -1;
//
//         }else {
//             return 1;
//         }
}


