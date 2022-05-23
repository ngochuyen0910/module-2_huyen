package pai_tap_lon.service.Impl;

import pai_tap_lon.models.NhanVienCongNhat;
import pai_tap_lon.models.NhanVienQuanLy;
import pai_tap_lon.models.NhanVienSanXuat;
import pai_tap_lon.models.Persons;
import pai_tap_lon.service.IPersonIService;

import java.util.LinkedHashMap;

import java.util.Map;

public class PersonServiceImplMap implements IPersonIService {
    private static Map<Integer, Persons> personsMap = new LinkedHashMap<>();

    static {
        personsMap.put(546, new NhanVienQuanLy("Huy", "9/10/1997", "Dn", 12000, 2));
        personsMap.put(123, new NhanVienSanXuat("Lan", "9/7/1998", "Dn", 4));
        personsMap.put(908, new NhanVienCongNhat("An", "8/10/1990", "Hn", 12));
    }

    @Override
    public void display() {
        for (Map.Entry<Integer, Persons> element : personsMap.entrySet()) {
            System.out.println("MNV " + element.getKey() + "Thông tin nhân viên" + element.getValue());
        }
    }


    @Override
    public void displayNhanVienQuanLy() {
    }

    @Override
    public void displayNhanVienCongNhat() {
    }

    @Override
    public void displayNhanVienSanXuat() {
    }

    @Override
    public void sort() {
    }

    @Override
    public void sortGiam() {
    }

    @Override
    public void sortName() {

    }
}
