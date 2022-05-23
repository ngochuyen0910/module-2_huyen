package pai_tap_lon.utils;

import pai_tap_lon.models.Persons;
import java.util.Comparator;
// bắt buộc phải sử dụng comparator khi đề bài yêu cầu sắp xếp theo nhiều kiểu.
// như đề này yêu cầu sắp xếp theo lương và sắp xếp theo tên thì bắt buộc phải dùng comparator.

public class ComparatorSalary implements Comparator<Persons> {
    @Override
    public int compare(Persons o1, Persons o2) {
        if (o1.salarys() > o2.salarys()) {
            return 1;
        } else if (o1.salarys() < o2.salarys()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
