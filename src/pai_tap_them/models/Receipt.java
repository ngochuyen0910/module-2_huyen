package pai_tap_them.models;

public class Receipt {
    private String idReceipt;
    private String idCustomer;
    private String invoiceDate;
    private double amount;
    private double unitPrice;
    private double money;

    public Receipt() {
    }

    public Receipt(String idReceipt, String idCustomer, String invoiceDate, double amount, double unitPrice, double money) {
        this.idReceipt = idReceipt;
        this.idCustomer = idCustomer;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.money = money;
    }

    public String getIdReceipt() {
        return idReceipt;
    }

    public void setIdReceipt(String idReceipt) {
        this.idReceipt = idReceipt;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "idReceipt='" + idReceipt + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", amount=" + amount +
                ", unitPrice=" + unitPrice +
                ", money=" + money +
                '}';
    }
}
