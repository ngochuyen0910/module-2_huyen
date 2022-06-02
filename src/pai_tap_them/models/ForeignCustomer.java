package pai_tap_them.models;

public class ForeignCustomer extends Customer {
    private String nationality;

    public ForeignCustomer() {
    }

    @Override
    public String getInfo() {
        return getIdCustomer() + "," + getName() + "," + getNationality();
    }

    public ForeignCustomer(String idCustomer, String name, String nationality) {
        super(idCustomer, name);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "ForeignCustomer{" +
                super.toString() +
                "nationality='" + nationality + '\'' +
                '}';
    }
}
