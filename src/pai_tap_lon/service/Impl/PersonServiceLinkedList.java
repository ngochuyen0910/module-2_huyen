package pai_tap_lon.service.Impl;

import pai_tap_lon.models.NhanVienCongNhat;
import pai_tap_lon.models.NhanVienQuanLy;
import pai_tap_lon.models.NhanVienSanXuat;
import pai_tap_lon.models.Persons;
import pai_tap_lon.service.IPersonIService;

import java.util.LinkedList;
import java.util.List;
// Nếu công ty thêm hay xóa nhân viên thì nên sử dụng Linked list, vì khi muốn thêm hay xóa
// thì chỉ cần gắt liên kết của node và thêm hay xóa phần tử mà mình muốn.
// linked list là thêm và xóa phần tử nhanh hơn array list, còn truy xuất
// phần tử thì chậm hơn array list.
// array list thì truy xuất phần tử nhanh hơn linked list, còn thêm và xóa phần tử thì chậm hơn

public class PersonServiceLinkedList implements IPersonIService {
    public static List<Persons> personsList = new LinkedList<>();

    static {
        personsList.add(new NhanVienQuanLy("Huy", "9/10/1997", "Dn", 12000, 2));
        personsList.add(new NhanVienSanXuat("Lan", "9/7/1998", "Dn", 4));
        personsList.add(new NhanVienCongNhat("An", "8/10/1990", "Hn", 12));
    }

    @Override
    public void display() {
        for (Persons persons : personsList)
            System.out.println(persons);
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
