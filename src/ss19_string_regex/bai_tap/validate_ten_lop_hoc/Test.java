package ss19_string_regex.bai_tap.validate_ten_lop_hoc;

public class Test {
    private static ValidateNameClass validateNameClass;
    private static final String[] validName = new String[]{"C0318G"};
    private static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        validateNameClass = new ValidateNameClass();
        for (String name : validName) {
            boolean isvalid = validateNameClass.validate(name);
            System.out.println("Name is: " + name + " is valid: " + isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = validateNameClass.validate(name);
            System.out.println("Name is: " + name + " is valid: " + isvalid);
        }
    }
}
