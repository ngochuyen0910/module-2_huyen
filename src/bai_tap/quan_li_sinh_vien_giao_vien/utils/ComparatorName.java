package bai_tap.quan_li_sinh_vien_giao_vien.utils;

import bai_tap.quan_li_sinh_vien_giao_vien.model.Person;

import java.util.Comparator;

public class ComparatorName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}