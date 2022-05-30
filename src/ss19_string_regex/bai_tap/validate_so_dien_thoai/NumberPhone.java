package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER_REGEX = "^[(]\\d{2}[)][-][(]0\\d{9}[)]$";

    public NumberPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
