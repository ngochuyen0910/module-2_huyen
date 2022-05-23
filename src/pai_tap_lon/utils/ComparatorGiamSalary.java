package pai_tap_lon.utils;

import pai_tap_lon.models.Persons;

import java.util.Comparator;

public class ComparatorGiamSalary implements Comparator<Persons> {
    @Override
    public int compare(Persons o1, Persons o2) {
        if (o1.salarys() < o2.salarys()) {
            return 1;
        } else if (o1.salarys() > o2.salarys()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) < 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) > 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
