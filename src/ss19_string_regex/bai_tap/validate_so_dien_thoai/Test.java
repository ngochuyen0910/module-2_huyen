package ss19_string_regex.bai_tap.validate_so_dien_thoai;

public class Test {
    private static NumberPhone numberPhone;
    public static final String[] validNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        numberPhone = new NumberPhone();
        for (String number : validNumber) {
            boolean isvalid = numberPhone.validate(number);
            System.out.println("Number Phone: " + number + " is valid: " + isvalid);
        }
        for (String number : invalidNumber) {
            boolean isvalid = numberPhone.validate(number);
            System.out.println("Number Phone: " + number + " is valid: " + isvalid);
        }
    }
}
