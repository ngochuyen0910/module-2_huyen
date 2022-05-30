package ss19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String VALIDATE_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public ValidateNameClass() {
        pattern = Pattern.compile(VALIDATE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
